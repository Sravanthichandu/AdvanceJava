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



@WebServlet("/delete")
public class DeleteServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Email =req.getParameter("email");
		System.out.println("recorded email : " + Email);
	    String loginEmail = req.getParameter("loginEmail");
	    System.out.println("loginEmail : " + loginEmail);
	    UserDao dao = new UserDao();
	    
	    try {
			if(dao.deletebyEmail(Email)>0)
			{
				User user = dao.fetchByEmail(loginEmail);
				if(user!=null)
				{
					req.setAttribute("user",user);
					RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
					dispatcher.forward(req, resp);
				}
				else
				{
					req.setAttribute("msg1", "email is not found in our database boz now itself you deleted");
					RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
					dispatcher.include(req, resp);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
