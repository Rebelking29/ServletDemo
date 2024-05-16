package com.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/clogin")

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		Cookie ck = new Cookie("email", email);
		
		if(pass.equals("admin")) {
			
			response.addCookie(ck);
			response.getWriter().print("Login Successfull\s" + email);
			
		}else {
			response.getWriter().print("Please Enter Valid Password");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
	}

}
