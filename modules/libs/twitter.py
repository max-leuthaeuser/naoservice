import tweepy
import fileinput
import AsyncWorker

class NaoTwitter:
	'''
	Very simple wrapper around tweepy which handles
	oauth2 authentication and updating status.
	'''
	
	'''
	Standard size for twitter messages.
	'''
	SIZE = 140
	
	def __init__(self):
		keys = []
		map(keys.append, [x[:-1] for x in fileinput.input(['twitter.sec'])])
		consumer_token, consumer_secret = keys[0].split(":")
		key, secret = keys[1].split(":")
		auth = tweepy.OAuthHandler(consumer_token, consumer_secret)
		auth.set_access_token(key, secret)
		self.api = tweepy.API(auth)
		
	def split_to_size(self, seq, size=SIZE):
		'''
		Split any sequence to the length of size.
		
		@param seq: the sequence to split
		@param size: the size where you want to split the sequence
		@return: a list with the elements after splitting seq.
		'''
		return [seq[i:i+size] for i in range(0, len(seq), size)]
		
	def update_status(self, text):
		self.api.update_status(text)
		
	def update_status_async(self, text):
		AsyncWorker(self.api.update_status, text).start()
		
class twitterDumpFunction(NaoTwitter):
	'''
	Decorator class to dump function name and arguments to twitter.
	'''
	def __call__(self, func):
		self.func = func
		return self._send_to_twitter
			
	def _send_to_twitter(self, *args,**kwargs):
		r = self.func(*args, **kwargs)
		argnames = self.func.func_code.co_varnames[:self.func.func_code.co_argcount]
		fname = self.func.func_name
		s = "Running method", fname, "with", ', '.join('%s=%r' % entry for entry in zip(argnames,args) + kwargs.items())
		text = self.split_to_size("%s (Return: %s)" %(" ".join(s), str(r)))
		AsyncWorker(lambda t: map(self.update_status, t), text).start()
		return r
