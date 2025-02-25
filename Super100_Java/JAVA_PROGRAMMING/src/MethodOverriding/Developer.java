package MethodOverriding;

public class Developer extends Employee{

	@Override
	public void login()
	{
		System.out.println("Login at 11 clk");
	}
	
	@Override
	public void work()
	{
		System.out.println("developing an applications");
	}
	
	@Override
	public void sal()
	{
		System.out.println("Sal for developers : 90 k /per month");
	}
	@Override
	public void logout()
	{
		System.out.println("logout at 6 clk");
	}
	
	public void Hi()
	{
		System.out.println("Hi");
	}
}

/*
 * @Override is an annotation that is used for understanding 
 * when new developer work on the project 
 * that developer should now which method is overriden
 * so , it is for readibility and understanding
 * 
 * it is a programming langauage --so we are using annotations for that
 * rather than typing.
 * 
 * 
 * 
 * 
 * */











