package FirstMethodPrograms;

import java.util.Scanner;

public class PrintingNaturalNumberAccordingtoUserInput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting range x : ");
		int x = s.nextInt();
		System.out.println("Enter Ending range y : ");
		int y = s.nextInt();
		for(int i=x ; i<=y ; i++)
		{
			System.out.println(i);
		}

	}

}
