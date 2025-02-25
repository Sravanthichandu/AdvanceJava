package com.Top100Codes.ArrayPrograms.Prepinsta;

import java.util.Scanner;

public class LargestElement {

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
		int largest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println("LargestElement : " +largest);
		
	}
}
