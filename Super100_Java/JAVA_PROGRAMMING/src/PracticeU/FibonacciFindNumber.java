package PracticeU;

import java.util.Scanner;

public class FibonacciFindNumber {

	public static void numberPresentInFibonacci(int number)
	{
		int a=0;
		int b=1;
		int sum=0;
		while(sum<=number)
		{
			System.out.print(sum+"," );
			//sum=a+b;
			if(sum==number)
			{
				System.out.println("Number present");
				break;
			}
			a=b;
			b=sum;
			sum=a+b;
		}
		if(sum>number)
		{
			    System.out.println("Not present");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check whether number is present or not ");
        int n= s.nextInt();
        numberPresentInFibonacci(n);
        
		
	}

}
