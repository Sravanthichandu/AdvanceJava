package Approach4;

import java.util.Scanner;

public class SIOBE {

	public static void main(String[] args) {
		
		System.out.println("Main Starts ");
		
		String s = "Java";
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter index number to char value : ");
		
		int index = s1.nextInt();
		while(true)
		{

			try
			{
				System.out.println(s.charAt(index));
				break;
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("Re-Enter the valid index number : ");
				index = s1.nextInt();
				
			}
		}

		
		System.out.println("Main Ends");

	}

}
