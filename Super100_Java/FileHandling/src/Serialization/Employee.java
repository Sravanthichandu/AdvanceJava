package Serialization;

import java.io.Serializable;

public class Employee implements Serializable
{

	private String name;
	private int id;
	private String designation;
	private String Location;
	
	public Employee() {
		
	}
	
	public Employee(String name, int id,String designation,String Location) {
		this.name=name;
		this.id=id;
		this.designation=designation;
		this.Location=Location;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}
	
	public void display()
	{
		System.out.println("Name : "+getName());
		System.out.println("Id : "+getId());
		System.out.println("Designation : "+getDesignation());
		System.out.println("Location : "+getLocation());
	}
	
	
}
