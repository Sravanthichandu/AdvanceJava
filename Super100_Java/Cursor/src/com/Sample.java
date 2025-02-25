package com;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Sample {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.add("Tom");
		stack.add("Dinga");
		stack.add("chotta bheem");
		
	    Enumeration<String> enu  = stack.elements();
	    while(enu.hasMoreElements())
	    {
	    	String s = enu.nextElement();
	    	System.out.println(s);
	    }
		
	}
}
