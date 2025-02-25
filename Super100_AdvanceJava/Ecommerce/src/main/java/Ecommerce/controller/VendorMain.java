package Ecommerce.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import Ecommerce.dao.VendorDb;
import Ecommerce.dto.Shop;
import Ecommerce.dto.Vendor;
import hibernate_user.dto.User;

public class VendorMain {
	static Scanner scanner = new Scanner(System.in);
	static VendorDb vdb = new VendorDb();

	public static void main(String[] args) {
		
		System.out.println("....Welcome to Our Ecommerce Website ....");
		boolean isStart=true;
		while(isStart)
		{
			System.out.println("Select an option....");
			System.out.println("1.Register\n2.Login\n3.Exit");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
			  {
			      register();
			  }
				break;
			case 2:
		      {
		    	  login();
		      }
			break;
			case 3:
		      {
		    	 System.out.println("Thankyou for visting .. vist Re-again");
		    	 isStart=false;
		      }
			break;

			default:System.out.println("Enter valid option");
				break;
			}
			
		}
		
	}

	private static void login() {
		
		System.out.println("Enter Email : ");
		String email = scanner.next();
		System.out.println("Enter Password : ");
		String password = scanner.next();
	    vdb.loginAdmin(email, password);
	}

	private static void register() {
		System.out.println("Enter your name : ");
		String name = scanner.next();
		System.out.println("Enter your PhoneNumber : ");
		long phone = scanner.nextLong();
		System.out.println("Enter your email : ");
		String email = scanner.next();
		System.out.println("Create password  : ");
		String password = scanner.next();
        Vendor v = new Vendor(name,phone,email,password);
        try
        {
          vdb.saveProfile(v);
        }
        catch(Exception e)
        {
        	System.out.println("please enter correct Details ");
        	register();
        }
			
	}
	public static  void shop() throws SQLException, IOException
	{
		System.out.println("Enter shop Name : ");
		String shopName = scanner.next();
		System.out.println("Enter shop Type : ");
		String shopType = scanner.next();
		System.out.println("Enter shop Location : ");
		String shopLocation = scanner.next();
		System.out.println("Enter shop Owner Name : ");
		String shopOwnername = scanner.next();
		Shop s = new Shop(shopName , shopType, shopLocation,  shopOwnername);
		vdb.createShop(s);
		
	}
	


}
