package FirstMethodPrograms;

import java.util.Scanner;

public class PerfectNumberOrNot {
	
	public static void isPerfectNumber(int number)
	{
		int sum=0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum = sum+i;
			}
			
		}
		if(sum==number)
		{
			System.out.println( number + " is a perfect Number");
		}
		else
		{
			System.out.println( number + " not a perfect Number ");
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check given number is Perfect number or not : ");
		int number = s.nextInt();
		isPerfectNumber(number);
		
		
		
	}

}
