package FirstMethodPrograms;

import java.util.Scanner;

public class SumOfNaturalNumbersAccordingToUserWish {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter start number to print sumOfNaturalNumbers : ");
		int start = s.nextInt();
		System.out.println("Enter End number to print sumOfNaturalNumbers : ");
		int end = s.nextInt();
		for(int i=start;i<=end;i++)
		{
		    sum +=i;	
		}
		System.out.println("SumOfNaturalNumbers From " + start + " to " + end + " is : " +sum );

	}

}
