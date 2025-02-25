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



email:<input type="text" placeholder="enter your email" name="email"><br><br>
<% String message=(String)request.getAttribute("msg1");if(message!=null){%>

<h3 style="color:red;"><%=message %></h3>

<%} %>

password:<input type="text" placeholder="enter your pwd" name="pwd"><br><br>
<% String message2=(String)request.getAttribute("msg2");if(message2!=null){%>

<h3 style="color:red;"><%=message2 %></h3>

<%} %>

<input type="submit" value="Login">

</form>
<br>
<br>
<a href="signup.jsp">Don't have an Account please signin !</a>
</body>

</html>