package CustomException;

import java.util.Scanner;

public class PalindromeString {

	public static String palindromeString(String s)
	{
		String rev="";
		for(int i=1;i<s.length();i++)
		{
			char ch = s.charAt(i);
			rev = rev+ch;
		}
		return rev;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(palindromeString(s)==s)
		{
			System.out.println("Palindrome String");
		}
		else
		{
			NotPalindromeException e = new NotPalindromeException();
			throw e;
		}
	
	}

}
