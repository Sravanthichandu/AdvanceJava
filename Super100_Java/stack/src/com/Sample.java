package com;

import java.util.Stack;

public class Sample {

	//pushing Elements on the top of the stack
	public static void stackPush(Stack<Integer>  stack)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		
	}
	
	//poping elements 
	
	public static void stackPop(Stack<Integer> stack)
	{
		for(int i=1;i<=5;i++)
		{
			Integer i = (Integer)stack.pop();
		}
		
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stackPush(stack);
		stackPop(stack);
		
		
		
	}
}
