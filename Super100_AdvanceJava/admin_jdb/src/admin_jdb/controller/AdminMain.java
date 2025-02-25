package admin_jdb.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

import admin_jdb.dao.AdminCrud;
import admin_jdb.dto.Admin;

//UI 

public class AdminMain {
    static Scanner s = new Scanner(System.in);
 
	static AdminCrud admincrud = new AdminCrud();
	public static void main(String[] args) throws SQLException {
		admincrud.createTables();
		System.out.println("created");
		
	    Scanner s = new Scanner(System.in);
		System.out.println("-----Welcome------");
		boolean start=true;
		while(start)
		{
			System.out.println("1.Register\n2.Login\n3.exit");
			System.out.println("select an option : ");
			int option = s.nextInt();
			switch (option) {
			case 1: {
				register();
				
			}break;
			case 2: {
				Login();
				
			}break;
			case 3: {
				start=false;
				
			}break;
			default: System.out.println("invalid option");
			}
		}
	}

	 private static void Login() {
		System.out.println("Enter email :");
		String email = s.next();
		System.out.println("Enter password : ");
		String password = s.next();
		Admin admin = admincrud.loginAdmin(email, password);
		if(admin!=null)
		{
			
		}
		else
		{
			System.err.println("Invalid data..try with correct data");
			Login();
		}
		
	}

	
	private static void register() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = s.nextInt();
		System.out.println("Enter name : ");
		String name = s.next();
		System.out.println("Enter email : ");
		String email = s.next();
		System.out.println("Enter password : ");
		String password = s.next();
		System.out.println("Enter phoneNumber : ");
		long phone = s.nextLong();
		Admin admin = new Admin(id,name,email,password,phone);
		
		
		try {
			admincrud.saveAdmin(admin);
		}
		catch(Exception e) {
			
			System.err.println("Data already Exists try again with new data");
			register();
		}
		
	}
		
	}
