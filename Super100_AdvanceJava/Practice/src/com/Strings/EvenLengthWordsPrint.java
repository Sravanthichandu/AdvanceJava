package com.Strings;

public class EvenLengthWordsPrint {

	public static void main(String[] args) 
	{
		
		String s = "Hello";
		for(int i=0;i<s.length();i++)
		{
			if(i!=0 && i%2==0)
				System.out.println(s.charAt(i));
		}
	}
}

/* 0  1  2  3  4
 * H  E  L  L  O*/
 