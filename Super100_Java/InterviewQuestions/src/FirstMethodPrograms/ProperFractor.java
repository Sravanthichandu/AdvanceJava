package FirstMethodPrograms;

import java.util.Scanner;

public class ProperFractor {
	
	public void properFactors(int number)
	{
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				System.out.print(i + " ,");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to print proper factors : ");
		int number =s.nextInt();
		ProperFractor p1 = new ProperFractor();
		p1.properFactors(number);
	}

}
