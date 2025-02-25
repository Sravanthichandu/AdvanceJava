package FirstMethodPrograms;

import java.util.Scanner;

public class N_Terms_Of_Fibonacci_series {

	public static void printingFibonacci(int number)
	{
		int a = 0;
		int b = 1;
		int sum = 0;
		for(int i=1;i<=number;i++)
		{
			System.out.print(sum + ",");
			a=b;
			b=sum;
			sum=a+b;
		}
		
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a n number to print n terms of Fibonacci series :");
		int number = s.nextInt();
		printingFibonacci(number);
		
	}

}
/*a=0
 *b=1
 *sum=0
 * int i=1 ;1<=10 
 * print 0
 * a=b-->a=1;
 * b=sum--> b=0;
 * sum=a+b--->0+1=1 
 * 0,
 * ----updated a and b values
 * a=1
 * b=0
 * --------------------------
 * int i=2 ;2<=10;
 * sum print - 1
 * a=b --> a=0
 * b=a ---> b=1
 * sum=a+b --> sum=0+1=1
 * 
 * 1,
 * --------updated a and b
 * a=0
 * b=1
 * sum=1
 * ------------------------------
 * int i=3 ; 3<=10
 * print sum -->1
 * a=b --> a=1
 * b=sum --> b=1
 * sum=a+b --> sum=1+1
 * 
 * 1
 * ---------updated a and b values----
 * a=1
 * b=1
 * sum=2
 * ----------------------------------
 * int i=4 ;4<=10
 * print sum = 2
 * a=b-->a=1
 * b=sum-->b=2
 * sum=a+b -->sum=2+1=3
 * -----
 * 2
 * updated a and b 
 * a=1
 * b=2
 * sum=3
 * ---------------------------------
 * int i=5 ;5<=10
 * sum print-3
 * ----------------------------
 * 
 * 
 * 
 * o/p: 0 ,1 ,1 ,2,3
 * 
 */
