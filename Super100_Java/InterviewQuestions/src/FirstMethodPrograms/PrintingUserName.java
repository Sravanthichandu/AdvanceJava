package FirstMethodPrograms;

import java.util.Scanner;

public class PrintingUserName {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter user name : ");
		String username = s.next();
		for(int i=1;i<=25;i++)
		{
			System.out.println(username);
		}

	}

}
