package FirstMethodPrograms;

import java.util.Scanner;

public class PrimeorNot {

	public static void  isPrime(int number)
	{
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println(number + " is not a prime number");
		}
		
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check Whether it is a Prime or not : ");
		int number = s.nextInt();
		isPrime(number);
		
	}

}
