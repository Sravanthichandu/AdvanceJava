package com.user;

import java.sql.SQLException;
import java.util.Scanner;

public class User {

	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("1.Register\n2.Login\n3.Update\n4.Delete\n5.Exit");
		System.out.println("Enter required operation Number : ");
		int operationNumber = scanner.nextInt();
		
		switch(operationNumber)
		{
		     case 1 : {
			             Operations.Register();
			             break;
		              }
		     case 2 : {
	                     Operations.Login();	
	                     break;
		              }
		     case 3 :{
		    	        
		    	        break;
		             }
		     case 4 :{
		    	        Operations.Delete();
		    	        break;
		             }
		     case 5 :{
		    	        Operations.exit();
		    	        break;
		             }
		     default :{
		    	        System.out.println("choose valid Operation Number");
		              }
		     }
		}
	}
