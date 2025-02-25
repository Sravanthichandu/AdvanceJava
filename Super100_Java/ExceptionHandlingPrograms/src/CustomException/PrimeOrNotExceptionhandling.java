package CustomException;

import java.util.Scanner;

public class PrimeOrNotExceptionhandling {

	public static int Prime(int number)
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
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not");
		int number = s.nextInt();
		if(Prime(number)==2)
		{
			System.out.println("PrimeNumber");
		}
		else
		{
			//System.out.println("Not PrimeNumber");
			while(true)
			{
				try
				{
					NotPrimeException e = new NotPrimeException();
					throw e;
					
				}
				catch(NotPrimeException e)
				{
					System.out.println("Re-Enter a number that is Prime : ");
					number = s.nextInt();
					if(Prime(number)==2)
					{
						System.out.println("PrimeNumber");
					}

				}
			}
		}
	}

}
