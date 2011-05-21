<h3>NaoService</h3>
<b>Installed Modules:</b>
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