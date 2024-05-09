package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.dao.Studentdaoimpl;
import com.pojo.Student;


@WebServlet("/stud")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    Studentdaoimpl stdimp = new Studentdaoimpl();

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String action  = request.getParameter("action");
		if(action != null && action.equals("delete")) {
			int temp = Integer.parseInt(request.getParameter("rollno"));
			
			boolean delete = stdimp.deleteStudent(temp);
			
			if(delete) {
				response.sendRedirect("stud");
			}
			
		}else {
			
			List<Student> slist = stdimp.showStudents();
			if(slist != null) {
				response.getWriter().print(slist);
			}else {
				response.getWriter().print("List is empty Please Enter Student Data");
				request.getRequestDispatcher("AddStudent.html").include(request, response);
			}
		}
		
		
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
		
		if(action != null && action.equals("update")) {
			boolean update = stdimp.updateStudent(new Student(name, email, mobile, branch));
			
			if(update) {
				response.sendRedirect("stud");
			}else {
				response.getWriter().print("Error While Updating the Data :(");
				request.getRequestDispatcher("updateStudent.html").include(request, response);
			}
		}
		
	}

}
