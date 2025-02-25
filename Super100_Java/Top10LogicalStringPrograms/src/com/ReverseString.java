package com;

import java.util.Scanner;

// reversing string using toCharArray[]
public class ReverseString {
	
	public static void main(String[] args) {
		
		//1.Create a String using Scanner
		
		Scanner s = new Scanner(System.in);
		
		//2.Read String Data from user
		
		String data = s.next();
		
		//3.Create charArray[]
		
		char[] ch = data.toCharArray();
		
		// 4.loop the characters
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
			
		
		
	}

	
}
