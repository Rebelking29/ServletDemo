package com.urlrewriting;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/profile1")
public class Profile1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		String email = req.getParameter("email");
		
		if(email!=null && !email.equals("")) {
			resp.getWriter().print("Welcome to Profile\s" + email );
			resp.getWriter().print("<br><br><a href='logout1?email='" + email + ">Logout</a>");
		}else {
			resp.getWriter().print("Please login First");
			req.getRequestDispatcher("Login.html").include(req, resp);
		}
	}
   
}
