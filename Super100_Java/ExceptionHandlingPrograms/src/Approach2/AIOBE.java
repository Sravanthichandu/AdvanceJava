package Approach2;

import java.util.Scanner;

public class AIOBE {

	public static void main(String[] args) {
		
		System.out.println("Main Strats");
		int a[] = {1,4,6,7,3,2};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter index value to get Array Element : ");
		int index = s.nextInt();
		try
		{
			System.out.println(a[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter valid index number : ");
			index = s.nextInt();
			System.out.println(a[index]);
			
		}
		
		System.out.println("Main Ends");
	}
}
