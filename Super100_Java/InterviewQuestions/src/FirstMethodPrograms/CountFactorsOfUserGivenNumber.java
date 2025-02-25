package FirstMethodPrograms;

import java.util.Scanner;

public class CountFactorsOfUserGivenNumber {
	
	public void countFactors(int number)
	{
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		System.out.println("Factor count of "+ number + " is : " + count);
	}

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to Count Factors : ");
		int number = s.nextInt();
		CountFactorsOfUserGivenNumber  countingFirst = new CountFactorsOfUserGivenNumber ();
		countingFirst.countFactors(number);
	}

}
