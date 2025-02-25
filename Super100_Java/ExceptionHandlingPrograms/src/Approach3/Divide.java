package Approach3;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		
		System.out.println("Main Starts ");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		
		int a = s.nextInt();
		
		System.out.println("Enter b value : ");
		
		int b = s.nextInt();
		
		try
		{
			System.out.println("Result : " + a / b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter valid B value : ");
			b=s.nextInt();
			try
			{
				System.out.println(a/b);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("Please Re-Enter valid B value : ");
				b = s.nextInt();
				System.out.println("Result : " + a/b);
			}
		}
		
		System.out.println("Main Ends");

	}
}
