/*
 * 
 * */
package Strings;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		int alphacount=0;
	    int numbercount=0;
		int specialcount=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str =  s.next();
		for(int i=0;i<str.length();i++)
		{
			 char ch=str.charAt(i);
			 if(Character.isAlphabetic(ch))
			 {
				 alphacount++;
			 }
			 else if(Character.isDigit(ch))
			 {
				 numbercount++;
			 }
			 else
			 {
				 specialcount++;
			 }
		}
		System.out.println(alphacount);
		System.out.println( numbercount);
		System.out.println(specialcount);
	}

}
