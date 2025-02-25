
//changing the No.of Parameters

package com.methodOverloading;

class Product
{
	public int multiply(int num1,int num2)
	{
		return num1*num2;
	}
	public int multiply(int num1,int num2,int num3)
	{
		return num1*num2*num3;
	}
}
public class ChangingTheNoOfParameters {

	public static void main(String[] args) {
	
		Product p1 = new Product();
		System.out.println("Product of 2 numbers : "+p1.multiply(3, 6));
		System.out.println("Product of 3 numbers : "+p1.multiply(9, 10, 30));
		
	}

}
