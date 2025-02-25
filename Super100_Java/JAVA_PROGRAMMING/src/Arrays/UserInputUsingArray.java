package Arrays;

import java.util.Scanner;

public class UserInputUsingArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the  array elements");
		for(int i=0;i<arr.length;i++)
		{ 
			//System.out.println("Enter " + arr[i] + " array elements " );
			arr[i]=s.nextInt();
			
		}
		System.out.println("Displaying the array elements ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
