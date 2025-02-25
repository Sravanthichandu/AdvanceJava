/*Write a program to perform login operation using username and password */

package Strings;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		String UserName="Hamitha";
		String Password="123@Hamitha";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String username=s.next();
		System.out.println("Enter Password : ");
		String pswd = s.next();
		if(username.equals(UserName)&&pswd.equals(Password))
		{
			System.out.println("Login successfull");		
		}
		else
		{
			System.out.println("Invalid Data");
		}
		
		
	}

}
