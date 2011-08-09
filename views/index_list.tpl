<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd" >
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en" >
	<head>
		<title>NaoService - Index page</title>
		<link rel="stylesheet" href="simple_layout.css" type="text/css" />
	</head>
	<body>
	<div id="index_header">
		<img src="header.jpg" />
	</div>
	<div id="index_main">
		<h3>Installed Modules:</h3>
		<ul>
			%for module in modules:
				%name = module.get_name()
				%path = module.get_path()
				%subpages = module.get_subpages()
				<li>{{name}} (<a href="{{path+'/'}}">{{path+'/'}}</a>)
					<ul>
					%for p in subpages:
						<li><a href="{{path+p}}">{{p}}</a></li>
					%end
					</ul>
				</li>
			%end
		</ul>
	</div>
	<div style="color:gray;align:center;font-size:70%;">
		<p>
			2011 - Max Leuthaeuser<br />
			Licenced under GPL3<br />
			<a href="http://code.google.com/p/naoservice/">Google Code Project</a>
		</p>
	</div>
	</body>
</html>