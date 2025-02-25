package FirstMethodPrograms;

import java.util.Scanner;

public class PalindromeOrNot {
	
	public static int isPalindrome(int number)
	{
		int reverse=0;
		while(number>0)
		{
			int ld = number%10;
			reverse = reverse*10+ld;
			number/=10;
		}
	    return reverse;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is palindrome or not : ");
		int number = s.nextInt();
		if(isPalindrome(number)==number)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}
		

	}

}
