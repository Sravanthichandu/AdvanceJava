package FirstMethodPrograms;

import java.util.Scanner;

public class SumOfAllTheDigitsInNumber {

	public int sum(int number)
	{
		int sum=0;
		while(number>0)
		{
			int ld=number%10;
			sum = sum+ld;
			number/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to sum all the Digits : ");
		int number = s.nextInt();
		SumOfAllTheDigitsInNumber s1 = new SumOfAllTheDigitsInNumber();
		System.out.println("Sum of all the digits in a number are : " + s1.sum(number) );
		
		

	}

}
