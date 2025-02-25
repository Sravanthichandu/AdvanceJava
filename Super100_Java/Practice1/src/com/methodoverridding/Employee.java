package com.methodoverridding;

class Employe
{
	public void login()
	{
		System.out.println("Login at 9 clk");
	}
	public void logout()
	{
		System.out.println("Logout at 9 clk");
	}
}
class Developer extends Employe
{
	@Override
	public void login()
	{
		System.out.println("Login at 11 clk");
	}
	@Override
	public void logout()
	{
		System.out.println("Logout at 6 clk");
	}
}
class Tester extends Employe
{
	@Override
	public void login()
	{
		System.out.println("Login at 12 clk");
	}
	@Override
	public void logout()
	{
		System.out.println("Logout at 9 clk");
	}
}
public class Employee {

	public static void main(String[] args) {
	
		Developer d = new Developer();
		System.out.println("Developer work details");
		d.login();
		d.logout();
		System.out.println("------------------------");
		System.out.println("Tester work details");
		Tester t = new Tester();
		t.login();
		t.logout();
	}

}
