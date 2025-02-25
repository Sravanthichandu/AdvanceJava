package Serialization;

import java.io.Serializable;

//1.Create a class
//2.class has to implements Serializable

public class Student implements Serializable
{
	
	private String name;
	private transient int rollno; //transient is a keyword which is used with datamembers 
	//to avoid serialization.
	private int marks;
	private int age;
	
	public Student()
	{
		
	}

	public Student(String name, int rollno, int marks, int age) {

		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void display()
	{
		System.out.println("Name : "+getName());
		System.out.println("rollno : "+getRollno());
		System.out.println("marks : "+getMarks());
		System.out.println("age : "+getAge());
	}
	
	
}
