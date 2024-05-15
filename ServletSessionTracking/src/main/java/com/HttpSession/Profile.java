package com.HttpSession;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/profile")
public class Profile extends HttpServlet {

	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		
		
		HttpSession session = req.getSession();
		
		String email = (String) session.getAttribute("email");
		
		if(email != null) {
			
			resp.getWriter().print("Welcome to Profile 		"+email);
			
		}else {
			resp.getWriter().print("Please Login First");
			req.getRequestDispatcher("login.html").include(req, resp);
			
		}
		
		
	}
}
