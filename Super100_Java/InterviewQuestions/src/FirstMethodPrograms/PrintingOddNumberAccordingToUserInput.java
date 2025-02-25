package FirstMethodPrograms;

import java.util.Scanner;

public class PrintingOddNumberAccordingToUserInput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter start value : ");
		int start = s.nextInt();
		System.out.println("Enter end Value   : ");
		int end = s.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
