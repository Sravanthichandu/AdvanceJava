package FirstMethodPrograms;

import java.util.Scanner;

public class PrintingSumOfEvenFactors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = s.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0 && i%2==0)
			{
				
				sum = sum+i;
			}
		}
		System.out.println("Sum of EvenFactors of " + number + " : " + sum);
				
	}

}
