package FirstMethodPrograms;

import java.util.Scanner;

public class SumOfOddFactors 
{

	public static void printingOddFactors(int number)
	{
		System.out.println("Printing odd Factors of a given number");
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0 && i%2!=0)
			{
				System.out.println(sum+i);
			}
		}
	}
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to print odd factors of a number :");
		int number = s.nextInt();
        printingOddFactors(number);
	
}
}
/*
 * 
 * 
 * factors ---- 6
 *                 1,2,3,6 --- even 2,6
 *                             odd 1
 * 
 * 6%1==0 -->1%2==0 (false)-- i 
 * 6%2==0 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
