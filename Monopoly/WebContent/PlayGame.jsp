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
	<button onClick="sendInfo()" type="button">Boop</button>

    <div class="row">
        <div class="small-1 large-1 columns">
            -
        </div>
        <div id="space-1" class="small-1 large-1 columns">
            1
        </div>
        <div id="space-2" class="small-1 large-1 columns">
            2
            <div class="board-top"></div>
        </div>
        <div id="space-3" class="small-1 large-1 columns">
            3
            <div class="board-top"></div>
        </div>
        <div id="space-4" class="small-1 large-1 columns">
            4
            <div class="board-top"></div>
        </div>
        <div id="space-5" class="small-1 large-1 columns">
            5
            <div class="board-top"></div>
        </div>
        <div id="space-6" class="small-1 large-1 columns">
            6
            <div class="board-top"></div>
        </div>
        <div id="space-7" class="small-1 large-1 columns">
            7
            <div class="board-top"></div>
        </div>
        <div id="space-8" class="small-1 large-1 columns">
            8
            <div class="board-top"></div>
        </div>
        <div id="space-9" class="small-1 large-1 columns">
            9
            <div class="board-top"></div>
        </div>
        <div id="space-10" class="small-1 large-1 columns">
            10
            <div class="board-top"></div>
        </div>
        <div id="space-11" class="small-1 large-1 columns">
            11
        </div>
    </div>

    <!-- MIDDLE  -->

    <div class="row">
        <div class="small-1 large-1 columns">
            -
        </div>
        <div id="space-40" class="small-1 large-1 columns">
            40
            <div class="right board-left"></div>
        </div>
        <div class="small-9 large-9 columns text-center">
            DA MEEDUL
        </div>
        <div id="space-12" class="small-1 large-1 columns">
            12
            <div class="left board-right"></div>
        </div>
    </div>

    <div class="row">
        <div class="small-1 large-1 columns">
            -
        </div>
        <div id="space-39" class="small-1 large-1 columns">
            39
            <div class="right board-left"></div>
        </div>
        <div class="small-9 large-9 columns text-center">
            DA MEEDUL
        </div>
        <div id="space-13" class="small-1 large-1 columns">
            13
            <div class="left board-right"></div>
        </div>
    </div>

    <div class="row">
        <div class="small-1 large-1 columns">
            -
        </div>
        <div id="space-38" class="small-1 large-1 columns">
            38
            <div class="right board-left"></div>
        </div>
        <div class="small-9 large-9 columns text-center">
            DA MEEDUL
        </div>
        <div id="space-14" class="small-1 large-1 columns">
            14
            <div class="left board-right"></div>
        </div>
    </div>

    <div class="row">
        <div class="small-1 large-1 columns">
            -
        </div>
        <div id="space-37" class="small-1 large-1 columns">
            37
            <div class="right board-left"></div>
        </div>
        <div class="small-9 large-9 columns text-center">
            DA MEEDUL
        </div>
        <div id="space-15" class="small-1 large-1 columns">
            15
            <div class="left board-right"></div>
        </div>
    </div>

    <div class="row">
        <div class="small-1 large-1 columns">
            -
        </div>
        <div id="space-36" class="small-1 large-1 columns">
            36
            <div class="right board-left"></div>
        </div>
        <div class="small-9 large-9 columns text-center">
            DA MEEDUL
        </div>
        <div id="space-16" class="small-1 large-1 columns">
            16
            <div class="left board-right"></div>
        </div>
    </div>

    <div class="row">
        <div class="small-1 large-1 columns">
            -
        </div>
        <div id="space-35" class="small-1 large-1 columns">
            35
            <div class="right board-left"></div>
        </div>
        <div class="small-9 large-9 columns text-center">
            DA MEEDUL
        </div>
        <div id="space-17" class="small-1 large-1 columns">
            17
            <div class="left board-right"></div>
        </div>
    </div>

    <div class="row">
        <div class="small-1 large-1 columns">
            -
        </div>
        <div id="space-34" class="small-1 large-1 columns">
            34
            <div class="right board-left"></div>
        </div>
        <div class="small-9 large-9 columns text-center">
            DA MEEDUL
        </div>
        <div id="space-18" class="small-1 large-1 columns">
            18
            <div class="left board-right"></div>
        </div>
    </div>

    <div class="row">
        <div class="small-1 large-1 columns">
            -
        </div>
        <div id="space-33" class="small-1 large-1 columns">
            33
            <div class="right board-left"></div>
        </div>
        <div class="small-9 large-9 columns text-center">
            DA MEEDUL
        </div>
        <div id="space-19" class="small-1 large-1 columns">
            19
            <div class="left board-right"></div>
        </div>
    </div>

    <div class="row">
        <div class="small-1 large-1 columns">
            -
        </div>
        <div id="space-32" class="small-1 large-1 columns">
            32
            <div class="right board-left"></div>
        </div>
        <div class="small-9 large-9 columns text-center">
            DA MEEDUL
        </div>
        <div id="space-20" class="small-1 large-1 columns">
            20
            <div class="left board-right"></div>
        </div>
    </div>

    <!-- END MIDDLE -->

    <div class="row">
        <div class="small-1 large-1 columns">
            <p id="test"></p>
        </div>
        <div id="space-31" class="small-1 large-1 columns">
            31
        </div>
        <div id="space-30" class="small-1 large-1 columns">
            30
        </div>
        <div id="space-29" class="small-1 large-1 columns">
            29
        </div>
        <div id="space-28" class="small-1 large-1 columns">
            28
        </div>
        <div id="space-27" class="small-1 large-1 columns">
            27
        </div>
        <div id="space-26" class="small-1 large-1 columns">
            26
        </div>
        <div id="space-25" class="small-1 large-1 columns">
            25
        </div>
        <div id="space-24" class="small-1 large-1 columns">
            24
        </div>
        <div id="space-23" class="small-1 large-1 columns">
            23
        </div>
        <div id="space-22" class="small-1 large-1 columns">
            22
        </div>
        <div id="space-21" class="small-1 large-1 columns go-space">
            <img id="baby" src="images/baby.gif" alt="Baby Yoshi" />
    		<img id="coin" src="images/coin.gif" alt="Coin" />
    		<img id="dragonCoin" src="images/dragonCoin.png" alt="Dragon Coin" />
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
