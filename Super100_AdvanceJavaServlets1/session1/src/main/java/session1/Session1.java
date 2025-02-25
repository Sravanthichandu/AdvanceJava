package session1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Session1 extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String name = req.getParameter("name");
		String email = req.getParameter("email");
		System.out.println(name+ " " +email);
		
		//creating httpSession
		HttpSession session = req.getSession();
		
		//we can add any number of objects by using setAttribute in cookies we have to create object for every class
	    session.setAttribute("sessionName",name);
	    session.setAttribute("sessionEmail",email);
	    
	    req.getRequestDispatcher("home.html").forward(req, resp);
	    
    }
}
