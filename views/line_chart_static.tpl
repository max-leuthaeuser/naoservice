%# we need the jschart script here
<script type="text/javascript" src="jscharts.js"></script>
<h3>{{module}}</h3>
{{description}}
%# the final diagram will be placed in the following div
<div id="chartcontainer">Diagram</div>
<script type="text/javascript">
	%s = ''
	%for elem in values:
	%	s+='['+str(elem[0])+','+str(elem[1])+'],'
	%end;
	%s = s[:-1]
	var myData = new Array({{s}});
	var myChart = new JSChart('chartcontainer', 'line');
	myChart.setTitle('{{module}}');
	myChart.setAxisNameX('{{x_axis}}');
	myChart.setAxisNameY('{{y_axis}}');
	myChart.setDataArray(myData);
	myChart.draw();
</script>