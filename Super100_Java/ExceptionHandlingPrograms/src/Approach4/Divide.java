package Approach4;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		
		System.out.println("Main Starts ");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		
		int a = s.nextInt();
		
		System.out.println("Enter b value : ");
		
		int b = s.nextInt();
		
		while(true)
		{
			try {
				System.out.println(a/b);
				break;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Re-Enter Valid B value : ");
				b=s.nextInt();
			}
		}
		System.out.println("Main Ends");

	}
}
