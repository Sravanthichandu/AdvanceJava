package FirstMethodPrograms;

import java.util.Scanner;

public class PerfecetNumbersBetweenUserRange {

	
	public int printingPerfectNumbers(int number)
	{
		int sum=0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum = sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a starting Range to print perfect numbers : ");
		int start = s.nextInt();
		System.out.println("Enter a Ending Range to print perfect numbers : ");
		int end = s.nextInt();
		for(int i=start ; i<=end;i++)
		{
			PerfecetNumbersBetweenUserRange perfectnumberobj1 = new PerfecetNumbersBetweenUserRange();
			if (perfectnumberobj1.printingPerfectNumbers(i)==i)
			{
		        	System.out.print(i+",");
						
			}
		}
	}

}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * perfectnumber printing 1 to 5
 * 1.ranges --- 1 5
 * perfectnumber
 * 1  -1- 1%1==0(t)
 * 1  -2 -1%2==0(f)
 * -------------------------------
 * 2  - 1 - 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
