package FirstMethodPrograms;

import java.util.Scanner;

public class TwistedPrime {

	public static int isPrime(int number)
	{
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		return count;
	}
	public static int reverseNumber(int number)
	{
		int reverse=0;
		for(int i=1 ;i<=number;i++)
		{
			int ld = number%10;
			reverse = reverse*10 + ld;
			number/=10;
		}
		return  isPrime(number);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		if(isPrime(n)==2)
		{
			System.out.println( reverseNumber(n));
		}
		else
		{
			System.out.println("It is not a PrimeNumber , so it is not TwistedPrime");
		}
	}
}
