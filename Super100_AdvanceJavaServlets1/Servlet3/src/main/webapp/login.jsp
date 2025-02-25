<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>

<form action="login" method="post">

<% String message=(String)request.getAttribute("msg");if(message!=null){%>

<h3 style="color:red;"><%=message %></h3>

<%} %>

email:<input type="text" placeholder="enter your email" name="email"><br><br>

password:<input type="text" placeholder="enter your pwd" name="pwd"><br><br>

<input type="submit" value="SIGNIN">

</form>

</body>

</html>