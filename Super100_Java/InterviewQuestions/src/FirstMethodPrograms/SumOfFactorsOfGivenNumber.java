package FirstMethodPrograms;

import java.util.Scanner;

public class SumOfFactorsOfGivenNumber {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to find sum of Factors :  ");
		int number = s.nextInt();
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
				sum = sum+i;
		}
		System.out.println("SumOfFactors for " + number + " is : " +sum);
	}

}
