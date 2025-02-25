package FirstMethodPrograms;

import java.util.Scanner;

public class PrintingEvenAndOddDigits {

	public static void printEvenDigitsInNumber(int number)
	{
		System.out.println("Printing Even Digits : ");
		while(number > 0)
		{
			int ld = number%10;
			if(ld%2==0)
			{
				System.out.println(ld);
			}
			number/=10;
		}
	}
	public static void printOddDigitsInNumber(int number)
	{
		System.out.println("Printing Odd Digits : ");
		while(number>0)
		{
			int ld = number%10;
			if(number%2!=0)
			{
				System.out.println(ld);
			}
			number/=10;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to print Even and Odd digits in an Number : ");
		int number = s.nextInt();
		printEvenDigitsInNumber(number);
		printOddDigitsInNumber(number);

	}

}
