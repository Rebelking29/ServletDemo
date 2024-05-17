package com.urlrewriting;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login1")
public class Login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		if(pass.equals("admin")) {
			resp.getWriter().print("Login Successfully\s" + email);
			resp.getWriter().print("<br><br><a href='profile1?email='" + email + ">Profile</a>");
		}else {
			resp.getWriter().print("Please enter valid Password");
			req.getRequestDispatcher("Login.html").include(req, resp);
		}
	}	
   

}
