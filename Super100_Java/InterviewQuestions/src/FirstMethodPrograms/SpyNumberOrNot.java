package FirstMethodPrograms;

import java.util.Scanner;

public class SpyNumberOrNot {

	public static void isSpyNumber(int number)
	{
		int sum=0;
		int product=1;
		while(number>0)
		{
			int ld = number%10;
			sum=sum+ld;
			product=product*ld;
			number/=10;
		}
		if(sum==product)
		{
			System.out.println("Given number is Spy Number ");
		}
		else
		{
			System.out.println("Given number is not Spy Number");
		}
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is spy number or not :");
		int number = s.nextInt();
		isSpyNumber(number);
		
		
		
	}

}
/*
 *Spy number is nothing but
 *
 *sum of digits is equal to product of digits
 *adding digits == multiplying digits
 *
 **/
