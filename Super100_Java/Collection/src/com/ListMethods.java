package com;

import java.util.ArrayList;

public class ListMethods {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(23.4);
		al.add("Tom");
		al.add(true);
		al.add(10);
		al.add(null);
		
		System.out.println(al);
		System.out.println("_______________________________________");
		al.add(2,12);
		System.out.println(al);
		System.out.println("_______________add(index 2,object 12)--next objects move forward________________________");
		System.out.println("---------------------------------------------------------------");
		al.remove(3);
		System.out.println(al);
		System.out.println("________________remove(index -3)--remove data based on index____________________");
		al.remove(true);
		System.out.println(al);
		System.out.println("__________________remove(object - true ) - removes data based on object_____________________");
		System.out.println(al.contains(null));
		System.out.println("___________________contains(object -null) --present or not____________________");
		System.out.println(al.get(3));
		System.out.println("_____________________get(3 -index) -- return 3 index object__________________");
		System.out.println(al.indexOf(23.4));
		System.out.println("_____________________indexOf(23.4 - object) -- returns first occurence __________________");
		System.out.println(al.lastIndexOf(10));
		System.out.println("_____________________lastIndexOf(10)--return last index__________________");
		System.out.println(al.size());
		System.out.println("__________________________size()_____________");
		al.set(2, 50);
		System.out.println(al);
		System.out.println("__________________________set(index 2,object 50)--old object deleted_____________");
		System.out.println(al.isEmpty());
		System.out.println("_________________________ isEmpty()______________");
		al.clear();
		System.out.println(al);
		System.out.println("__________________________clear()______________");		
		System.out.println(al.isEmpty());
		System.out.println("__________________________isEmpty()_____________");
		
		
		
		
		
	}
}
