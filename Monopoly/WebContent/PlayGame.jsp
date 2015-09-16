<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <meta http-equiv="refresh" content="1"> -->
<link rel="stylesheet" href="css/styles.css">
<title>You are Playing Mario Monopoly</title>
</head>
<body>
	<input id="playerCount" type="hidden" value="">
	<div id="board-container">
		<img src="images/board.jpg" alt="board" />
		<img id="baby" src="images/baby.gif" alt="Baby Yoshi" />
		<img id="coin" src="images/coin.gif" alt="Coin" />
		<img id="dragonCoin" src="images/dragonCoin.png" alt="Dragon Coin" />
	</div>
	
	<br>
	<p id="test"></p>
	<input id="loc" type="text" name="loc" value="3">
	<button onClick="sendInfo()" type="button">Boop</button>
	
	<button onClick="roll()">Roll</button>
	
	
	
	
	<script> 
	
		document.getElementById("playerCount").value = getParameterByName("playerCount");
	
	var request;  
	function sendInfo()  
	{  
		//var playerCount = document.getElementById("playerCount").value;
		var playerCount = document.getElementById("playerCount").value;
		var url="/Monopoly/play";//?playerCount=" + playerCount; 
		  
		if(window.XMLHttpRequest){  
		request=new XMLHttpRequest();  
	}  
	else if(window.ActiveXObject){  
		request=new ActiveXObject("Microsoft.XMLHTTP");  
	}  
	  
	try{  
		request.onreadystatechange=getInfo;  
		request.open("GET",url,true);  
		request.send();  
		}catch(e){alert("Unable to connect to server");}  
	}  
	  
	function getInfo(){  
		if(request.readyState==4){  
			var val=request.responseText;  
			document.getElementById('test').innerHTML=val;  
		}  
	}
	
	function getParameterByName(name) {
	    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
	    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
	        results = regex.exec(location.search);
	    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
	}
  
</script> 

<script type="text/javascript">
  setInterval(sendInfo,3500)
</script>

</body>
</html>