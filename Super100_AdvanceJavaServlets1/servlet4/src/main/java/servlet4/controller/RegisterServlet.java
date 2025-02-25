package servlet4.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet4.dao.UserDao;
import servlet4.dto.User;

@WebServlet("/save")
public class RegisterServlet extends HttpServlet {


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	

		UserDao dao = new UserDao();
		String name = req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String email = req.getParameter("email");
		String password = req.getParameter("pwd");
		String gender = req.getParameter("gender");
		long phone = Long.parseLong(req.getParameter("phone"));
		try {
			dao.save(new User(name, email, phone, age, gender, password));
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req,res);
			
		} catch (Exception e) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("signup.jsp");
			dispatcher.include(req,res);
		}
		
	}
}
