package com;

public class ReverseOfAnArray {

	public static void reverseArray(int[] a)
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5};
		reverseArray(a);
		
	}
}
