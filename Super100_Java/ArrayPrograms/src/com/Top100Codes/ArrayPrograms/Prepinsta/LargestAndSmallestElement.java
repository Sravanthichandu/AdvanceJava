package com.Top100Codes.ArrayPrograms.Prepinsta;

import java.util.Scanner;

//by using iteration

public class LargestAndSmallestElement {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Array element "+i+ "Position" );
			arr[i]=s.nextInt();
		}
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
//			if(arr[i]<smallest) 
//			{
//				smallest=arr[i];
//			}
		}
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>arr[i]) 
			{
				smallest=arr[i];
			}
		}
		

		System.out.println("LargestElement in an Array  : "+largest);
		System.out.println("SmallestElement in an Array : "+smallest);
	}
}
