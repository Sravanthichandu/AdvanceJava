package FirstMethodPrograms;

import java.util.Scanner;

public class HcfOfTwoDigits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First number :");
		int n1 = s.nextInt();
		System.out.println("Enter Second number :");
		int n2 = s.nextInt();
		System.out.println("Enter Third number :");
		int n3 = s.nextInt();
		System.out.println("Enter fourth number :");
		int n4 = s.nextInt();
		int hcf=0;
		for(int i=1;i<=n1||i<=n2||i<=n3 || i<=n4 ;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				hcf=i;
			}
		}
		System.out.println("HCF of Two numbers "+ n1 + " and " + n2 + " is : "+hcf);

	}

}
