package FirstMethodPrograms;

import java.util.Scanner;

public class PrintingNSpyNumbers {
	
	public static void printingSpyNumbers(int n)
	{
		int count=0;
		int i=1;
		while(count<n)
		{
			int sum=0;
			int product=1;
			while(n>0)
			{
				int ld=i%10;
				sum=sum+ld;
				product=product+ld;
				if(sum==product)
				{
				  System.out.println(i + ",");	
				  i++;
				}
				i/=10;
			}
			count++;
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in );
		System.out.println("Enter n to print n spy numbers : ");
		int n = s.nextInt();
		printingSpyNumbers(n);
	}

}
