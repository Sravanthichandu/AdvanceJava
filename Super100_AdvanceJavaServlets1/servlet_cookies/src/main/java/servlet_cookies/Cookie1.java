package servlet_cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Cookie1  extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		System.out.println(name+ " " +email);
		Cookie cookie = new Cookie("cookieName",name);
		Cookie cookie1 =  new Cookie("cookieEmail",email);
		cookie1.setMaxAge(5);
		resp.addCookie(cookie);
		resp.addCookie(cookie1);
		
		req.getRequestDispatcher("home.html").forward(req, resp);
	}

}
