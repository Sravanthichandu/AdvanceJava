package FirstMethodPrograms;

import java.util.Scanner;

public class SumOfFactorialOfDigit {
	
	public static int sumOfFactorial(int number)
	{
		int sum=0;
		while(number>0)
		{
			int fact=1;
			int ld = number%10;
			for(int i=1;i<=ld;i++)
			{
				fact=fact*i; 
			}
			sum = sum+fact;
			number/=10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to print sum of factorial of digit : ");
		int number =s.nextInt();
		System.out.println(sumOfFactorial(number));
	}

}

/*
 * 145
 * 1!+4!+5!
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
 * 
 * 
 * */
