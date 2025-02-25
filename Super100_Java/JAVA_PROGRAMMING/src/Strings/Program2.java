

/*Write a program to print summazation of Ascii value of even index characters from
 *  an given String
 *  input : javadeveloper
 *  
 *  
 * */

package Strings;

import java.util.Scanner;

public class Program2 {


	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1 = s.next();
		int sum=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(i!=0 && i%2==0)
			{
				char c =s1.charAt(i);
				sum = sum+c;
			}
			
		}
		System.out.println(sum);
	}
}
