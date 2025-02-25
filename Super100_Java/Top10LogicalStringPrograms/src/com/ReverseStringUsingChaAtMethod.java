package com;

//Reverse a string using charAt(int index) 


public class ReverseStringUsingChaAtMethod {
	
	public static void main(String[] args) {
		
		//1.create string
		String str = "hello";
		
		//2.Loop and read characters in reverse by using charAt(int index)
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
	}

}
