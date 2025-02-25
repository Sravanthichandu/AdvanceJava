package Strings;

import java.util.Scanner;

public class Program4_2Model {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String username=s.next();
		System.out.println("Enter Password : ");
		int pswd = s.nextInt();
		if(username.equals("Admin"))
		{
			if(pswd==123)
			{
				System.out.println("Login Successfull");
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid Username");
		}

	}

}
