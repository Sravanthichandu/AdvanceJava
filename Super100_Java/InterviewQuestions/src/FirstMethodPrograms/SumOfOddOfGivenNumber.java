package FirstMethodPrograms;

import java.util.Scanner;

public class SumOfOddOfGivenNumber {

	public static int SumOfOddFactors(int number)
	{
		int sum = 0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0 && i%2!=0)
			{
				sum =sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to print sum of odd numbers : ");
        int number = s.nextInt();
        System.out.println(SumOfOddFactors(number));

	}

}
