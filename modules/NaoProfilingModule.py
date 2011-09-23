import bottle
import uuid
import time
import threading
from naoqi import ALProxy

app = bottle.Bottle()

name = 'NaoProfilingModule'
path = '/profiling'
sub = []

processes = {}
# This proxy is used to gain access to all
# sensor values of the Nao through NaoQi
memProxy = ALProxy("ALMemory", "localhost", 9559)

@app.route('/')
@app.route('/index.html')
def index():
	return "This module has no web interface."

@app.route('/start/:interval/:sensor#.+#')
def start(interval=100, sensor=""):
	'''
	@param interval: in ms
	@param sensor: the sensor you want to use for profiling
	@return: an unique ID for your profiling process. Use this ID to stop
		the profiling using method 'stop'
	'''
	p_id = str(uuid.uuid4())
	list = []
	def profile(args):
		pointer = args['pointer']
		sensor_value = args['sensor_values'] 
		pointer.append({'timestamp':"%.6f" % time.time(), 'value':str(memProxy.getData(sensor_value))})
	worker = StoppableWorker(profile, {'pointer':list, 'sensor_values':sensor}, int(interval))
	processes[p_id] = (worker, list)
	worker.start()	
	return p_id

@app.route('/stop/:id')
def stop(id=""):
	'''
	@param id: the ID of the profiling job you want to stop 
	@return: an JSON object containing the results with time stamps for each result
		It will be empty if the given ID is unknown or if there was not enough time between start and stop to profile anything.
		Format will be: {result:[{timestamp, value}*]}
	'''
	if id in processes.keys():
		worker = (processes[id])[0]
		worker.stop()
		return {'result':(processes[id])[1]}
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