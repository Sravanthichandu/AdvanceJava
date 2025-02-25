package com.array;

public class LargestElement {

	public static void main(String[] args) {
		
		int [] arr = {10,20,50,20,60};
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(largest < arr[i])
			{
				largest=arr[i];
			}
		}
		System.out.println("LargestElement : "+largest);
	}
}
