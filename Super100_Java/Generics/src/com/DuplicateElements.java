package com;

import java.util.Enumeration;
import java.util.Vector;

public class DuplicateElements {

	public static void main(String[] args) {
		
		Vector <Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(8);
		v.add(5);
		v.add(8);
		v.add(7);
		v.add(1);
		
		Enumeration<Integer> enu = v.elements();
		while(enu.hasMoreElements())
		{
			Integer obj = enu.nextElement();
			if(enu.nextElement().equals(obj))
			{
				System.out.println(obj);
			}
			else
			{
				break;
			}

		}

	}

}
