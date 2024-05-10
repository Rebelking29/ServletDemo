package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
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
			PrintWriter out = response.getWriter();
			if(slist != null) {
				out.print("<html>");
				out.print("<head></head>");
				out.print("<body>");
				out.print("<table border=1><caption><h1>Student List </h1></caption>");
				out.print("<tr><th>RollNo </th> <th>Name </th> <th> Email Id </th> <th> Mobile No </th> <th> Branch </th></tr>");
				
					Iterator<Student> itr = slist.iterator();{
						
						while (itr.hasNext()) {
							Student student = (Student) itr.next();
							out.print("<tr><td>" + student.getStudentrollno() + "</td>");
							out.print("<td>" + student.getStudnetName()+"</td>");
							out.print("<td>" + student.getStudentEmail() + "</td>");
							out.print("<td>" + student.getStudentMobile() +"</td>");
							out.print("<td>" + student.getStudentBranch() +"</td></tr>");
						}
						
					out.print("</table></caption>");
					out.print("<a href = 'AddStudent.html'> Click To Add </a>");
					out.print("</body></html>");
						
						
					}
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
			
			
			int rollno = Integer.parseInt(request.getParameter("rollno"));
			boolean update = stdimp.updateStudent(new Student(name, email, mobile, branch, rollno ));
			
			if(update) {
				response.sendRedirect("stud");
			}else {
				response.getWriter().print("Error While Updating the Data :(");
				request.getRequestDispatcher("UpdateStud.html").include(request, response);
			}
		}
		
	}

}
