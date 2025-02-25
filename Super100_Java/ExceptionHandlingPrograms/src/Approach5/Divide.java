package Approach5;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		
		System.out.println("Main Starts ");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		
		int a = s.nextInt();
		
		System.out.println("Enter b value : ");
		
		int b = s.nextInt();
		
		int chances = 0;
		
		while(true)
		{
			try {
				System.out.println(a/b);
				break;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Re-Enter Valid B value you have  " + (3-chances) +"chances  " );
				b=s.nextInt();
				if(chances == 3)
				{
					System.out.println("You have crossed minimum chances try after some time ");
					break;
				}
				chances++;


			}
		}
		System.out.println("Main Ends");

	}
}
