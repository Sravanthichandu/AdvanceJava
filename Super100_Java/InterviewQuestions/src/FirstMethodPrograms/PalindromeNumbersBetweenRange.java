package FirstMethodPrograms;

import java.util.Scanner;

public class PalindromeNumbersBetweenRange {

	public static int printingPalindromeNumbersInRange(int number)
	{
		int reverse=0;
		while(number>0)
		{
			int ld = number%10;
			reverse = reverse*10+ld;
			number /=10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a starting range to print Palindrome numbers : ");
		int start = s.nextInt();
		System.out.println("Enter a ending range to print Palindrome numbers : ");
        int end   = s.nextInt();
        for(int i=start;i<=end;i++)
        {
        	printingPalindromeNumbersInRange(i);
        	if(printingPalindromeNumbersInRange(i)==i)
        	{
        		System.out.print(i + ",");
        	}
        	
        }
	}

}
