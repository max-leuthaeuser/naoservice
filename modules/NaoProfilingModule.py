import bottle
import uuid
import time
import threading
from naoqi import ALProxy
from threading import Thread
from bottle import auth_basic
from NaoService import check_auth

app = bottle.Bottle()

name = 'NaoProfilingModule'
path = '/profiling'
sub = []

processes = {}
# This proxy is used to gain access to all
# sensor values of the Nao through NaoQi
memProxy = ALProxy("ALMemory", "localhost", 9559)

ONE = 0
MULT = 1

@app.route('/')
@app.route('/index.html')
@auth_basic(check_auth)
def index():
	return "This module has no web interface."

def profile(args):
	pointer = args['pointer']
	sensor_value = args['sensor_values'] 
	pointer.append({'timestamp':"%.6f" % time.time(), 'value':str(memProxy.getData(sensor_value))})

@app.route('/start/:interval/:sensor#.+#')
@auth_basic(check_auth)
def start(interval=100, sensor=""):
	'''
	@param interval: in ms
	@param sensor: the sensor you want to use for profiling, use '+' to provide multiple sensors
	@return: an unique ID for your profiling process. Use this ID to stop
		the profiling using method 'stop'
	'''
	p_id = str(uuid.uuid4())
	if sensor.find('+') != -1:
		sensors = sensor.split('+')
		mapping = {}
		workerlist = []
		for s in sensors:
			list = []
			mapping[s] = list
			worker = StoppableWorker(profile, {'pointer':list, 'sensor_values':s}, int(interval))
			workerlist.append(worker)
			worker.start()
		processes[p_id] = (MULT, workerlist, mapping)
	else:	
		list = []
		worker = StoppableWorker(profile, {'pointer':list, 'sensor_values':sensor}, int(interval))
		processes[p_id] = (ONE, worker, list)
		worker.start()	
	return p_id

@app.route('/stop/:id')
@auth_basic(check_auth)
def stop(id=""):
	'''
	@param id: the ID of the profiling job you want to stop 
	@return: an JSON object containing the results with time stamps for each result
		It will be empty if the given ID is unknown or if there was not enough time between start and stop to profile anything.
		Format will be: {result:[{timestamp, value}*]} or the name of the sensor instead of 'result' if you have started the profiling
		with multiple sensors, i.e.: {name:[{timestamp, value}*]*}
	'''
	def cleanup(workerlist):
		for w in workerlist:
			w.join()

	if id in processes.keys():
		if (processes[id])[0] == ONE:
			worker = (processes[id])[1]
			worker.stop()
			worker.join()
			return {'result':(processes[id])[2]}
		else:
			result = {}
			workerlist = (processes[id])[1]
			for w in workerlist:
				w.stop()
			Thread(target=cleanup, args=(workerlist,)).start()
			resultmap = (processes[id])[2]
			for r in resultmap.keys():
				result[r] = resultmap[r]
			return result
	else:
		return {}

class StoppableWorker(threading.Thread):
	'''
	Stoppable thread which allows you to start a function in background which will
	run infinitely until you stop it. You have to define an interval between each run. 
	'''
	def __init__(self, work, args, interval):
		'''
		param work: a function object
		param args: argument(s) for work
		param interval: interval in ms between each call to work
		'''
		threading.Thread.__init__(self)        
		self.work = work
		self.args = args
		self.interval = interval
		self._stop = threading.Event()

	def run(self):
		while(not self.is_stopped()):
			self.work(self.args)
			time.sleep(self.interval / 1000)
		
	def stop(self):
		self._stop.set()
		
	def is_stopped(self):
		return self._stop.isSet()
