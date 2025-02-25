package servlet4.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet4.dao.UserDao;
import servlet4.dto.User;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Email =req.getParameter("email");
		System.out.println("recorded email : " + Email);
	    String loginEmail = req.getParameter("loginEmail");
	    System.out.println("loginEmail : " + loginEmail);
	    UserDao dao = new UserDao();
	    
	    try {
			User recordData=dao.fetchByEmail(Email);
			if(recordData!=null)
			{
				req.setAttribute("recordData", recordData);
				req.getRequestDispatcher("update.jsp").forward(req,resp);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
