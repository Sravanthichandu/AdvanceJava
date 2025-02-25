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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		try {
			UserDao dao = new UserDao();
			User userdto = dao.fetchByEmail(email);
			System.out.println(userdto);
			if (userdto != null) {
				if (userdto.getPwd().equals(pwd)) {
					System.out.println(dao.fetchByAll());
					req.setAttribute("user", userdto);
					RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
					dispatcher.forward(req, res);
				} else {
					req.setAttribute("msg2", "pwd is invalid");
					RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
					dispatcher.include(req, res);

				}
			} else {
				req.setAttribute("msg1", "email is not found in our database");
				RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
				dispatcher.include(req, res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}