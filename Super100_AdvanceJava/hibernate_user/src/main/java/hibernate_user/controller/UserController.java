package hibernate_user.controller;

import java.util.Scanner;

import hibernate_user.dao.UserDao;
import hibernate_user.dto.User;

public class UserController {
	static Scanner scanner = new Scanner(System.in);
	static UserDao dao = new UserDao();
	public static void main(String[] args) {
		
		/*static query
		UserDao dao = new UserDao();
		
		dao.saveUser(new User(1,"hari","hari@gmail.com","123",782435276));
		dao.fetchUser(11); */
		
		
		System.out.println("select an option : ");
		System.out.println("1.saveData\n2.updateData\n3.deleteData\n4.fetchData\n5.fetchAllData\n6.exit");
		int option = scanner.nextInt();
		boolean isstart=true;
		switch(option)
		{
		    case 1 :
		    {
		        saveUser();	
		    }
		    break;
		    case 2 :
		    {
		       updateuser();	
		    }
		    break;
		    case 3 :
		    {
		    	deleteUser();
		    }
		    break;
		    case 4 :
		    {
		    	fetchUser();
		    }
		    break;
		    case 5 :
		    {
		    	fetchAll();
		    }
		    case 6 :
		    {
		    	System.out.println("Thankyou");
		    	isstart=false;
		    }
		    
		}
	}
    public static void fetchAll() {
		dao.fetchAll();
		
	}
	public static void updateuser() {
	User user = new User();
	System.out.println(
			"Update by using \n1.UpdateByName\n2.UpdateByEmail\n3.UpdateByPassword\n4.UpdateByPhoneNumber");
	int num = scanner.nextInt();
	switch (num) {
	case 1: {
		System.out.println("Enter user id : ");
		int id = scanner.nextInt();
		System.out.println("Enter Name to update : ");
		String nameupadte = scanner.next();
		user.setName(nameupadte);
			

	}
		break;
	case 2: {
		System.out.println("Enter Email to Update : ");
		String emailupadte = scanner.next();
		user.setEmail(emailupadte);
		
	}
		break;
	case 3: {
		System.out.println("Enter Password to Update : ");
		String passwordupadte = scanner.next();
		user.setPassword(passwordupadte);
	}
		break;
	case 4: {
		System.out.println("Enter PhoneNumber to Update : ");
		long phoneupadte = scanner.nextLong();
		user.setPhone(phoneupadte);
	}
		break;

	default:
		System.out.println("Enter Valid Option");
		break;
	}
	
	dao.updateUser(user);
  }
	

	public static void deleteUser() {
		System.out.println("Please Enter User Id : ");
		int userid = scanner.nextInt();
		dao.deleteUser(userid);
		System.out.println("Data Deleted successfull");
		
	}
	public static void fetchUser() {
		System.out.println("Please Enter User Id : ");
		int userid = scanner.nextInt();
		System.out.println("User Data : ");
		dao.fetchUser(userid);
		
		
	}
	public static void saveUser()
	{
		
		System.out.println("Please Provide Below Data :  ");
		System.out.println("Enter user ID : ");
		int userId = scanner.nextInt();
		System.out.println("Enter user Name : ");
		String userName = scanner.next();
		System.out.println("Enter user Email : ");
		String userEmail = scanner.next();
		System.out.println("Enter user Password : ");
		String userpassword = scanner.next();
		System.out.println("Enter user PhoneNumber : ");
		long userPhone = scanner.nextLong();
		try
		{
		   dao.saveUser(new User(userId,userName,userEmail,userpassword , userPhone));
		}
		catch(Exception e)
		{
			System.out.println("Data Already Exists try again with new Data (yes /No ) :");
			String s = scanner.next();
			if(s.equalsIgnoreCase("yes"))
			{
				dao.saveUser(new User(userId,userName,userEmail,userpassword , userPhone));	
			}
			else
			{
				System.out.println("ThankYou Try Again..");
			}		
			
		}
		
	}
}
		
