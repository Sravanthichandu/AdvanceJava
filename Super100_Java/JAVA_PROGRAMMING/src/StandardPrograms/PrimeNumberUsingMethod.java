package StandardPrograms;

import java.util.Scanner;

public class PrimeNumberUsingMethod {

	public static void isPrime(int number)
	{
		int count=0;
		if(number%2==0)
		{
			count++;
		}
		if(count==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			 System.out.println("Not a Prime number");
		}
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check whether prime or not ?");
		int number = s.nextInt();
		isPrime(number);
		
	}

}
