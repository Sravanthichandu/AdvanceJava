package CustomException;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not");
		int number = s.nextInt();
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
			System.out.println("PrimeNumber");
		}
		else
		{
			//System.out.println("Not PrimeNumber");
			NotPrimeException e = new NotPrimeException();
			throw e;
		}
	}

}
