package FirstMethodPrograms;

import java.util.Scanner;

public class CountingNumberOfDigitsPresentInaNumber {
	
	public static int countDigitsInNumber(int number)
	{
		int count=0;
		while(number>0)
		{
			int ld = number%10;
			count +=1;
			number/=10;
		}
		return count;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to count number of digits present in a number : ");
		int number = s.nextInt();
		System.out.println(countDigitsInNumber(number));

	}

}
