package com;
import java.util.function.Consumer;
public class Demo {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("JAVA");
		//System.out.println(sb.reverse());
		Consumer<String> c = (s)->System.out.println(sb.reverse());
		c.accept(sb+"");

		
		
	}
}
