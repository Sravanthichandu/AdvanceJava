package FirstMethodPrograms;

import java.util.Scanner;

public class ProductOfNumbersAccordingtoUserInput {

	public static void main(String[] args) {

        int product=1;
        
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter start value to print Product Of natural numbers : ");
		int start = s.nextInt();
		System.out.println("Enter end value to print Product Of natural numbers : ");
		int end = s.nextInt();
		for(int i=start ;i<=end;i++)
		{
			product=product*i;
		}
		System.out.println("Product Of Natural Numbers from " + start + " to " + end + " is : " +product );
		

	}

}
