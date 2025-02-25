package ecommerce_db.controller;

import java.util.Scanner;

import ecommerce_db.dao.VendorDao;
import ecommerce_db.dto.Vendor;

public class VendorController {

	//static variables
	static String vname;
	static String vemail ;
	static String vpassword ;
	static long vphone;
	
	static Scanner scanner = new Scanner(System.in);
	static VendorDao vdao = new VendorDao();
	public static void main(String[] args) {
		
		System.out.println("Welcome to our Ecommerce site ");
		System.out.println("Choose the option : ");
		System.out.println("1.Register\n2.login\n3.Exit");
		int option =scanner.nextInt();
		boolean isStart = true;
		while(true)
		{
			switch(option)
			{
			   case 1 :
			   {
				   registerVendor();
			   }
			   break;
			   case 2 :
			   {
				   loginVendor();
			   }
			   break;
			   case 3:
			   {
				   isStart=false;
			   }
			   break;
	 		}
		}
	
	}
	
	public static void loginVendor() {
		
		System.out.println("Please Enter Your Login Credientials : ");
		System.out.println("Email : ");
		String lEmail=scanner.next();
		System.out.println("Password : ");
		String lpassword = scanner.next();
		Vendor v = new Vendor(vname,vphone,lEmail,lpassword);
		vdao.loginVendor(v);
		
		
	}
	public static void registerVendor() {
	
		//Vendor v = new Vendor();
		System.out.println("Enter vendor Name : ");
		 vname = scanner.next();
		System.out.println("Enter Email : ");
	     vemail = scanner.next();
		System.out.println("create Password : ");
		vpassword = scanner.next();
		System.out.println("Enter vendor PhoneNumber : ");
		vphone = scanner.nextLong();
		Vendor v = new Vendor(vname, vphone ,vemail, vpassword );
		vdao.saveVendor(v);
	}
}
