package servlet2;

import java.io.IOException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;



import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class Loginservlet extends HttpServlet {

	@Override

    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException

	{

		System.out.println("mapped");

		String email=req.getParameter("email");

		String pwd=req.getParameter("pwd");

		

		System.out.println(email+""+pwd+"");

	

	

	   try {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdb?createDatabaseIfNotExist=true","root","root");

		PreparedStatement ps=con.prepareStatement("select * from savingdata where email=?");

		ps.setString(1, email);

		ResultSet r=ps.executeQuery();

		if(r.next())

		{

			System.out.println("email found");

			if(r.getString("pwd").equals(pwd))

			{

				System.out.println("login successful");

				req.setAttribute("msg","pwd is mismatch");

				RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp");

			dispatcher.forward(req, res);

//				res.sendRedirect("https://www.w3schools.com/");

     		}

			else

			{

				System.out.println("password incorrect");

				RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");

				dispatcher.include(req, res);

				

			}

		}

		else

		{

			System.out.println("email not found");

			req.setAttribute("msg","email is not found in the data base pls enter valid email");

			RequestDispatcher dispatcher=req.getRequestDispatcher("signin.jsp");

			dispatcher.include(req, res);

		}

	} catch (ClassNotFoundException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

	} catch (SQLException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

	}

	}

}

