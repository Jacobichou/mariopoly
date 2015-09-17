<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <meta http-equiv="refresh" content="1"> -->
<link rel="stylesheet" href="css/foundation.min.css" media="screen" title="no title" charset="utf-8">
<link rel="stylesheet" href="css/normalize.css" media="screen" title="no title" charset="utf-8">
<link rel="stylesheet" href="css/styles.css" media="screen" title="no title" charset="utf-8">
<title>You are Playing Mario Monopoly</title>
</head>
<body>
	<input id="playerCount" type="hidden" value="">
	<div id="board-container">
		<%-- <img src="images/board.jpg" alt="board" /> --%>
		<%-- <img id="baby" src="images/baby.gif" alt="Baby Yoshi" />
		<img id="coin" src="images/coin.gif" alt="Coin" />
		<img id="dragonCoin" src="images/dragonCoin.png" alt="Dragon Coin" /> --%>
	</div>

	<%-- <input id="loc" type="text" name="loc" value="3"> --%>
	
    <div class="row board-spaces">
    	<h1 id="main-title">Playing Mariopoly</h1>
        <div class="small-1 large-1 columns board-nomansland">
            <button onClick="roll()" type="button">Roll</button>
        </div>
        <div id="space-20" class="small-1 large-1 columns up-space">
        </div>
        <div id="space-21" class="small-1 large-1 columns">
            $220

        </div>
        <div id="space-22" class="small-1 large-1 columns chance-space">

        </div>
        <div id="space-23" class="small-1 large-1 columns">
            $220

        </div>
        <div id="space-24" class="small-1 large-1 columns">
            $240

        </div>
        <div id="space-25" class="small-1 large-1 columns">
            $200

        </div>
        <div id="space-26" class="small-1 large-1 columns">
           $200

        </div>
        <div id="space-27" class="small-1 large-1 columns">
            $200

        </div>
        <div id="space-28" class="small-1 large-1 columns">
            $150

        </div>
        <div id="space-29" class="small-1 large-1 columns">
            $280

        </div>
        <div id="space-30" class="small-1 large-1 columns go-to-jail-space">
        </div>
    </div>

    <!-- MIDDLE  -->

    <div class="row board-spaces">
        <div class="small-1 large-1 columns board-nomansland">
            
        </div>
        <div id="space-19" class="small-1 large-1 columns">
            $200

        </div>
        <div class="small-9 large-9 columns text-center board-center">
            
        </div>
        <div id="space-31" class="small-1 large-1 columns">
            $300

        </div>
    </div>

    <div class="row board-spaces">
        <div class="small-1 large-1 columns board-nomansland">
            
        </div>
        <div id="space-18" class="small-1 large-1 columns">
            $180

        </div>
        <div class="small-9 large-9 columns text-center board-center">

        </div>
        <div id="space-32" class="small-1 large-1 columns">
            $300

        </div>
    </div>

    <div class="row board-spaces">
        <div class="small-1 large-1 columns board-nomansland">
            
        </div>
        <div id="space-17" class="small-1 large-1 columns chest-space">

        </div>
        <div class="small-9 large-9 columns text-center board-center">

        </div>
        <div id="space-33" class="small-1 large-1 columns chest-space">

        </div>
    </div>

    <div class="row board-spaces">
        <div class="small-1 large-1 columns board-nomansland">
            
        </div>
        <div id="space-16" class="small-1 large-1 columns">
            $180

        </div>
        <div class="small-9 large-9 columns text-center board-center">

        </div>
        <div id="space-34" class="small-1 large-1 columns">
            $320

        </div>
    </div>

    <div class="row board-spaces">
        <div class="small-1 large-1 columns board-nomansland">
            
        </div>
        <div id="space-15" class="small-1 large-1 columns">
            $200

        </div>
        <div class="small-9 large-9 columns text-center board-center">

        </div>
        <div id="space-35" class="small-1 large-1 columns">
            $200

        </div>
    </div>

    <div class="row board-spaces">
        <div class="small-1 large-1 columns board-nomansland">
            
        </div>
        <div id="space-14" class="small-1 large-1 columns">
            $160

        </div>
        <div class="small-9 large-9 columns text-center board-center">

        </div>
        <div id="space-36" class="small-1 large-1 columns chance-space">
           

        </div>
    </div>

    <div class="row board-spaces">
        <div class="small-1 large-1 columns board-nomansland">
            
        </div>
        <div id="space-13" class="small-1 large-1 columns">
            $140

        </div>
        <div class="small-9 large-9 columns text-center board-center">

        </div>
        <div id="space-37" class="small-1 large-1 columns">
            $330

        </div>
    </div>

    <div class="row board-spaces">
        <div class="small-1 large-1 columns board-nomansland">
            
        </div>
        <div id="space-12" class="small-1 large-1 columns">
            $150

        </div>
        <div class="small-9 large-9 columns text-center board-center">

        </div>
        <div id="space-38" class="small-1 large-1 columns">
            $120

        </div>
    </div>

    <div class="row board-spaces">
        <div class="small-1 large-1 columns board-nomansland">
            
        </div>
        <div id="space-11" class="small-1 large-1 columns">
            $140

        </div>
        <div class="small-9 large-9 columns text-center board-center">

        </div>
        <div id="space-39" class="small-1 large-1 columns">
            $400

        </div>
    </div>

    <!-- END MIDDLE -->

    <div class="row board-spaces">
        <div class="small-1 large-1 columns">
            <p id="test"></p>
        </div>
        <div id="space-10" class="small-1 large-1 columns jail-space">
        </div>
        <div id="space-9" class="small-1 large-1 columns">
            $120
        </div>
        <div id="space-8" class="small-1 large-1 columns">
            $100
        </div>
        <div id="space-7" class="small-1 large-1 columns chance-space">
        </div>
        <div id="space-6" class="small-1 large-1 columns">
            $100
        </div>
        <div id="space-5" class="small-1 large-1 columns">
            $200
        </div>
        <div id="space-4" class="small-1 large-1 columns">
            TAX $200
        </div>
        <div id="space-3" class="small-1 large-1 columns">
            $60
        </div>
        <div id="space-2" class="small-1 large-1 columns chest-space">
        </div>
        <div id="space-1" class="small-1 large-1 columns">
            $60
        </div>
        <div id="space-0" class="small-1 large-1 columns go-space">
            <img id="baby" src="images/baby.gif" alt="Baby Yoshi" />
    		<img id="coin" src="images/coin.gif" alt="Coin" />
    		<img id="dragonCoin" src="images/dragonCoin.gif" alt="Dragon Coin" />
    		<img id="feather" src="images/feather.gif" alt="Feather" />
    		<img id="fireFlower" src="images/fireFlower.gif" alt="Fire FLower" />
    		<img id="star" src="images/star.gif" alt="Star" />
        </div>
    </div>

    <script src="js/vendor/jquery.js" charset="utf-8"></script>
    <script src="js/foundation.min.js" charset="utf-8"></script>
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
	
	var val;// = {"round":1, "players":[]};
	function getInfo(){
		if(request.readyState==4){
			val=request.responseText;
			document.getElementById('test').innerHTML=val;
		}
	}

	function getParameterByName(name) {
	    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
	    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
	        results = regex.exec(location.search);
	    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
	}

	function move()
	{
		var obj = jQuery.parseJSON(val);
		console.log(obj);
		
		var tokens = [];
		var oj = obj.players;
	
		if(!(oj[0].player1 === 'undefined')){
			console.log(oj[0].player1.token);
			tokens.push(oj[0].player1.token);
		}
		if(!(oj[1].player2 === 'undefined')){
			console.log(oj[1].player2.token);
			tokens.push(oj[1].player2.token);
		}
		if(!(oj[2].player3 === 'undefined')){
			console.log(oj[2].player3.token);
			tokens.push(oj[2].player3.token);
		}
		
			$("#"+oj[0].player1.token).remove();
			$('#space-'+oj[0].player1.position).prepend('<img id="' + tokens[0] + '" src="images/' + tokens[0] + '.gif" />');
			
			$("#"+oj[1].player2.token).remove();
			$('#space-'+oj[1].player2.position).prepend('<img id="' + tokens[1] + '" src="images/' + tokens[1] + '.gif" />');
			
			$("#"+oj[2].player3.token).remove();
			$('#space-'+oj[2].player3.position).prepend('<img id="' + tokens[2] + '" src="images/' + tokens[2] + '.gif" />');

		//$("#"+obj.player2.token).remove();
		//$('#space-'+obj.player2.position).prepend('<img id="' + obj.player2.token + '" src="images/' + obj.player2.token + '.gif" />');
	}
	
	function roll()
	{
		sendInfo();
		move();
	}

</script>

<script type="text/javascript">
	 //setInterval(sendInfo(),3500);
	 setTimeout(function(){roll()},3000)
</script>

</body>
</html>
