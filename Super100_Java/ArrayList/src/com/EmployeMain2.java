package com;

import java.util.ArrayList;
import java.util.function.Function;

public class EmployeMain2 {

	public static void main(String[] args) {
		
		Employe e1 = new Employe("Ram",1239,90000,"Hyd","Developer");
		Employe e2 = new Employe("Lakshmi",8976,30000,"chennai","Tester");
		Employe e3 = new Employe("Harini",64352,80000,"banglore","Developer");
		Employe e4 = new Employe("Scott",61236,60000,"Hyd","Tester");
		Employe e5 = new Employe("Kavya",52872,75000,"Hyd","developer");
		
		ArrayList al = new ArrayList();
		al.add(e1);al.add(e2);al.add(e3);al.add(e4);al.add(e5);
		
		for(Object obj : al)
		{
			System.out.println(obj);
			System.out.println("----------------------------------");
			Employe  emp = (Employe)obj;
			if(emp.getEname().equalsIgnoreCase("Scott"))
			{
				System.out.println("Scott Salary : " +emp.getSalary());
			}
			System.out.println("--------------------------------");
		
			
		}
		for(Object obj : al)
		{
			Employe emp = (Employe)obj;
			if(emp.getDesignation().equalsIgnoreCase("Developer"))
			{
				System.out.println("EmployeeName :"+emp.getEname()+"\n"+"EmployeeLocation : "+emp.getLocation());
				System.out.println("-----------------------------------");
			}
		}
		for(Object obj : al)
		{
			Employe emp = (Employe)obj;
			if(emp.getSalary()==30000)
			{
				emp.setLocation("Mumbai");
				System.out.println(emp);
				System.out.println("-------------------------------------------------");
			}
		}
		for(Object obj : al)
		{
			Employe emp = (Employe)obj;
			System.out.println("Employee Name : "+emp.getEname()+"\n"+"Employee Salary : "+emp.getSalary());
		}
		System.out.println("---------------------------------------------");
		System.out.println("----------------------------------------------");
		Function <Employe,String> f = (e)->e.getEname();
		{
			for(Object obj : al)
			{
				Employe emp = (Employe)obj;
				System.out.println(f.apply(emp));
			}

		};
		System.out.println("---------------------------------------------");
		System.out.println("----------------------------------------------");
		Function<Employe,String> f1 =(e)->e.getDesignation();
		{
			for(Object obj :al)
			{
				Employe emp = (Employe)obj;
				if(emp.getEname().equalsIgnoreCase("Scott"))
				{
					System.out.println(f1.apply(emp));
				}
			}
		}
		System.out.println("---------------------------------------------");
		System.out.println("----------------------------------------------");
		
		Function<Employe,Integer> f2 = (e)->e.getSalary();
		{
			for(Object obj :al)
			{
				Employe emp = (Employe)obj;
				if(emp.getDesignation().equalsIgnoreCase("Developer"))
				{
					System.out.println(f1.apply(emp));
				}
			}
		}
		
		
		
	}
}
