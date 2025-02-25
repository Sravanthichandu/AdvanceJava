package FirstMethodPrograms;

import java.util.Scanner;

public class StrongNumberOrNot {

	public static int sumOfFactorailDigits(int number)
	{
	    int sum=0;
		while(number>0)
		{
			int fact=1;
			int ld = number%10;
			for(int i=1;i<=ld;i++)
			{
				fact= fact*i;
			}
			number = number/10;
			sum=sum+fact;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a strong number or not : ");
		int number = s.nextInt();
		if(sumOfFactorailDigits(number)==number)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}

}
/*
 * strong number 
 * number = 145
 * 1!+4!+5!
 * 1+24+120
 * 145
 * factorail of digits sum == number
 * Strong number
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
