package com.methodOverloading;

class Add
{
	public int add(int a,int b,int c)
	{
		int sum=a+b+c;
		return sum;
	}
	public double add(double a,double b,double c)
	{
		double sum=a+b+c;
		return sum;
	}
}
public class ChangingDateTypeOfArguments {

	public static void main(String[] args) {
		
		Add a1 = new Add();
		System.out.println(a1.add(3, 6, 19));
		System.out.println(a1.add(2.44, 3.40, 56.00));

	}

}
