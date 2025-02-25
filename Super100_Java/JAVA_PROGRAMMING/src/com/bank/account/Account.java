package com.bank.account;

import java.util.Random;
import java.util.Scanner;

public class Account {
	
	int accountNumber;
	String accountHolderName;
	int ifscCode;
	String accountType;
	String branchName;
	long mobileNumber;
	
	Random r = new Random();
	
	public Account(String accountHolderName,String accountType,String branchName,long mobileNumber)
	{
		int accountNumber = r.nextInt(1234567899);
		int ifscCode      = r.nextInt(123456);
		if(validateAccountType(accountType))
		{
			this.accountType=accountType;
		}
		else
		{
			System.out.println("Invalid accountType");
		}
		if(validatebranchName(branchName))
		{
			this.branchName=branchName;
		}
		else
		{
			System.out.println("Invalid Branch Name");
		}
		if(validateMobileNumber(mobileNumber))
		{
			this.mobileNumber=mobileNumber;
		}
		else
		{
		   System.out.println("Invalid mobileNumber");	
		}
	}
	
	
	public boolean validateAccountType( String accountType)
	{
		if(accountType.equalsIgnoreCase("Saving")||accountType.equals("Personalaccount")||accountType.equalsIgnoreCase("currentAccount"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validatebranchName(String branchName)
	{
		if(branchName.equalsIgnoreCase("Hyderbad")||branchName.equalsIgnoreCase("Madhapur") || branchName.equalsIgnoreCase("secundraBad"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean validateMobileNumber(long mobilenumber)
	{

		int count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Mobile Number : ");
        int number = s.nextInt();
		while(number>10)
		{
			count = count+1;
			number/=10;
		}
		if(count==10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public Boolean validateName(String accountHolderName)
	{
		Scanner s = new Scanner(System.in);
		String name = s.next();
		if(name==name)
		{
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
	}

}
