package com;

import java.util.Enumeration;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(10);
		v.add(34);
		v.add(90);
		v.add(100);
		v.add(12);
		
		System.out.println(v);
		
		//to print the data one by one for legacy class vector we use legacy cursor enumeration
		
	   //to do that first create helper method -->elements()
		
	       Enumeration<Integer>   enu  =	v.elements();
	       while(enu.hasMoreElements())
	       {
	    	    Integer   i = enu.nextElement();
	    	    System.out.println(i);
	       }
	}
}
