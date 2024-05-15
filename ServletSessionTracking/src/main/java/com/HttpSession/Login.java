package com.HttpSession;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/login")

public class Login extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		HttpSession session = req.getSession();
		
		if(pass.equals("admin")) {
			session.setAttribute("email", email);
			System.out.println("Session ID: "+ session.getId());
			resp.getWriter().print("Login Successfully	"+email);
			
		}else {
			resp.getWriter().print("Please enter valid password");
			req.getRequestDispatcher("login.html").include(req, resp);
			
		}
		
		
	}
}
