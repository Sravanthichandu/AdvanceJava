package servlet2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/save")
public class SignUp extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		String name = req.getParameter("name");
	    String email = req.getParameter("email");
	    String gender = req.getParameter("gender");
	    long phone = Long.parseLong(req.getParameter("phone"));
	    int age = Integer.parseInt(req.getParameter("age"));
	    String pwd = req.getParameter("pwd");
	    
	    System.out.println("name :"+name+"email :"+email+"Phonenumber :"+phone+"age :"+age );
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/servletdb";
			String user = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement ps =con.prepareStatement(("insert into savingdata values (?,?,?,?,?,?)"));
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setLong(3,phone );
			ps.setInt(4,age);
			ps.setString(5,gender);
			ps.setString(6, pwd);
			ps.execute();
			ps.close();
			con.close();
			System.out.println("Inserted");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
