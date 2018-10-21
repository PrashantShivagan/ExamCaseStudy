package com.emp.dto;

public class Exam {
	private String name;
	private int id;
	private double salary;
	private String pName;
	
	public Exam(String name,double salary, String pName) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
		this.pName = pName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	@Override
	public String toString() {
		return "Exam [name=" + name + ", salary=" + salary
				+ ", pName=" + pName + "]";
	}
	
}
