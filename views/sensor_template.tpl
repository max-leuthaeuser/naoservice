<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd" >
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en" >
<head>
<title>{{module}}</title>
<link rel="stylesheet" href="simple_layout.css" type="text/css" />
<link rel="stylesheet" href="jquery.autocomplete.css" type="text/css" />
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="jquery.dualListBox-1.3.min.js"></script>
<script type="text/javascript" src="jquery.autocomplete.js"></script>

%# we need the highcharts scripts here
<script src="highcharts.js" type="text/javascript"></script>
</head>
<body>
<div id="pagewidth" >
	<div id="header"><h2>{{module}}</h2> <p>{{description}}</p></div>

	<div id="wrapper" class="clearfix">
		<div id="maincol">
			<h3>Result</h3>
			<p>
			<div id="result"></div>
			<div id="viz" style="font-style:italic"></div>
			<div id="int" style="font-style:italic;color:gray;"></div><br />
			<div id="diagram"></div>
			</p>
		</div>
		<div id="leftcol">
			<ul class="tabs">
				<li><a href="#tab1">Single Value</a></li>
				<li><a href="#tab2">Multiple Values</a></li>
			</ul>
			
			<div class="tab_container">
				<div id="tab1" class="tab_content">
					<div id="optionset">
						<b>Options</b><br />
						<label>Sensor type:</label><br />
						<input id="autocomplete_sensor" type='text' />
					</div>
					<div id="optionset">
						<b>Diagram types:</b><br />
						<div>
							Interpret return value as:<br />
							<input type="radio" name="rdio" value="SimpleString"> SimpleString (textual output)<br>
							<input type="radio" name="rdio" value="SimpleValue"> SimpleValue (output as live diagram)
						</div>
						<div id="option">
							<p>
							<label>Interval (in ms)</label><br />
							<input name="interval" title="Please enter a time interval (at least 500 ms)" /><br />
							<label>Representation:</label><br />
							%r = ""
							%for s in types:
							%r+=' '+s+','
							%end
							%r = r[:-1]						
							<input id="autocomplete_types" type='text' title="Supported types:{{r}}"/>						
							</p>
						</div>
					</div>
					<div id="optionset">
						<b>Start query:</b><br />
						<input type="button" name="intButton" value="OK" id="ok"/>	
					</div>
					<br />
					<div id="error"></div>
				</div>
				<div id="tab2" class="tab_content">
					<div id="optionset">
					<b>Select sensors:</b><br />
					<table>
						<tr>
							<td>Filter: <input type="text" id="box1Filter" /><button type="button" id="box1Clear">X</button><br />
							<select id="box1View" multiple="multiple" style="height:200px;width:100%;">
							%id = 0
							%for s in values:
							<option value="{{str(id)}}">{{s}}</option>
							%id = id + 1
							%end
							</select><br/>
							<span id="box1Counter" class="countLabel"></span>
							<select id="box1Storage"></select>
							</td>
						</tr>
						<tr>
							<td>
								<button id="to2" type="button">Add</button>
								<button id="allTo2" type="button">Add all</button>

								<button id="allTo1" type="button">Remove all</button>
								<button id="to1" type="button">Remove</button>
							</td>
						</tr>
						<tr>
							<td>
								Filter: <input type="text" id="box2Filter" /><button type="button" id="box2Clear">X</button><br />
								<select id="box2View" multiple="multiple" style="height:200px;width:100%;">
								</select><br/>
								<span id="box2Counter" class="countLabel"></span>
								<select id="box2Storage">
								</select>
							</td>
						</tr>
					</table>
					<b>Start query:</b><br />
					<button id="runmultiple" type="button">OK</button>					
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
function getMultiple(sensors) {
	var starttime = Math.floor(new Date().getTime()/1000);
	var s = sensors.toString().replace(new RegExp(",", "g"), "+");
    var xmlHttp = null;
    xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", "{{multiple}}/"+s, false );
    xmlHttp.send( null );
    return xmlHttp.responseText + "<br /><i>Query timestamp: </i>" + starttime + "</p>";
}

function checkSensortype(sensortype) {
	var xmlHttp = null;
    xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", "{{check}}/"+sensortype, false );
    xmlHttp.send( null );
    return xmlHttp.responseText == "OK";
}

function getDynamicChart(sensortype) {
    var xmlHttp = null;
    xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", "{{value}}/"+sensortype, false );
    xmlHttp.send( null );
    return xmlHttp.responseText;
}

function getStaticText(sensortype) {
    var xmlHttp = null;
    xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", "{{string}}/"+sensortype, false );
    xmlHttp.send( null );
    return xmlHttp.responseText;
}

// this is the variable we place the chart in later
// it is important to have this globally because we
// want be able to destroy and create a chart dynamically.
var chart;
var intervalId

function removeChart() {
	if (chart) {
		clearInterval(intervalId);
		chart.destroy();
		chart = null;
	}
}

