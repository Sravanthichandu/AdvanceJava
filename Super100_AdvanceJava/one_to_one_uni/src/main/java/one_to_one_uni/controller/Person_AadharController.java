package one_to_one_uni.controller;

import java.util.Scanner;

import one_to_one_uni.dao.AadharDao;
import one_to_one_uni.dao.PersonDao;
import one_to_one_uni.dto.AadharCard;
import one_to_one_uni.dto.Person;

public class Person_AadharController {
	
	/*
    public static void main(String[] args) {
    	
    	//Person person = new Person("lakshmi",21,'f',"ongole",972728887l,null);
    	PersonDao pdao = new PersonDao();
    	pdao.savePersonAadhar(new Person("lakshmi",21,'f',"ongole",972728887l,new AadharCard("lakshmi","narayana","sita","22/02/1999","ongole",76361781762l)));
    	
    	
    	
	
   }*/
   
	static PersonDao pdao = new PersonDao();
	static AadharDao adao = new AadharDao();

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Select option : ");
		System.out.println("1.Person\n2.Aadhar");
		int option = scanner.nextInt();
		switch(option)
		{
		   case 1 :
		   {
			   person();
		   }
		   break;
		   case 2 :
		   {
			   aadhar();
		   }
		   break;
		   default :
			   System.out.println("please Enter valid option..");
			   break;
		}
	}

	public static void aadhar() {

		System.out.println("Choose the option given Below : ");
		System.out.println("1.saveAadhar\n2.UpdateAadhar\n3.DeleteAadhar\n4.FetchAadhar");
		int option = scanner.nextInt();
		switch(option)
		{
	     	case 1 :
	     	{
	     		saveAadhar();
	     	}
	     	break;
	     	case 2 :
	     	{
	     		updateAadharData(); 
	     		
	     	}
	     	break;
	     	case 3 :
	     	{
	     		deleteAadharData();
	     	}
	     	break;
	     	case 4 :
	     	{
	     		fetchAadharData(); 
	     	}
	     	break;
	     	default:System.out.println("please enter valid option");
	     	break;
		
		}
		
	}

	
	public static void saveAadhar() {
	
		System.out.println("Enter Father Name : ");
		String a_fathername = scanner.next();
		System.out.println("Enter Mother Name : ");
		String a_mothername = scanner.next();
		System.out.println("Enter Date Of Birth :");
		String a_dob = scanner.next();
		System.out.println("Enter Address : ");
		String a_address = scanner.next();
		System.out.println("Enter AadharNumber : ");
		long a_aadharnumber = scanner.nextLong();
		
		AadharCard aadhar = new AadharCard(a_fathername,a_mothername ,a_dob,a_address,a_aadharnumber);
	    adao.saveAadhar(aadhar);
		
	}

	public static void fetchAadharData() {
	
		adao.fetchAadhar();
	}

	public static void deleteAadharData() {
	
	    adao.deleteAadhar();
	}
	public static void updateAadharData() {
		AadharCard a = new AadharCard();
		System.out.println("update Aadhar : \n1.FatherName\n2.MotherName\n3.DateOfBirth\n4.Aadhar Address");
		System.out.println("Select an Option : ");
		int option = scanner.nextInt();
		switch (option) 
		{
		   case 1:
		   {
			  System.out.println("Enter Fathername to update : ");
			  String uFname = scanner.next();
			  a.setA_Fathername(uFname);
			  
			  
		   }
	       break;
		   case 2:
		   {

				  System.out.println("Enter Mothername to update : ");
				  String uMname = scanner.next();
				  a.setA_Mothername(uMname);
		   }
	       break;
		   case 3:
		   {
			  System.out.println("Enter DateOfBirth to update : ");
			  String udob = scanner.next();
			 a.setDateOfBirth(udob);
		   }
	       break;
		   case 4:
		   {
			  System.out.println("Enter Address to Update : ");
			  String uaddress = scanner.next();
			  a.setAddress(uaddress);
		   }
	       break;
		 
		  default:System.out.println("Enter valid option to Update..");
			break;
	  }
		
		adao.updateAadhar(a);
		
		
	}

	public static void person() {
	
		System.out.println("Choose the option in Given Below : ");
		System.out.println("1.savePerson\n2.savePerson_Aadhar\n3.UpdatePerson\n4.DeletePerson\n5.FetchPerson");
		int option = scanner.nextInt();
		switch(option)
		{
	     	case 1 :
	     	{
	     		savePersonData();
	     	}
	     	break;
	     	case 2 :
	     	{
	     		savePerson_AadharData();
	     	}
	     	break;
	     	case 3 :
	     	{
	     		updatePersonData();
	     	}
	     	break;
	     	case 4 :
	     	{
	     		deletePersonData();
	     	}
	     	break;
	     	case 5 :
	     	{
	     		fetchPersonData();
	     	}
	     	break;
		}
		
	}

	public static void fetchPersonData() {
	
		pdao.fetchPerson();
	}

	public static void deletePersonData() {
	
	    pdao.deletePerson();
	}

	public static void updatePersonData() {
		Person person = new Person();
		System.out.println("update Person : \n1.PersonName\n2.PersonAge\n3.PersonGender\n4.PersonAddress\n5.PersonPhoneNumber");
		System.out.println("Select an Option : ");
		int option = scanner.nextInt();
		switch (option) 
		{
		   case 1:
		   {
			  System.out.println("Enter name to update : ");
			  String uname = scanner.next();
			  person.setP_name(uname);
			  
		   }
	       break;
		   case 2:
		   {
			  System.out.println("Enter age to update : ");
			  int uage = scanner.nextInt();
			  person.setP_age(uage);
			  
		   }
	       break;
		   case 3:
		   {
			  System.out.println("Enter gender to update : ");
			  char ugender = scanner.next().charAt(0);
			  person.setP_gender(ugender);
		   }
	       break;
		   case 4:
		   {
			  System.out.println("Enter Address to Update : ");
			  String uaddress = scanner.next();
			  person.setP_address(uaddress);
		   }
	       break;
		   case 5:
		   {
			  System.out.println("Enter PhoneNumber to update : ");
			  long uphone = scanner.nextLong();
			  person.setP_phone(uphone);
		   }
	       break;

		  default:System.out.println("Enter valid option to Update..");
			break;
	  }
		
		pdao.updatePerson(person);
		
		
	}

	public static void savePerson_AadharData() {
		System.out.println("Enter person Details : ");
		System.out.println("Enter person Name : ");
		String p_name = scanner.next();
		System.out.println("Enter person Age : ");
		int p_age = scanner.nextInt();
		System.out.println("Enter person Gender : ");
		char p_gender = scanner.next().charAt(0);
		System.out.println("Enter person Address : ");
		String p_address = scanner.next();
		System.out.println("Enter person PhoneNumber : ");
		long p_phonenumber = scanner.nextLong();
		
		Person person = new Person(p_name, p_age,p_gender, p_address,p_phonenumber, null);
		
		System.out.println("Enter Father Name : ");
		String a_fathername = scanner.next();
		System.out.println("Enter Mother Name : ");
		String a_mothername = scanner.next();
		System.out.println("Enter Date Of Birth :");
		String a_dob = scanner.next();
		System.out.println("Enter Address : ");
		String a_address = scanner.next();
		System.out.println("Enter AadharNumber : ");
		long a_aadharnumber = scanner.nextLong();
		
		AadharCard aadhar = new AadharCard(a_fathername,a_mothername ,a_dob,a_address,a_aadharnumber);
		person.setA(aadhar);
		
		pdao.savePerson(person);
		
	
	}

	public static void savePersonData() {

		System.out.println("Enter person Details : ");
		System.out.println("Enter person Name : ");
		String p_name = scanner.next();
		System.out.println("Enter person Age : ");
		int p_age = scanner.nextInt();
		System.out.println("Enter person Gender : ");
		char p_gender = scanner.next().charAt(0);
		System.out.println("Enter person Address : ");
		String p_address = scanner.next();
		System.out.println("Enter person PhoneNumber : ");
		long p_phonenumber = scanner.nextLong();
		Person p1 = new Person(p_name, p_age,p_gender, p_address,p_phonenumber, null);
		
		pdao.savePerson(p1);
		
	}

}


/*
 * one to many
 * person--- bankacc
 * rationcard ---family
 * person---socialmedia
 * 
 * */
 