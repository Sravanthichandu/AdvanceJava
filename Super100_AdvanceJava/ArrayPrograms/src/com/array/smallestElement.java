package com.array;

public class smallestElement {

	public static void main(String[] args) {
		
		int arr[] = {10,12,6,9,2,123,90};
		int smallest = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}
		}
		System.out.println("smallest element : "+smallest);
	}
}