function createChart(sensortype, interval, reptype) {
	chart = new Highcharts.Chart({
      chart: {
         renderTo: 'diagram',
         defaultSeriesType: reptype,
         //marginRight: 10,
         events: {
            load: function() {
               // set up the updating of the chart each second
               var series = this.series[0];
               intervalId = setInterval(function() {
                  var x = (new Date()).getTime() // current time
                  %# We fetch the current value from the python bottle server here:
                  var y = parseFloat(getDynamicChart(sensortype));
                  series.addPoint([x, y], true, true);
               }, interval);
            }
         }
      },
      title: {
         text: 'Live '+sensortype+' data'
      },
      xAxis: {
      	 title: {
            text: 'time'
         },
         type: 'datetime',
         tickPixelInterval: 80
      },
      yAxis: {
         plotLines: [{
            value: 0,
            width: 1,
            color: '#808080'
         }]
      },
      tooltip: {
         formatter: function() {
                   return '<b>'+ this.series.name +'</b><br/>'+
               Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+ 
               Highcharts.numberFormat(this.y, 2);
         }
      },
      legend: {
         enabled: false
      },
      exporting: {
         enabled: false
      },
      series: [{
         name: '{{module}} data',
         data: (function() {
            var data = [],
               time = (new Date()).getTime(),
               i;
                 
            for (i = -10; i <= 0; i++) {
               data.push({
                  x: time + i * parseInt(interval),
                  y: parseFloat(getDynamicChart(sensortype))
               });
            }
            return data;
         })()
      }]
   });
}

$("#runmultiple").click(function() {
	var values = [];
	$('#box2View option').each(function() { 
		values.push( $(this).attr('value') );
	});	
	document.getElementById("result").innerHTML = getMultiple(values);
});

$("#ok").click(function() {
  // no error on startup
  document.getElementById("error").innerHTML = ""
  
  var sensortype = $("#autocomplete_sensor").val();
  var reptype = $("#autocomplete_types").val();
  var diagramtype = $("input[name='rdio']:checked").val();
  var interval = $("input[name='interval']").val();
  
  // sensortype should not be empty
  if (sensortype != "") {
	// diagramtype should not be undefined
	if (diagramtype != null) {
		// which diagramtype?
		if (diagramtype == "SimpleValue") {
			//interval should be valid
			if (!isNaN(interval) && interval>=500 && reptype != "") {
				removeChart();
				if (checkSensortype(sensortype)) {
					createChart(sensortype, interval, reptype);
					document.getElementById("result").innerHTML = sensortype;
					document.getElementById("viz").innerHTML = "Sensor return value represented as: " + diagramtype;
					document.getElementById("int").innerHTML = "Current interval: " + interval + "ms";
				} else {
					document.getElementById("diagram").innerHTML = getStaticText(sensortype);
					document.getElementById("result").innerHTML = sensortype;
					document.getElementById("viz").innerHTML = "Sensor return value represented as: " + diagramtype;
					document.getElementById("int").innerHTML = "";
				}
			} else {			
				document.getElementById("error").innerHTML = "You need to choose a representation type and a valid interval (>=500ms)!";
			}
		} else {
			removeChart();
			document.getElementById("diagram").innerHTML = getStaticText(sensortype);
			document.getElementById("result").innerHTML = sensortype;
			document.getElementById("viz").innerHTML = "Sensor return value represented as: " + diagramtype;
			document.getElementById("int").innerHTML = "";
		}
	} else {
		document.getElementById("error").innerHTML = "You need to choose a diagram type!";
	}
  } else {
	document.getElementById("error").innerHTML = "You need to choose a sensor type!";
  }
});

$("input[name='rdio']").change(function(){
    if ($("input[name='rdio']:checked").val() == 'SimpleString') {
		$('#option').hide();
	}
    else if ($("input[name='rdio']:checked").val() == 'SimpleValue') {
		$('#option').show();
	}
});

$(document).ready(function() {
	$('#option').hide();
	
	$("#autocomplete_sensor").autocomplete({{values}});
	
	$("#autocomplete_types").autocomplete({{types}});
	
	// predefined interval - should be safe even if the Nao is stressed.
	$("input[name='interval']").val("2000");
	// predefined representation typ
	$("#autocomplete_types").val("spline");
	
	$(".tab_content").hide(); //Hide all content
	$("ul.tabs li:first").addClass("active").show(); //Activate first tab
	$(".tab_content:first").show(); //Show first tab content

	//On Click Event
	$("ul.tabs li").click(function() {
		$("ul.tabs li").removeClass("active"); //Remove any "active" class
		$(this).addClass("active"); //Add "active" class to selected tab
		$(".tab_content").hide(); //Hide all tab content

		var activeTab = $(this).find("a").attr("href"); //Find the href attribute value to identify the active tab + content
		$(activeTab).fadeIn(); //Fade in the active ID content
		return false;
	});
	
	$(function() {
		$.configureBoxes();
	});
});

Highcharts.setOptions({
   global: {
      useUTC: false
   }
});
</script>

</body>
</html>