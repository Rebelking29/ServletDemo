package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class LoginControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String name = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		if(pass.equals("admin")) {
			response.getWriter().print("Welcome " + name);
		}
		else {
			response.getWriter().print("Invalid Password");
			request.getRequestDispatcher("login.html").include(request, response);
		}
	}

	

}
