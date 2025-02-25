package com.generalization;

class Employee{
	public void work()
	{
		System.out.println("Working");
	}
}
class Developer extends Employee
{
	@Override
	public void work()
	{
		System.out.println("developer working");
	}
}
class Tester extends Employee
{
	@Override
	public void work()
	{
		System.out.println("Tester is working");
	}
}
public class UsingeneralizationVariable {
	public static void main(String[] args) {
		
//		Employee e;
//		e=new Developer();
//		e=new Tester();
//		e.work();
//		e.work();
		
		Employee e = new Employee();
		e.work();
	}

	
}
