package com;

import java.util.Iterator;
import java.util.Vector;

public class Demo_itr_cursor {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("Hi");
		v.add("Hello");
		v.add("world");
		v.add("Welcome");
		v.add("Dinga");
		v.add("Dingip");
		
		Iterator<String> itr = v.iterator();
		while(itr.hasNext())
		{
			String st = itr.next();
			if(st.length()>3)
			{
				System.out.println(st);
			}
			char ch = st.charAt(st.length()-1);
			if(ch=='p')
				itr.remove();
			
		}
		
		System.out.println(v);
		
	}
}
