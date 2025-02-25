package One_to_many_uni.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

import One_to_many_uni.dao.BankAccountsDao;
import One_to_many_uni.dao.PersonDao;
import One_to_many_uni.dto.BankAccounts;
import One_to_many_uni.dto.Person;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static PersonDao pdao = new PersonDao();
	public static void main(String[] args) {
		
		/*     static way of passing
		 * BankAccounts accounts = new BankAccounts(100001,"ICICI","ICICI32415taIc,"Kphp")
		 *
		 * 
		 * accounts is a list type we cannot directly pass through into the person object 
		 * while saving person and bankaccount at a time
		 * 
		 * List<BankAccounts>list= new ArrayList<BankAccounts>();
		 * list.add(accounts);
		 * 
		 * Person p = new Person("A",23,"A@gm",234,"hyd",956728638,list);
		 * */
	
	System.out.println("Choose the Option : \n1.Person\n2.BankAccount");
	int option = scanner.nextInt();
	boolean isstart=true;
	while(isstart)
	{
		switch(option)
		{
		   case 1 :
		   {
			   personDetails();
			 
		   }
		   break;
		   case 2 :
		   {
			 bankAccountDetails();   
		   }
		   break;
		   case 3 :
		   {
			   isstart=false;
		   }
		   break;
		}
	}
	}
	public static void bankAccountDetails() {
		System.out.println("1.SaveBankAccount\n2.UpdateBankAccount\n3.DeleteBankaccount\n4.FetchBankAccount");
		int option = scanner.nextInt();
		boolean isstart=true;
		switch(option)
		{
		  case 1 :
		  {
			  saveBankAccountDetails();
		  }
		  break;
		}
		
	}
	public static void saveBankAccountDetails() {
		BankAccountsDao bdao = new BankAccountsDao();
		System.out.println("Enter Person Id : ");
		int id = scanner.nextInt();
		System.out.println("Enter BankAccountNumber : ");
		long bankAccNum = scanner.nextLong();
		System.out.println("Enter BankName : ");
		String bname = scanner.next();
		System.out.println("Enter IFSC code : ");
		String ifsc = scanner.next();
		System.out.println("Enter Branch : ");
		String branch = scanner.next();
		BankAccounts accounts = new BankAccounts(bankAccNum,bname,ifsc,branch);
	
		bdao.saveAccount(id, accounts);
		
		
	}
	public static void personDetails() {
		 System.out.println("select required Task : \n1.SavePerson\n2.SavePerson_BankAccounts\n3.UpdatePerson\n4.DeletePerson\n5.FetchPerson");
		 int option=scanner.nextInt();
		 switch(option)
		 {
		    case 1 :
		    {
		    	savePersonDetails();
		    }
		    break;
		    case 2 :
		    {
		    	savePerson_AccountDetails();
		    }
		    break;
		    case 3 :
		    {
		    	UpdatePerson();
		    }
		    break;
		    case 4 :
		    {
		    	deletePerson();
		    }
		    break;
		    case 5 :
		    {
		    	fetchPerson();
		    }
		 }
		
	}
	public static void fetchPerson() {
		
		
	}
	public static void deletePerson() {
		
	}
	public static void UpdatePerson() {
		System.out.println();
		
	}
	public static void savePerson_AccountDetails() {
		
		System.out.println("Enter Person Name : ");
		String name = scanner.next();
		System.out.println("Enter Address : ");
		String address = scanner.next();
		System.out.println("Enter Person Email : ");
		String email = scanner.next();
		System.out.println("create Password : ");
		String password = scanner.next();
		System.out.println("Enter Phone Number : ");
		long phone = scanner.nextLong();
        //System.out.println();
		System.out.println("Enter BankAccountNumber : ");
		long bankAccNum = scanner.nextLong();
		System.out.println("Enter BankName : ");
		String bname = scanner.next();
		System.out.println("Enter IFSC code : ");
		String ifsc = scanner.next();
		System.out.println("Enter Branch : ");
		String branch = scanner.next();
		BankAccounts account = new BankAccounts(bankAccNum,bname,ifsc,branch);
		//bankaccounts is a list type add into list
		ArrayList<BankAccounts> list = new ArrayList<BankAccounts>();
		list.add(account);
		Person person = new Person(name,email,password,address,phone,list);
		pdao.savePerson(person);
		
		
		
	}
	public static void saveAccountDetails() {
		System.out.println("Enter BankAccountNumber : ");
		long bankAccNum = scanner.nextLong();
		System.out.println("Enter BankName : ");
		String bname = scanner.next();
		System.out.println("Enter IFSC code : ");
		String ifsc = scanner.next();
		System.out.println("Enter Branch : ");
		String branch = scanner.next();
		
	}
	public static void savePersonDetails() {
		
		System.out.println("Enter Person Name : ");
		String name = scanner.next();
		System.out.println("Enter Address : ");
		String address = scanner.next();
		System.out.println("Enter Person Email : ");
		String email = scanner.next();
		System.out.println("create Password : ");
		String password = scanner.next();
		System.out.println("Enter Phone Number : ");
		long phone = scanner.nextLong();
		Person person = new Person(name,email,password,address,phone);
		
		pdao.savePerson(person);
		
		
		
	}
}
