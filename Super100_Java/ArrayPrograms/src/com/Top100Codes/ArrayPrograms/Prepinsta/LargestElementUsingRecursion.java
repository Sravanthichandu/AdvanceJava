package com.Top100Codes.ArrayPrograms.Prepinsta;

//recursion using top-down Approach

import java.util.Scanner;

public class LargestElementUsingRecursion {

	public static int findLargestElement(int[] arr,int n)
	{
		if(n==1)
			return arr[0];
		else
			return Math.max(arr[n-1], findLargestElement(arr,n-1));
		
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Array size:");
		int size = s.nextInt();
		//System.out.println("Enter Array Elements : ");
		int arr[] = new int[size];
		for(int i=1;i<arr.length;i++)
		{  
			System.out.println("Enter "+i+ " Array Element");
			arr[i]=s.nextInt();
		}
		
		int largest=findLargestElement(arr,size);
		System.out.println("LargestElement in an Array : "+largest);
	}
}
