package Approach4;

import java.util.Scanner;

public class AIOBE {

	public static void main(String[] args) {
		
		System.out.println("Main Starts");
		int a[] = {1,4,6,7,3,2};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter index value to get Array Element : ");
		int index = s.nextInt();
		while(true)
		{
			try
			{
				System.out.println("Array Element is : " + a[index]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Re-Enter valid index Number : ");
				index = s.nextInt();
			}
		}
		
		System.out.println("Main Ends");
	}
}
