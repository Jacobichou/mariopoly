<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/foundation.min.css" media="screen" title="no title" charset="utf-8">
<link rel="stylesheet" href="css/normalize.css" media="screen" title="no title" charset="utf-8">
<link rel="stylesheet" href="css/styles.css" media="screen" title="no title" charset="utf-8">
<title>YOU WON!!!!</title>
</head>
<body class="winrar">
		<div class="row">
		<div class="large-12 columns text-center"><%= request.getAttribute("winnerName") %></div>
		</div>
</body>
</html>