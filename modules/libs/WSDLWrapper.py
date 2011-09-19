import sys
sys.path.append('modules/libs/suds')

import logging
from suds import WebFault
from suds.client import Client
from suds.wsse import Security, UsernameToken


class AuthWSDLWrapper:
	def __init__(self, name, passwd, debug=False):
		self.client_cache = {}
		self.name = name
		self.passwd = passwd
		if debug:
			logging.basicConfig(level=logging.INFO)
			logging.getLogger('suds.client').setLevel(logging.DEBUG)
		
	def client_auth(self, url):
		'''
		Helper method to get an authenticated client on the given URL.
		
		@param url: the URL where we want to get authenticated  
		'''		
		if url and url != '':
			if url in self.client_cache:
				c = self.client_cache[url]
			else:
				try:
					c = Client(url, location=url)
					security = Security()
					token = UsernameToken(self.name, self.passwd)
					security.tokens.append(token)
					c.set_options(wsse=security)
					self.client_cache[url] = c
				except WebFault, f:
					print f
					print f.fault
			return c
		else:
			raise ValueError("Empty name, passwd, url are not allowed!")
		
	def get_for_keyword(self, url, keyword):
		'''
		Make a request to the given URL with the given data.
		'''
		if url and keyword and url != '':
			try:
				c = self.client_auth(url)
				# building the search parameter
				sp = c.factory.create("searchParameterObjectWs")
				sp.alphaBlockModus = False
				sp.hitRestriction = True
				sp.mandantenId = 0
				sp.mandantenIds = 0
				sp.numberOfHits = 2
				sp.regionIds = []
				sp.sprachId = "deu"
				sp.value = keyword
				# building the profil data
				pd = c.factory.create("ProfilDataWs")
				pd.ags = 0
				pd.plz = 0
				pd.sprache = "deu"
				pd.regionIds = []
				pd.mandantenIds = 0
				pd.ortsname = ""
				pd.kategorien = []
				pd.kategorienUndVerknuepfung = False
				# starting the request finally
				return c.service.fullTextSearchAll(sp, pd)
			except WebFault, f:
					print f
					print f.fault
		else:
			raise ValueError("Empty url, keyword are not allowed!")