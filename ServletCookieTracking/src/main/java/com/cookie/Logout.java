package com.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		Cookie [] c = request.getCookies();
		
		if(c!= null) {
			
			Cookie ck = new Cookie("email", null);
			response.addCookie(ck);
			ck.setMaxAge(0);
			response.getWriter().print("Logout Successfully");
			
		}else {
			response.getWriter().print("Please Login First");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
	}

}
