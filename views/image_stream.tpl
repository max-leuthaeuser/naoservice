<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd" >
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en" >
<head>
<title>Nao Camera Vision - Project Qualitune</title>
<link rel="stylesheet" href="simple_layout.css" type="text/css" />
<script type="text/javascript" src="jquery.min.js"></script>
</head>
<body>
<div id="pagewidth" >
	<div id="header">
		<p>
			<img src="qualitune.png" style="width:20%;"></img>
			<img src="nao.png" height="12%" width="12%" style="float:right;margin:0 0 10px 10px;"></img>
		</p>
	</div>

	<div id="wrapper" class="clearfix">
		<div id="maincol">
			<h3>Live camera images</h3>
			<p>
			<div><img id="camera" src="" /></div>
			</p>
		</div>
		<div id="leftcol">
			<div id="optionset">
				<h3>Options</h3>
				<p>
					<label>Camera:</label><br />
					<input type="radio" name="camera" value="0" checked="true" id="cam0"> Camera 0 (top camera)<br />
					<input type="radio" name="camera" value="1" id="cam1"> Camera 1 (bottom camera)<br />
					<br />
					<label>Update interval (ms):</label><br />
					<input id="interval" type='text' value="1000"/>
				</p>
			</div>
			<div id="optionset">
				<h3>Accept:</h3>
				<input type="button" id="startButton" value="Start"/>	
				<input type="button" id="stopButton" value="Stop"/>
			</div>
			<br />
			<div id="error"></div>
		</div>
	</div>
</div>
</body>

<script>
var stopRequested = false;
var interval = 1000;
var cam = "0"

function loadImage() {
	if (!stopRequested) {
		$.ajax({
			url: "{{path}}/" + cam,
			type: "GET",
			success: function(data) {
					$("#camera").attr("src", "data:image/jpeg;base64,"+data);
			},
			complete: function() {
				// Previous run complete, schedule the next run
				if (!stopRequested)
					setTimeout(loadImage, interval);
			}
		});
	}
}

$("#startButton").click(function() {
	$('#error').html("");
	interval = parseInt($("#interval").val());
	if (interval < 50) {
		$('#error').html("An interval small than <b>50ms</b> is not allowed.");
	} else {
		stopRequested = false;
		if ($("#cam1:checked").val() == "0")
			cam = "0"
		else
			cam = "1"
		loadImage();
	}
});

$("#stopButton").click(function() {
	stopRequested = true;
});
	
</script>
</html>