<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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
	<form>
		<table>
			<tr>
				<th>mobile</th>
				<th>player</th>
				<th>bat</th>
				<th>age</th>
			</tr>
			<c:forEach items="${empData}" var="showmydata">
				<tr>
					<td>${showmydata.mobile}</td>
					<td>${showmydata.player}</td>
					<td>${showmydata.bat}</td>
					<td>${showmydata.age}</td>
					<td><c:url value="/PreupdateServlt" var="updateAction" />
						<form action="${updateAction}" method="post">

							<input type="hidden" name="mobile" value="${showmydata.mobile}">
							<input type="hidden" name="player" value="${showmydata.age}">
							<input type="hidden" name="bat" value="${showmydata.player}">
							<input type="hidden" name="age" value="${showmydata.bat}">


							<input type="submit" value="updatemydata">
						</form></td>
					<td><c:url value="/deleteDataServlet/delete"
							var="deleteAction" />
						<form action="${deleteAction}" method="post">

							<input type="hidden" name="mobile" value="${showmydata.mobile}">
							<input type="submit" value="deletemydata">
						</form></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>