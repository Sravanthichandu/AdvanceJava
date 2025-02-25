package ecommerce_db.controller;

import java.util.Scanner;

import ecommerce_db.dao.VendorDao;
import ecommerce_db.dto.Vendor;

public class VendorController {

	static Scanner scanner = new Scanner(System.in);
	static VendorDao vdao = new VendorDao();
	public static void main(String[] args) {
		

		System.out.println("Welcome to our Ecommerce site ");
		System.out.println("Choose the option : ");
		System.out.println("1.Register\n2.login\n3.Exit");
		int option =scanner.nextInt();
		boolean isStart = true;
		switch(option)
		{
		   case 1 :
		   {
			   registerVendor();
		   }
		   break;
		   case 2 :
		   {
			   login();
		   }
		   break;
		   case 3:
		   {
			   isStart=false;
		   }
		   break;
 		}
	}
		public static void login() {
		
			System.out.println("Enter email : ");
			String lemail=scanner.next();
			System.out.println("Enter password : ");
			String lpswd = scanner.next();
			vdao.loginVendor(lemail,lpswd);
			
		
	}
		public static void registerVendor() {
			
			
			//Vendor v = new Vendor(0, null, 0, null, null);
			System.out.println("Enter vendor Name : ");
			String vname = scanner.next();
			System.out.println("Enter Email : ");
			String vemail = scanner.next();
			System.out.println("create Password : ");
			String vpassword = scanner.next();
			System.out.println("Enter vendor PhoneNumber : ");
			long vphone = scanner.nextLong();
			Vendor v = new Vendor(0, vname, vphone , vpassword,vemail );
			vdao.saveVendor(v);
		}
	}
	
}
