<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StudentRegistrationForm</title>
</head>
<body>
     <form action="save" method="post">
       Name : <input type="text" placeholder="Enter your name " name="name">
       <br><br>
       Email : <input type="email" placeholder="Enter your Email" name="email">
       <br><br>
       Password : <input type="password" placeholder="create Password " name="pwd">
       <br><br>
       Phone :<input type="tel" placeholder="Enter your mobile number" name="phone">
       <br><br>
       Address:<input type="text" placeholder="Enter your Address" name="address">
       <br><br>
      <input type="submit" value=" Submit ">
       <br><br>
       AlreadyRegister?<a href="login.jsp">Login</a>
     
     </form>
</body>
</html>