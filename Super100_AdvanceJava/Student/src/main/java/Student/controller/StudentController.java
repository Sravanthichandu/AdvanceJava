package Student.controller;

import java.util.Scanner;

import Student.dao.StudentDao;
import Student.dto.Student;

public class StudentController {

	static Scanner s = new Scanner(System.in);
	static Student std = new Student();
	static StudentDao stdDao = new StudentDao();
	public static void main(String[] args) {
		
		System.out.println("choose an Option : ");
		System.out.println("1.StudentRegisteration\n2.StudentDetails\n3.DeleteStudent\n4.UpdateStudent\n5.Exit");
		int option = s.nextInt();
		boolean isStart=true;
		switch(option)
		{
		   case 1 : 
		   {
			   registrationStudent();
		   }
		   break;
		   case 2 :
		   {
			  StudentDetails(); 
		   }
		   break;
		   case 3 :
		   {
			   DeleteStudent();
		   }
		   break;
		   case 4 :
		   {
			   updateStudent();
		   }
		   break;
		   case 5 :
		   {
			   System.out.println("ThankYou");
			   isStart=false;
		   }
		}
	}
	public static void updateStudent() {
		
		
	}
	public static void DeleteStudent() {
		
		
	}
	public static void StudentDetails() {
		System.out.println("Enter Student Id : ");
		int studentId = s.nextInt();
		stdDao.fetchStudent(studentId);
		
	}
	public static void registrationStudent() {
	
		System.out.println("Enter Student Details : ");
		System.out.println("Enter Student Name : ");
		String name = s.next();
		System.out.println("Enter Student Email : ");
		String email = s.next();
		System.out.println("Enter Student PhoneNumber : ");
		long phone = s.nextLong();
		System.out.println("Enter  Password : ");
		String password = s.next();
		Student std = new Student(name,email,phone,password);
		try
		{
			stdDao.saveStudent(std);
		}
		catch(Exception e)
		{
			System.out.println("Data Already exists ..");
		}

	}
}
