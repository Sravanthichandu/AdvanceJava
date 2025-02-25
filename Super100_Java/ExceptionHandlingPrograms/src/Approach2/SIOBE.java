package Approach2;

import java.util.Scanner;

public class SIOBE {

	public static void main(String[] args) {
		
		System.out.println("Main Starts ");
		
		String s = "Java";
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter index number to char value : ");
		
		int index = s1.nextInt();
		
		try
		{
			System.out.println(s.charAt(index));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("please Re-Enter the valid index number : ");
			index = s1.nextInt();
			System.out.println(s.charAt(index));
		}

		
		System.out.println("Main Ends");

	}

}
