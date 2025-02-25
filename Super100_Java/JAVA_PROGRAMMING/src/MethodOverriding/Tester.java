package MethodOverriding;

public class Tester extends Employee {

	@Override
	public void login()
	{
		System.out.println("login at 10 clk");
	}
	
	@Override
	public void work()
	{
		System.out.println("Testing an applications");
	}
	
	@Override
	public void sal()
	{
		System.out.println("sal for tester - 80k/permonth");
	}
	
	@Override
	public void logout()
	{
		System.out.println("logout at 9 clk");
	}
}
