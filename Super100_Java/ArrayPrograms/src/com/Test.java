package com;

import java.util.Scanner;

public class Test {

	public static boolean isZero(int[] a)
	{
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==0)
				return true;
		    return false;
		}	
	}
	punlic static void largest(int [] a)
	{
		int large=0;
		for(int i=0;i<=a.length-1;i++)
			if(a[i]>largest)
				largest=a[i];
		
		System.out.println(large);
	}
	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter size of an Array : ");
//		int size =s.nextInt();
//		int a[] = new int[size];
//		System.out.println("Enter array Elements : ");
//		for(int i=0;i<=a.length-1;i++)
//		{
//			a[i]=s.nextInt();
//		}
		int a[] = {1,2,3,4,5};
		for(int i=0;i<=a.length-1;i++)
		{
			if(isZero(a))
			{
				System.out.println("Array Elements Contains zero");
			}
			else
			{
				largest(a);	
			}

		}
		
		
	}
}
