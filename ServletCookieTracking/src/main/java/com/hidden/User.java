package com.hidden;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/user")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		
		out.print("Hello\s" + name);
		
		out.print("<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Home</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "	<form action=\"welcome\">\r\n"
				+ "	\r\n"
				+ "		<input type=\"hidden\" name=\"st\" value="+name+">\r\n"
				+ "		<button type=\"submit\"> Go To Welcome </button>\r\n"
				+ "	\r\n"
				+ "	</form>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
	}

}
