package com;

import java.util.function.Function;
public class Sample {

	public static void main(String[] args) {
		
		Function<String ,String> f = (s)->s.replace(" ","");
		System.out.println(f.apply("Java Developer"));
		
	}
}
