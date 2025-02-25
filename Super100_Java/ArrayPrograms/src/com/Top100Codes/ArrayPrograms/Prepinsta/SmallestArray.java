package com.Top100Codes.ArrayPrograms.Prepinsta;

import java.util.Scanner;

//by using iteration

public class SmallestArray {

	public static void main(String[] args) {
		
//		int arr[]= {1,12,34,56,78,1};

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=1;i<=arr.length;i++)
		{
			System.out.println("Enter Array element "+i+ "Position" );
			arr[i]=s.nextInt();
		}
    	int smallest = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(smallest >arr[i])//if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println("smallest element in an Array : "+smallest);
		
	}
}
