package FirstMethodPrograms;

import java.util.Scanner;

public class Printing_Username_Userdefined {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Username : ");
		String name = s.next();
		System.out.println();
		System.out.println("Enter How many times that your name should be Print ?");
		int numberOfTimes = s.nextInt();
		for(int i=1;i<=numberOfTimes ;i++)
		{
			System.out.println(name);
		}
		
	
	}

}
