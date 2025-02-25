package com;

import java.util.Scanner;

public class MultiplicationOfEvenNumbersAtOddIndex {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int size =s.nextInt();
		int a[] = new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Enter array elements "+i +"position");
			a[i]=s.nextInt();
		}
		int mul=1;
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2!=0)
			{
				mul=mul*a[i];
			}
		}
		System.out.println("Multiplication : "+mul);
	}
}
