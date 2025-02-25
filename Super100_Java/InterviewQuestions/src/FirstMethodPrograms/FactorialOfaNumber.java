package FirstMethodPrograms;

import java.util.Scanner;

public class FactorialOfaNumber {

	public void factorial(int number)
	{
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a "+ number + " is : " + fact);
		
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to find Factorial of a number : ");
		int number = s.nextInt();
		FactorialOfaNumber f1 = new FactorialOfaNumber();
		f1.factorial(number);
	}

}
