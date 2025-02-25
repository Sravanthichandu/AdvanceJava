package servlet_cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class Cookie3 extends HttpServlet
{
       @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String name = req.getParameter("name");
   		String email = req.getParameter("email");
   		System.out.println(name+""+email+ "in delete cookie class..");
   		
   		Cookie[] res = req.getCookies();
		for(Cookie c:res)
		{
			System.out.println(c.getValue()+"in Cookie 3");
		}
    }
	
}
