package Approach5;

import java.util.Scanner;

public class SIOBE {

	public static void main(String[] args) {
		
		System.out.println("Main Starts ");
		
		String s = "Java";
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter index number to char value : ");
		
		int index = s1.nextInt();
		int chances=0;
		while(true)
		{

			try
			{
				System.out.println(s.charAt(index));
				break;
			}
			catch(StringIndexOutOfBoundsException e)
			{
				
				System.out.println("Re-Enter the valid index number "+(3-chances)+"chances");
				index = s1.nextInt();
				if(chances==3)
				{
					System.out.println("you have crossed minimum chances ");
					break;
				}
				chances++;
				
			}
		}

		
		System.out.println("Main Ends");

	}

}
