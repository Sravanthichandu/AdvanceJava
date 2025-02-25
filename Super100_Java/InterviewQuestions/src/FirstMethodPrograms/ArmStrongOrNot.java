package FirstMethodPrograms;

import java.util.Scanner;

public class ArmStrongOrNot {
	
	public static int isArmStrong(int number)
	{
		int temp=number;
		int count=0;
		int sum=0;
		while(temp>0)
		{
			temp /=10;
			count++;
		}
		while(number>0)
		{
			int ld = number%10;
			int exp=1;
			for(int i=1;i<=count;i++)
			{
				exp=exp*ld;
			}
			sum=sum+exp;
			number/=10;
		}
		return sum;
	}

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check whether number is Armstrong or not :");
		int number = s.nextInt();
		if(isArmStrong(number)==number)
		{
			System.out.println("ArmStrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
		
	}

}
