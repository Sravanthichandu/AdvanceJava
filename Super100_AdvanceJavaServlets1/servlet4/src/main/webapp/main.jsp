<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>

login success

<%! String msg="login success"; %>

<% for(int i=0;i<=9;i++){%>

	<h1 style="color:blue;"><%= msg %> </h1> 

	<% }%> 

<% String msg="login successful";

for(int i=0;i<=9;i++){

out.print("<h1 style='color:red;'>" +msg+ "</h1>"); }%>

</body>

</html>