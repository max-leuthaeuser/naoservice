%# we need the highcharts scripts here
<script src="jquery.min.js" type="text/javascript"></script>
<script src="highcharts.js" type="text/javascript"></script>
<h3>{{module}}</h3>
{{description}}
%# the final diagram will be placed in the following div
<div id="container">Diagram</div>
<script type="text/javascript">
function httpGet(theUrl) {
    var xmlHttp = null;
    xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", theUrl, false );
    xmlHttp.send( null );
    return xmlHttp.responseText;
}

Highcharts.setOptions({
   global: {
      useUTC: false
   }
});
   
var chart;
$(document).ready(function() {
   chart = new Highcharts.Chart({
      chart: {
         renderTo: 'container',
         defaultSeriesType: 'spline',
         marginRight: 10,
         events: {
            load: function() {
               // set up the updating of the chart each second
               var series = this.series[0];
               setInterval(function() {
                  var x = (new Date()).getTime() // current time
                  %# We fetch the current value from the python bottle server here:
                  %# var y = Math.random();
                  var y = parseInt(httpGet("{{values}}"));
                  series.addPoint([x, y], true, true);
               }, 2000);
            }
         }
      },
      title: {
         text: 'Live {{module}} data'
      },
      xAxis: {
      	 title: {
            text: '{{x_axis}}'
         },
         type: 'datetime',
         tickPixelInterval: 100
      },
      yAxis: {
         title: {
            text: '{{y_axis}}'
         },
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
                 
            for (i = -19; i <= 0; i++) {
               data.push({
                  x: time + i * 2000,
                  y: parseInt(httpGet("{{values}}"))
               });
            }
            return data;
         })()
      }]
   });
});
</script>