package com;

import java.util.List;

public class Demo1 {

      public static void main(String[] args) {
		
    	  //easy way to create list in java and initiliaze -- java9 features
    	  List<String> words = List.of("Apple","Mango","Grapes");
    	  
    	  //size method -- array -- length()
    	  System.out.println( words.size());
    	  
    	  //checking list is empty or not by using isEmpty()
    	  
    	  System.out.println(words.isEmpty());
    	  
    	  //getting object based on index
    	  
    	  System.out.println(words.get(1));
    	  
    	  //returning object based on index
    	  
    	  System.out.println(words.indexOf("Grapes"));
    	  
    	  //if object is not present in list return -1
    	  System.out.println(words.indexOf("Java"));
    	  
    	  
    	
    	  
    	  
	}	
}

