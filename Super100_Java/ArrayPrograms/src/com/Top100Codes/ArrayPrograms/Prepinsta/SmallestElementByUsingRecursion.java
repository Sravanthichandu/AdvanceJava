package com.Top100Codes.ArrayPrograms.Prepinsta;

public class SmallestElementByUsingRecursion {

	public static int findSmallestElement(int [] arr,int n)
	{
		if(n==1)
			return arr[0];
		else
			return Math.min(arr[n-1], findSmallestElement(arr,n-1));
	}
	
	public static void main(String[] args) {
		
		int arr[]= {12,13,1,10,34,10};
		int n =arr.length;
		int smallest=findSmallestElement(arr,n);
		System.out.println("Smallest Element : "+smallest);
	}
}
