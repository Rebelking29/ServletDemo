package com.urlrewriting;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/logout1")
public class Logout1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String email = request.getParameter("email");
		if(email != null) {
			response.getWriter().print("Logout Successfully\s" + email);
			response.getWriter().print("<br><br><a href='profile1?email='" + "" + ">Profile</a>");
		} else {
			response.getWriter().print("Please Login First");
			request.getRequestDispatcher("Login.html").include(request, response);
		}
	}

}
