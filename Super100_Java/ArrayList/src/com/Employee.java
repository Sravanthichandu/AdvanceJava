package com;

public class Employee {

	private String ename;
	private int id;
	private int salary;
	private String location;
	private String designation;
	
	public Employee()
	{
		
	}
	public Employee(String ename, int id, int salary, String location, String designation) {
		this.ename = ename;
		this.id = id;
		this.salary = salary;
		this.location = location;
		this.designation = designation;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void display()
	{
		System.out.println("Employee Name : "+getEname());
		System.out.println("Employee Id   : "+getId());
		System.out.println("Employee Salary : "+getSalary());
		System.out.println("Employee designation :"+getDesignation());
		System.out.println("Employee Location  :"+getLocation());
	}
	@Override
	public String toString() {
		return "Employee ename=" + ename + ", id=" + id + ", salary=" + salary + ", location=" + location
				+ ", designation=" + designation + "_______________";
	}
	
	
	
}
