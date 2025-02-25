<%@page import="java.util.List"%>
<%@page import="servlet4.dao.UserDao"%>
<%@page import="servlet4.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
User u = (User) request.getAttribute("user"); 
if(u!=null)
{
	UserDao dao = new UserDao();
	
	List<User> list = (List<User>) 
	dao.fetchByAll();



%>

<h2>Welcome 
<%= u.getName() %>
</h2>
<table border="2px solid black">
<tr>
<th>name</th>
<th>email</th>
<th>phone</th>
<th>gender</th>
<th>Update</th>
<th>Delete</th>
</tr>

<%
 if(!list.isEmpty()){
	 for(User u1 : list){
%>

<tr>
<td><%= u1.getName() %></td>
<td><%= u1.getEmail() %></td>
<td><%= u1.getPhonenumber() %></td>
<td><%= u1.getGender() %></td>
<td><a href="update?email=<%= u1.getEmail() %>&loginEmail=<%= u.getEmail()%>"><button>Update</button></a></td>
<td><a href="delete?email=<%= u1.getEmail() %>&loginEmail=<%= u.getEmail()%>"><button>Delete</button></a></td>
</tr>
<% } }%>
</table>
<%
} 
%>
</body>
</html>