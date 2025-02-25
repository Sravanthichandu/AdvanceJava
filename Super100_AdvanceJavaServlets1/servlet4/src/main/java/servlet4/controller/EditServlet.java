package servlet4.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet4.dao.UserDao;
import servlet4.dto.User;

@WebServlet("/edit")
public class EditServlet  extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
        String LoginEmail = req.getParameter("loginEmail");
		String name = req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String email = req.getParameter("email");
		String password = req.getParameter("pwd");
		String gender = req.getParameter("gender");
		long phone = Long.parseLong(req.getParameter("phone"));
		User user=new User(name, email, phone, age, gender, password);
		//System.out.println(user);
		//System.out.println("LoginEmail : "+ LoginEmail);
		UserDao dao = new UserDao();
		try {
			if(dao.updateByEmail(user)>0)
			{
			   	try {
					req.setAttribute("user", dao.fetchByEmail("loginEmail"));
					RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
					dispatcher.forward(req, resp);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
