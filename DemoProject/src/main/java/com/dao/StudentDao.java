package com.dao;

import java.util.List;

import com.pojo.Student;

public interface StudentDao {

	boolean addStudent(Student std);
	
	boolean deleteStudent(int rollno);
	
	boolean updateStudent(Student std);
	
	Student searchStudent(int rollno);
	
	List<Student> showStudents();
}
