<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd" >
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en" >
<head>
<title>{{module}}</title>
<link rel="stylesheet" href="simple_layout.css" type="text/css" />
<link rel="stylesheet" href="jquery.autocomplete.css" type="text/css" />
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="jquery.autocomplete.js"></script>

</head>
<body>
<div id="pagewidth" >
	<div id="header"><h2>{{module}}</h2> <p>{{description}}</p></div>

	<div id="wrapper" class="clearfix">
		<div id="maincol">
			<h3>Input</h3>
			<p>
			<div id="interface">
				<div id="input"></div>
				<input type="button" name="intButton" value="Run" id="runButton"/>	
			</div>
			<div id="result" style="font-style:bold;"></div>
			<div id="help"></div>
			</p>
		</div>
		<div id="leftcol">
			<div id="optionset">
				<h3>Options</h3>
				<p>
					<label>Module name:</label><br />
					<input id="autocomplete_proxy" type='text' /><br />
					<input type="button" name="intButton" value="Toggle help" id="helpButton"/><br />
					<input type="button" name="intButton" value="OK" id="proxyButton"/>	
				</p>
			</div>
			<div id="optionset">
				<h3>Method</h3>
				<p>
					<div id="hide">
						<label>Choose a method to run:</label><br />
						<input id="autocomplete_method" type='text' />
					</div>
				</p>
			</div>
			<div id="optionset">
				<h3>Accept:</h3>
				<input type="button" name="intButton" value="Generate UI" id="ok"/>	
			</div>
			<br />
			<div id="error"></div>
		</div>
	</div>
</div>

<script type="text/javascript">
function getNumberOfArguments(proxyname, method) {
	var xmlHttp = null;
    xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", "{{nargs}}/"+proxyname+"/"+method, false );
    xmlHttp.send( null );
    return xmlHttp.responseText;
}

function buildInterface(proxyname, method) {
	var xmlHttp = null;
    xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", "{{interface}}/"+proxyname+"/"+method, false );
    xmlHttp.send( null );
    return xmlHttp.responseText;
}

function getMethodListHtml(proxyname) {
	var xmlHttp = null;
    xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", "{{htmllist}}/"+proxyname, false );
    xmlHttp.send( null );
    return xmlHttp.responseText;
}

function getMethodList(proxyname) {
	var xmlHttp = null;
    xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", "{{list}}/"+proxyname, false );
    xmlHttp.send( null );
    return xmlHttp.responseText.split(",");
}

function runCommand(proxyname, method, params) {
    var xmlHttp = null;
    xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", "{{run}}/"+proxyname+"/"+method+"/"+params, false );
    xmlHttp.send( null );
    return xmlHttp.responseText;
}

$("#proxyButton").click(function() {
	document.getElementById("error").innerHTML = ""
	var proxyname = $("#autocomplete_proxy").val();
	if (proxyname != "") {
		var s = getMethodList(proxyname);
		if (s == "") {
			document.getElementById("error").innerHTML = "This module does not exist!";
			$('#hide').hide();
		} else {
			$("#autocomplete_method").autocomplete(s);
			$('#hide').show();
		}
	} else {
		document.getElementById("error").innerHTML = "You need to choose a module name!";
		$('#hide').hide();
	}
});

$("#ok").click(function() {
  // no error on startup
  document.getElementById("error").innerHTML = ""
  
  var proxyname = $("#autocomplete_proxy").val();
  var method = $("#autocomplete_method").val();

  if (proxyname != "") {
	if (method != "") {
		// show the interface for the selected method
		document.getElementById("input").innerHTML = buildInterface(proxyname, method);
		document.getElementById("result").innerHTML = ""
		$('#interface').show();
	} else {
		document.getElementById("error").innerHTML = "You need to choose a method!";
		$('#interface').hide();
	}
  } else {
	document.getElementById("error").innerHTML = "You need to choose a module name!";
	$('#interface').hide();
  }
});

function drawHelp() {
	document.getElementById("error").innerHTML = ""
	var proxyname = $("#autocomplete_proxy").val();
	if (proxyname != "") {
		document.getElementById("help").innerHTML = "<br />" + getMethodListHtml(proxyname);
	} else {
		document.getElementById("error").innerHTML = "You need to choose a module name!";
	}
}

$("#helpButton").click(function() {
	if (document.getElementById("help").innerHTML == "") {
		drawHelp();
		$('#help').show();
	} else {
		if (document.getElementById("help").innerHTML == "<b>This module is not available.</b>") {
			drawHelp();
			$('#help').show();
		} else {
			drawHelp();
			$('#help').toggle();
		}
	}
});

function quoteUrl(url) {
    safe = '/"';
	
    url = encodeURIComponent(url);

    // Unescape characters that were in the safe list
    toUnencode = [  ];
    for (var i = safe.length - 1; i >= 0; --i) {
        var encoded = encodeURIComponent(safe[i]);
        if (encoded !== safe.charAt(i)) {    // Ignore safe char if it wasn't escaped
            toUnencode.push(encoded);
        }
    }

    url = url.replace(new RegExp(toUnencode.join('|'), 'ig'), decodeURIComponent);

    return url;
}

$("#runButton").click(function() {
	// start the method remotely and show return value
	params = "";
	var proxyname = $("#autocomplete_proxy").val().replace(new RegExp(" ", "g"), "");
	var method = $("#autocomplete_method").val();
	
	var n = parseInt(getNumberOfArguments(proxyname, method));
	
	for(var x=1; x<=n; x++) {
		params += = $("#input"+x).val() + ",";
	}	
	if (params != "")
		params = params.substring(0, params.length-1);
		params = quoteUrl(params);
	else {
		params = "()"
	}
	document.getElementById("result").innerHTML = runCommand(proxyname, method, params);
});

$(document).ready(function() {
	$('#hide').hide();
	$('#interface').hide();
	
	$("#autocomplete_proxy").autocomplete({{proxies}});
});
</script>

</body>
</html>