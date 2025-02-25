package com.methodOverloading;

class Student
{
	public void studentDetails(String name,int rollNo)
	{
		System.out.println("Name of the student : "+ name +"\nrollNo of the student : "+rollNo );
		System.out.println("-----------------------------------------------");
	}
	public void studentDetails(int rollNo,String name)
	{
		System.out.println("rollNo of the student : "+ rollNo +"\nName of the student : "+ name );
	}
}
public class ChangingTheOrderOfParameters {

	public static void main(String[] args) {

		 Student s1 = new  Student();
		 s1.studentDetails("Hamitha", 10);
		 s1.studentDetails(10, "Hamitha");
	}

}
