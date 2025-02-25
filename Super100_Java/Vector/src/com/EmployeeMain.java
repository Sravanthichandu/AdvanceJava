package com;

import java.util.Vector;

public class EmployeeMain {

	public static void main(String[] args) {
		

		Employee e1 = new Employee("Ram",1239,90000,"Hyd","Developer");
		Employee e2 = new Employee("Lakshmi",8976,30000,"chennai","Tester");
		Employee e3 = new Employee("Harini",64352,80000,"banglore","Developer");
		Employee e4 = new Employee("Scott",61236,60000,"Hyd","Tester");
		Employee e5 = new Employee("Kavya",52872,75000,"Hyd","developer");
		
		Vector v = new Vector();
		
		//create the objects or storing the objects in vector
		v.addElement(e1);
		v.addElement(e2);
		v.addElement(e3);
		v.addElement(e4);
		v.addElement(e5);
		
		//reading or retrieving the objects
		for(Object obj : v)
		{
			//for printing down casting is not required
			System.out.println(obj);
			System.out.println("------------------------------");
		}
		System.out.println("=====================================");
		//display the details name releated to kavya 
		for(Object obj : v)
		{
			Employee emp = (Employee)obj;
			if(emp.getEname().equalsIgnoreCase("Kavya"))
			{
				emp.display();
			}
		}
		System.out.println("=========================================");
		
		//updating
		//update salary for employee id =1239
		
		for(Object obj1 : v )
		{
			Employee emp = (Employee)obj1;
			if(emp.getId()==1239)
			{
				int salary = emp.getSalary()+50000;
				emp.setSalary(salary);
				emp.display();
			}
		}
		
		//remove where ename = lakshmi
		
		for(int i=0;i<=v.size()-1;i++)
		{
			Employee emp = (Employee)v.get(i);
			if(emp.getEname().equalsIgnoreCase("Lakshmi"))
			{
				v.remove(emp);
			}
		}
		System.out.println("========================================");
		for(Object obj : v)
		{
			System.out.println(obj);
			System.out.println("______________________________________");
		}
		
		
	}
}
