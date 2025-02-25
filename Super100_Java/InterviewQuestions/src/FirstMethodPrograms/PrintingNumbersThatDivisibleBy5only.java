package FirstMethodPrograms;

import java.util.Scanner;

public class PrintingNumbersThatDivisibleBy5only {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter start value to print divisible's of 5: ");
		int start = s.nextInt();
		System.out.println("Enter End value to print divisible's of 5: ");
		int end = s.nextInt();
		for(int i=start ;i<=end;i++)
		{
			if(i%5==0)
				System.out.println(i);
		}
	}

}
