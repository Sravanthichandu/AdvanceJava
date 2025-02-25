package PracticeU;

import java.util.Scanner;

public class SumOfSquaresOfFirstNNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n number : ");
		int n = s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=+i*i;
		}
		System.out.println(sum);
		
	}

}
