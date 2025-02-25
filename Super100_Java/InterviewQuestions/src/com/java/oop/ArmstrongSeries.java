package com.java.oop;

import java.util.Scanner;

public class ArmstrongSeries {

	public static int printingArmstrongSeries(int sum) {
		int count=0;
		int temp=sum;
		int add=0;
		while(temp!=0)
		{
			temp/=10;
			count++;
		}
		while(sum>0)
		{
			int ld = sum%10;
			int exp=1;
			for(int i=1;i<=count;i++)
			{
				exp=exp*ld;
			}
			add=add+exp;
			sum/=10;
		}
		return add;
		
	}
	public static void fibnocciSeries(int n)
	{
		int a=0;
		int b=1;
		int sum=0;
		for(int i=1;;i++)
		{
			if(sum >10)
			{
				printingArmstrongSeries(sum);
				System.out.println(sum);
				break;
			}
			a=b;
			b=sum;
			sum=a+b;
		}
	}
	public static void main(String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter n series of armstrong series : ");
	    int n = s.nextInt();
	    fibnocciSeries(n);
	   

	}

}
