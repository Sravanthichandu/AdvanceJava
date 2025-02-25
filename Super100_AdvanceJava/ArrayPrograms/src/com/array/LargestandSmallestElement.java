package com.array;

public class LargestandSmallestElement {

	public static void main(String[] args) {
		
		int arr[]= {12,14,78,23,43,57,4,12,56};
		int largest = arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println("LargestElement : "+largest);
		System.out.println("SmallestElement : "+smallest);
	}
}
