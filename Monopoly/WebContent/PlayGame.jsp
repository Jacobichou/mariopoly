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
	<p>WINNER: </p> <%= request.getAttribute("winner") %>
	
	<img id="baby" src="images/baby.gif" alt="Baby Yoshi" />
	<img id="coin" src="images/coin.gif" alt="Coin" />
	<img id="dragonCoin" src="images/dragonCoin.png" alt="Dragon Coin" />
</body>
</html>