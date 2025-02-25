package PracticeU;

public class TribonacciSeries {
	
	public static void main(String[] args) 
	{
		int a = 0;
		int b = 0;
		int c = 1;
		int sum = 0;
		for (int i=0;a<=10;i++ )
		{		
		    System.out.print(sum+ ",");
			a = b;
			b = c;
			c = sum;
			sum = a+b+c;
		}
		System.out.println();
	}

}
/*
 * a=0
 * b=1
 * c=0
 * --------------
 *c=0
 * c=a+b 0+1=1
 * a=b a=1
 * b=sum=1
 * sum=a+b=2
 * 
 * 
 * 
 * */
