package com.methodoverridding;

class Parentt
{

	private void m1()
	{
		System.out.println("Parent m1 method");
	}

	protected void m2()
	{
		System.out.println("Parent m2 method");
	}
	public int add(int x,int y)
	{
		int sum=x+y;
		return sum;
	}
}
class Childern extends Parentt
{
	//child class own method
	public void m1()
	{
		System.out.println("Child class own m1 method");
	}
	protected void m3()
	{
		System.out.println("Child class own m3 method");
	}
	@Override
	public void m2()
	{
		super.m2();
		System.out.println("child m2 method");
	}

}
public class MethodOverriddingAndAccessModifiers {

	public static void main(String[] args) {
		Childern c = new Childern();
		c.m2();
		c.m1();
		c.m3();
		

	}

}
