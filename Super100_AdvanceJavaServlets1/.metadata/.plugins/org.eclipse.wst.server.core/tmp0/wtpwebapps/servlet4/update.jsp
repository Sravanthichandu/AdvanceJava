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
<%  String data = request.getParameter("loginEmail") ;
if(data!=null)
{
	User userdto = (User)request.getAttribute("recordData");
	if(userdto!=null){
%>
 <form action="edit" method="post">
 <input name="loginEmail" value="<%= data%>" hidden="true">
   <label for="Name">Name : </label>
   <input type="text" id = "Name" name="name" >
   <br><br>
   <label for="Email">Email : </label>
   <input type="email" id = "Email"  name="email" value="<%= userdto.getEmail()%>" readonly="readonly">
   <br><br>
   <label for="password">Password:</label>
   <input type="password" id="password" name="pwd" value="<%= userdto.getPwd()%>">
   <br><br>
   <label for="Phone">PhoneNumber :</label>
   <input type="tel" id="Phone" name="phone" value="<%= userdto.getPhonenumber()%>">
   <br><br>
   <label>Age : </label>
   <input type="number" name="age" value="<%=  userdto.getAge()%>">
   <br><br>
   <label for="gender">Gender :</label>
   <label>Male</label>
   <input type="radio" value="male" name="gender" >
   <label>Female</label>
   <input type="radio" value="female" name="gender">
   <label>Others</label>
   <input type="radio" value="others" name="gender">
   <br><br>
   <input type="submit" value="Update">
   
   </form>
   <%}} %>
</body>
</html>