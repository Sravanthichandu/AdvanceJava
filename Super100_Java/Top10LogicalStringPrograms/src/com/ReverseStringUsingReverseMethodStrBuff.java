package com;

public class ReverseStringUsingReverseMethodStrBuff {

	public static void main(String[] args) {
		
		//Using StringBuffer
		
		String str = "hello";
		String s = "Hiii";
		StringBuffer sb = new StringBuffer(str);
		System.out.print(sb.reverse());
		
		System.out.println();
		//Using StringBuilder
		
		StringBuilder sd = new StringBuilder(s);
		System.out.println(sd.reverse());
	}
}
