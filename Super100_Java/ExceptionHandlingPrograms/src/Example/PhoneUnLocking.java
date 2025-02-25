package Example;

import java.util.Scanner;

class User
{
	String password="1673Srav's";
}
class PhonePassword extends User
{
	
}
public class PhoneUnLocking 
{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter password: ");
		String pswd = s.next();
		User u = new User();
		if(u.password.equals(pswd))
		{
		  System.out.println("Phone UnLocked");	
		}
		else
		{
			try
			{
				System.out.println("Enter Password");
			}
			catch()
			{
				
			}
		}
	}

}