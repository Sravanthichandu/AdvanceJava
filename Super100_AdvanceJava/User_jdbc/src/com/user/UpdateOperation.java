package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.*;
import java.util.Scanner;

public class UpdateOperation {

	 public static void Update() throws SQLException
	    {
	        Scanner s = new Scanner(System.in);	
	    	System.out.println("1.UpdateByName\n2.UpdateByAge\n3.UpdateByLocation\n4.UpdateByPhoneNumber\n"
	    			+ "5.UpdateByAAdhar\n6.UpdateByEmail\n7.UpdateByPassword");
	    	System.out.println("Enter valid Number for Update : ");
	    	int number = s.nextInt();
	   	
	        switch(number)
	        {
	          case 1 : {
	        	          System.out.println("Enter previous Name : ");
	        	          String name = s.next();
	        	          System.out.println("Enter name for Update : ");
	        	          String uname = s.next();
	        	          DriverManager.registerDriver(new Driver());
	        	          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?user=root&password=root");
	        	          PreparedStatement ps = con.prepareStatement(("update user set "));
	        	          
	                   }
	          case 2 : {
	        	  
              }
	          case 3 : {
	        	  
              }
	          case 4 : {
	        	  
              }
	          case 5 : {
	        	  
              }
	          case 6 : {
	        	  
              }
	          case 7 : {
	        	  
              }
	        }
	    	
	    	
	    	
	    }
	
}
