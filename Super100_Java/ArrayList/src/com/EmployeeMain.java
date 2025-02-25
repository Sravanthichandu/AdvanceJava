package com;

import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeMain
{

	public static void main(String[] args) 
	{
		
		Employee e1 = new Employee("Ram",1239,90000,"Hyd","Developer");
		Employee e2 = new Employee("Lakshmi",8976,30000,"chennai","Tester");
		Employee e3 = new Employee("Harini",64352,80000,"banglore","Developer");
		Employee e4 = new Employee("Scott",61236,60000,"Hyd","Tester");
		Employee e5 = new Employee("Kavya",52872,75000,"Hyd","developer");
		
		ArrayList al = new ArrayList();
		al.add(e1);al.add(e2);al.add(e3);al.add(e4);al.add(e5);
		for(int i=0;i<=al.size()-1;i++)
		{
		   Employee emp=(Employee)al.get(i);
		   if(emp.getEname().equalsIgnoreCase("Scott"))
		   {
			   System.out.println("Scott Salary : " +emp.getSalary());
		   }			
		 }
		  System.out.println("---------------------------------------------------");
		   for(int i=0;i<=al.size()-1;i++)
		   {
			   Employee emp=(Employee)al.get(i); 
			   if(emp.getDesignation().equalsIgnoreCase("Developer"))
			   {
				   System.out.println("Name of the Employee : " +emp.getEname() +"\n"+"Location of the Employee : "+ emp.getLocation());
			   }  
		  
		  }
		   System.out.println("--------------------------------------------------");
		  for(int i=0;i<=al.size()-1;i++)
		  {
			  Employee emp = (Employee)al.get(i);
			  if(emp.getSalary()==30000)
			  {
				  emp.setLocation("Mumbai");
				  emp.display();
			  }
		  }
		  System.out.println("---------------------------------------------------");
		  for(int i=0;i<=al.size()-1;i++)
		  {
			  Employee emp = (Employee)al.get(i);
			  System.out.println("Name of the Employee : " +emp.getEname() + "\n" + "Salary of the Employee : "+ emp.getSalary()+"\n"+"---------------------------");
		  }
		  
		  System.out.println("=======================================================");
		  for(int i=0;i<=al.size()-1;i++)
		  {
			  Employee emp = (Employee)al.get(i);
			  if(emp.getEname().equalsIgnoreCase("Ram"))
			  {
				  al.remove(emp);
			  }
			  
		  }
		  //printing after deleting
		  System.out.println("================================================");
		  System.out.println("================================================");
		  for(int i=0;i<=al.size()-1;i++)
		  {
			  Employee emp = (Employee)al.get(i);
			  System.out.println(emp);
		  }
		  
		  System.out.println("----------------------------------------------");
		  Function <Employee ,String> f = (e)->e.getEname();
				  {
					  for(int i=0;i<=al.size()-1;i++)
					  {
						  Employee emp = (Employee)al.get(i);
						 System.out.println(f.apply(emp));
						  
					  }
				  };
				  
	
		  

		  
		
	 }
}
