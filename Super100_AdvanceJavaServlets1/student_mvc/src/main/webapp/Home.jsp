<%@page import="student_mvc.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Login SuccessFull
<% Student s = (Student)request.getAttribute("msg");%>
<%= s %>
</body>
</html>

