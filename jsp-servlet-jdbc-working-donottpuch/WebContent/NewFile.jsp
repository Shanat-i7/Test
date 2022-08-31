<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style type="text/css">
	body{
	    background-color: lightblue;
		text-align: center;
	}
	table {
		margin-left: 15%;
		min-width: 70%; 
		border: 1px solid #CCC;
		border-collapse: collapse;
	}
	table tr{line-height: 30px;}
	table tr th { background: #000033; color: #FFF;}
	table tr td { border:1px solid #CCC; margin: 5px;}
	input[type=text], input[type=email], input[type=tel]{
		min-width: 60%;
	}
	input[type=submit], a{
		background: green;
		padding: 5px;
		margin: 5px;
		color: #FFF;
	}
	a{
		text-decoration: none;	
	}
</style>

 <h1>Insert Values.!</h1>
	<c:url value="/customer/register" var="registerUrl" />
	<form action="${registerUrl}" method="post">
		<table>
		    <tr><th>mobile</th><td colspan="1"><input type="text"  name="mobile"></td></tr>
			<tr><th>player</th><td colspan="1"><input type="text"  name="player"></td></tr>
			<tr><th>bat</th><td colspan="1"><input type="text"  name="bat"></td></tr>
		    <tr><th>age</th><td colspan="2"><input type="text"  name="age"></td></tr>
			<tr><td colspan="2"><input type="submit" value="Save"></td></tr>
		</table>
	</form>
</body>
</html>