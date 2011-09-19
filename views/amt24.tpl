<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd" >
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en" >
<head>
<title>Nao - Amt24</title>
<link rel="stylesheet" href="simple_layout.css" type="text/css" />
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="jquery.corner.js"></script>
</head>
<body>
<div id="index_header">
	<p>
		<img src="amt24.png" style="width:45%;"></img>
		<img src="nao.png" height="21%" width="21%" style="float:right;margin:0 10px 10px 10px;"></img>
	</p>
</div>
<div id="index_main" style="height:200px">
	<h3>Geben Sie ihr gesuchtes Stichwort ein,<br/> Chuck wird das Ergebnis vorlesen!</h3>
	<table>
	<tr>
	<td><input id="input" type="text" class="rounded_input" style="width: 300px;"/></td>
	<td><input type="button" value="OK" id="startButton" style="width: 60px;"/></td>
	</tr>
	<tr>
	<td><br /><div id="result" style="font-size:110%;"></div></td>
	</tr>
	</table>
</div>
<div style="color:gray;align:center;font-size:70%;">
	<p>
		2011 - Max Leuthaeuser<br />
		Licenced under GPL3<br />
		<a href="http://code.google.com/p/naoservice/">Google Code Project</a>
	</p>
</div>
</body>
<script>
$("#startButton").click(function() {
	if ($('#input').val() != "") {
		$.ajax({
			url: "{{path}}/" + $('#input').val(),
			type: "GET",
			success: function(data) {
					document.getElementById("result").innerHTML = data
			}
		});
	}
});

function roundInput(input_id, container_class, border_class){
	var input = $('#'+input_id+'');
	var input_width = input.css("width"); //get the width of input
	var wrap_width = parseInt(input_width) + 10; //add 10 for padding
	wrapper = input.wrap("<div class='"+container_class+"'></div>").parent();
	wrapper.wrap("<div class='"+border_class+"' style='width: "+wrap_width+"px;'></div>"); //apply border
	wrapper.corner("round 8px").parent().css('padding', '2px').corner("round 10px"); //round box and border
}
 
/* round 2 inputs */
$(function(){
	roundInput('input','rounded_container','rounded_border');
});
</script>
</html>