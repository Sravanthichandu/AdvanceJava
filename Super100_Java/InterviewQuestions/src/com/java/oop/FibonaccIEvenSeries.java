package com.java.oop;

public class FibonaccIEvenSeries {

	public static void main(String[] args) {
	//Scanner s = new Scanner(System.in);	
		int a=0;
		int b=1;
		int sum=1;
		for(int i=1;i<=20;i++)
		{
			if(sum%2==0)
			{
				System.out.println(sum);
			}
			a=b;
			b=sum;
			sum=a+b;
		}

	}

}
