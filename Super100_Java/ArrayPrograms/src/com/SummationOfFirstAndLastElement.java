package com;

public class SummationOfFirstAndLastElement {

	public static void summation(int [] a)
	{
		int first=a[0];
		int last = a[a.length-1];
		int sum=first+last;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		summation(a);
		
		
	}
}
