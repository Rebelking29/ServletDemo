package com.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/cprofile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		Cookie [] c = request.getCookies();
		String email = null;
		boolean access = false;
		
		
		for (Cookie cookie : c) {
			if (cookie != null) {
				email = cookie.getValue();
				if(email != null && email != "") {
					System.out.println("Email= "+email);
					access = true ;
					break;
				}
			}
		}
		
		
		if(access) {
			
			response.getWriter().print("Welcome To Profile\s" + email);
			
		}else {
			response.getWriter().print("Please Login First");
			request.getRequestDispatcher("Login.html").include(request, response);
		}
		
		
	}

}
