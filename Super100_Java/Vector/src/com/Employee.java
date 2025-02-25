package com;

public class Employee {

	private String ename;
	private int id;
	private int salary;
	private String designation;
	private String location;
	
	public Employee()
	{
		
	}
	
	public Employee(String ename, int id, int salary, String designation, String location) {
		this.ename = ename;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
		this.location = location;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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
		return "Employee ename:" + getEname() +"\n" +"Employee id:" + getId() + "\n" +"Employee salary:" +getSalary() +"\n" + "Employee location:" + getLocation()
				+"\n" +"Employee designation : " + getDesignation() ;
	}
	
	
}
