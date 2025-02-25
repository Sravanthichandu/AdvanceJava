package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Operations {
	
	public static void Register() throws SQLException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter UserName : ");
		String userName = sc.next();
		System.out.println("Enter UserAge : ");
		int age = sc.nextInt();
		System.out.println("Enter UserLocation : ");
		String location = sc.next();
		System.out.println("Enter UserPhoneNumber : ");
		Long phoneNumber = sc.nextLong();
		System.out.println("Enter UserAadharNumber : ");
		Long aadhar = sc.nextLong();
		System.out.println("Enter UserEmail : ");
		String email = sc.next();
		System.out.println("Enter UserPassword : ");
		String password = sc.next();
		
		DriverManager.registerDriver(new Driver());
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","root");
		
		PreparedStatement ps = connection.prepareStatement(("Insert into user values(?,?,?,?,?,?,?)"));
		ps.setString(1, userName);
		ps.setInt(2, age);
		ps.setString(3,location);
		ps.setLong(4, phoneNumber );
		ps.setLong(5, aadhar);
		ps.setString(6, email);
		ps.setString(7, password);
		
		ps.execute();
		ps.close();
		connection.close();
		
		System.out.println("Data Registred SuccessFully....");
	}
    public static void Login() throws SQLException
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter Email : ");
    	String email = s.next();
    	System.out.println("Enter Password : ");
    	String password = s.next();
    	
    	DriverManager.registerDriver(new Driver());
    	
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root", "root");
    	
    	PreparedStatement ps = con.prepareStatement(("select useremail,userpassword from user" ));
    	
    	ResultSet r =ps.executeQuery();
    	while(r.next())
    	{
    		String useremail = r.getString(1);
    		String userpassword  = r.getString(2);
    		if(useremail.equals(email))
    		{
    			if(userpassword.equals(password))
    			{
    				System.out.println("Login SuccessFully..");
    			}
    			else
    			{
    				System.out.println("Incorrect Password");
    			}
    		}
    		else
    		{
    			System.out.println("Incorrect email");
    		}
    	}
    	
    	
    	
    }
   
    public static void Delete()
    {
    	
    }
    public static void exit()
    {
    	System.out.println("ThankYou");
    }
	public static void main(String[] args) {
		
		
	}
}
