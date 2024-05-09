package com.pojo;

public class Student {

	 private int studentrollno;
	 private String studnetName;
	 private String studentEmail;
	 private String studentMobile;
	 private String studentBranch;
	 
	 
	public String getStudnetName() {
		return studnetName;
	}
	public void setStudnetName(String studnetName) {
		this.studnetName = studnetName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	public int getStudentrollno() {
		return studentrollno;
	}
	public void setStudentrollno(int studentrollno) {
		this.studentrollno = studentrollno;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public Student() {
		super();
		
	}
	public Student( String studnetName, String studentEmail, String studentMobile,
			String studentBranch) {
		super();
		this.studnetName = studnetName;
		this.studentEmail = studentEmail;
		this.studentMobile = studentMobile;
		this.studentBranch = studentBranch;
	}
	
	
		
	
	

	
	
	 
	 
	
}
