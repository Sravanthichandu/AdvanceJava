package StandardPrograms;

import java.util.Scanner;

public class PrimeNumber {
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = s.nextInt();
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count ++;
			}
		}
		if(count==2)
		{
			System.out.println("PrimeNumber");
		}
		else
		{
			System.out.println("Not a PrimeNumber");
		}

	}

}
