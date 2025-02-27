package com;

import java.util.Enumeration;
import java.util.Stack;

public class BookMain {
	
	public static void main(String[] args) {
		
		Books b1 = new Books("Java","JamesGosling",500,123);
		Books b2 = new Books("Python","GudioVanRosum",350,456);
		Books b3 = new Books("Cleancode","Robert",900,789);
		Books b4 = new Books("IntroductionToAlgorithms","Thomas",1200,678);
		Books b5 = new Books("The C Programming ","DennisRitchie",780,890);
		
		
		Stack stack = new Stack();
		
		System.out.println("Checking stack is Empty or not :");
		System.out.println(stack.empty());
		
		System.out.println("---------------------------------------------");
		
		stack.push(b1);
		stack.push(b2);
		stack.push(b3);
		stack.push(b4);
		stack.add(1, b5);
		
		System.out.println("printing Book details :");
		System.out.println("_______________________________________________");
		
		for(Object obj : stack)
		{
			Books b = (Books)obj;
			b.Display();
			System.out.println("-----------------------------------------");
		}
		System.out.println("_______________________________________________");
		System.out.println();
		System.out.println("top Element in Stack :");
		System.out.println();
		System.out.println(stack.peek());
		System.out.println("_______________________________________________");
		
		System.out.println("Checking stack is Empty or not :");
		System.out.println(stack.empty());
		System.out.println("_______________________________________________");
		System.out.println();
		
		System.out.println("Checking stack size : ");
		System.out.println(stack.size());
		
		System.out.println("_____________________________________________");
		
		System.out.println("Checking stack capacity : ");
		System.out.println(stack.capacity());
		
		System.out.println("_____________________________________________");
		/*while(stack.size()>0)
		{
			System.out.println(stack.pop());
			System.out.println("------------------------");
		}*/
		System.out.println("_____________________________________________");
		System.out.println("Searching stack element : ");
		
		/*for(Object obj : stack)
		{
			Books b = (Books)obj;
			if(b.getBookName().equalsIgnoreCase("Java"))
			{
				System.out.println(stack.search(stack));
			}
		}*/
		
		Enumeration <Books> enu = stack.elements();
		
		while(enu.hasMoreElements())
		{
			Books b = enu.nextElement();
			if(b.getBookName().equalsIgnoreCase("Java"))
			{
				System.out.println(stack.search(b));
			}
		}
		
	
	}

}
