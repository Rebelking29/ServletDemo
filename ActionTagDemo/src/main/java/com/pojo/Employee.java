package com.pojo;

import java.io.Serializable;

public class Employee implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int e_id;
	private String name;
	private String des;
	private float salary;
	
	public Employee() {
		super();
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
}
