<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/styles.css">
<title>You are Playing Mario Monopoly</title>
</head>
<body>
	<img src="images/board.jpg" alt="board" />
	<p>Number of Players: </p> <%= request.getAttribute("playerCount") %>
	<p>Spaces: </p> <%= request.getAttribute("spaces") %>
	${game}
	<br>
	<p id="test"></p>
	<input id="player" type="text" name="player" value="3">
	<button onClick="sendInfo()" type="button">Boop</button>
	
	<img id="baby" src="images/baby.gif" alt="Baby Yoshi" />
	<img id="coin" src="images/coin.gif" alt="Coin" />
	<img id="dragonCoin" src="images/dragonCoin.png" alt="Dragon Coin" />
	
	
	<script>  
	var request;  
	function sendInfo()  
	{  
		var v = document.getElementById("player").value;
		var url="/Monopoly/play?player=" + v;  
		  
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
  
</script> 

<script type="text/javascript">
  setInterval(sendInfo,5000)
</script>

</body>
</html>