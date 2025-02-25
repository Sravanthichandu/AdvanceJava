package FirstMethodPrograms;

import java.util.Scanner;

public class FirstNPrimeNumbers {

	public static int nPrimeNumbers(int number)
	{
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to print n number of prime numbers :");
		int n = s.nextInt();
		int count=0;
		int i = 0;
		while(count < n)
		{
			if(nPrimeNumbers(i)==2)
			{
				System.out.print(i + ",");
				count++;
			}
			i++;
		}

	}

}
