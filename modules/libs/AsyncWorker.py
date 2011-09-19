import threading

class AsyncWorker(threading.Thread):
	'''
	Starts a function in background.
	'''
	def __init__(self, work, args):
		'''
		param work: a function object
		param args: argument(s) for work
		'''
		threading.Thread.__init__(self)        
		self.work = work
		self.args = args

	def run(self):
		self.work(self.args)