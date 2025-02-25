package FirstMethodPrograms;

import java.util.Scanner;

public class PrintingDigitsOneByOne {

	public static void printDigitsOnebyOne(int number)
	{
		while(number>0)
		{
			int ld = number%10;
			System.out.println(ld);
			number/=10;
		}
	}
	public static void main(String[] args) {
	
		Scanner  s = new Scanner(System.in);
		int rev=0;
		System.out.println("Enter a number to print each digit one by one : ");
		int number = s.nextInt();
		while(number>0)
		{
			int ld = number%10;
			rev = rev*10+ld;
			number=number/10;
		}
		printDigitsOnebyOne(rev);
		

	}

}
