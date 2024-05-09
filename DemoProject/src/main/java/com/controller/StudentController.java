package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.Studentdaoimpl;
import com.pojo.Student;


@WebServlet("/stud")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    Studentdaoimpl stdimp = new Studentdaoimpl();

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String name = request.getParameter("stdname");
		String email = request.getParameter("stdemail");
		String mobile = request.getParameter("stdmob");
		String branch = request.getParameter("stdbranch");
		String action = request.getParameter("action");
		
		if(action != null && action.equals("add")) {
			boolean addstudent = stdimp.addStudent(new Student(name, email, mobile, branch));
			
			if(addstudent) {
				response.sendRedirect("stud");
			}else {
				response.getWriter().print("Error While Registraion... :(");
				request.getRequestDispatcher("AddStudent.html").include(request, response);
			}
		}
		
	}

}
