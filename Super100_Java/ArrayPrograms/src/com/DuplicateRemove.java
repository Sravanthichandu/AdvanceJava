package com;

import java.util.Scanner;

public class DuplicateRemove {

	public static void isDuplicate(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int size =s.nextInt();
		int a[] = new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Enter array elements "+i +"position");
			a[i]=s.nextInt();
		}
		isDuplicate(a);
	}
}
/*
 * i/p ---> 1 2 3 1 2 3 7
 * o/p ---> 1 2 3 7
 * 
 * */
