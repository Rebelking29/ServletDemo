package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Student;
import com.util.DBConnection;

public class Studentdaoimpl implements StudentDao {
	
	Connection connection;
	PreparedStatement ps;
	ResultSet rs;
	// String query;
	int row;
	

	@Override
	public boolean addStudent(Student std) {
		
		try {
			
			connection = DBConnection.getConnection();
			
			ps = connection.prepareStatement("insert into students (name,email,mobile,branch) values(?,?,?,?)");
			ps.setString(1, std.getStudnetName());
			ps.setString(2, std.getStudentEmail());
			ps.setString(3, std.getStudentMobile());
			ps.setString(4, std.getStudentBranch());
			
			row = ps.executeUpdate();
			
			if(row>0) {
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

	@Override
	public boolean deleteStudent(int rollno) {

		try {
			
			connection = DBConnection.getConnection();
			ps = connection.prepareStatement("delete from students where rollno = ?");
			ps.setInt(1, rollno);
			row = ps.executeUpdate();
			if(row>0) {
				return true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return false;
	}

	@Override
	public List<Student> showStudents() {
		
		List<Student> attendance = new ArrayList<Student>();
		
		try {
			
			connection = DBConnection.getConnection();
			ps = connection.prepareStatement("select * from students");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Student student = new Student();
				student.setStudentrollno(rs.getInt(1));
				student.setStudnetName(rs.getString(2));
				student.setStudentEmail(rs.getString(3));
				student.setStudentMobile(rs.getString(4));
				student.setStudentBranch(rs.getString(5));
				
				
				attendance.add(student);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return attendance;
	}

	@Override
	public boolean updateStudent(Student std) {
		
		try {
			
			connection = DBConnection.getConnection();
			ps = connection.prepareStatement("update students set name=?, email=?, mobile=? , branch=? where rollno=? ");
			
			ps.setString(1, std.getStudnetName());
			ps.setString(2, std.getStudentEmail());
			ps.setString(3, std.getStudentMobile());
			ps.setString(4, std.getStudentBranch());
			ps.setInt(5, std.getStudentrollno());
			
			int row=ps.executeUpdate();
			
			if(row >0) {
				return true;
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return false;
	}

	@Override
	public Student searchStudent(int rollno) {
		
		Student std1 = null;
		try {
			
			connection = DBConnection.getConnection();
			ps = connection.prepareStatement("select * from students where rollno = ?");
			ps.setInt(1, rollno);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				std1 = new Student();
				std1.setStudentrollno(rs.getInt(1));
				std1.setStudnetName(rs.getString(2));
				std1.setStudentEmail(rs.getString(3));
				std1.setStudentMobile(rs.getString(4));
				std1.setStudentBranch(rs.getString(5));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return std1;
	}

}
