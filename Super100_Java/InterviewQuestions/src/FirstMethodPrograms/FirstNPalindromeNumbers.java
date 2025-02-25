package FirstMethodPrograms;

import java.util.Scanner;

public class FirstNPalindromeNumbers {

	public int nPalindromeNumbers(int number)
	{
		int reverse=0;
		while(number>0)
		{
			int ld=number%10;
			reverse = reverse*10+ld;
			number/=10;
		}
		return reverse;
	}
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n number to print First n palindrome numbers : ");
		int n = s.nextInt();
		FirstNPalindromeNumbers  p1 = new FirstNPalindromeNumbers ();
		int count=0;
		int i=0;
		while(count<n)
		{
			if(p1.nPalindromeNumbers(i)==i)
			{
				System.out.print(i + ",");
				count++;
				
			}
			i++;
		}
		

	}

}
