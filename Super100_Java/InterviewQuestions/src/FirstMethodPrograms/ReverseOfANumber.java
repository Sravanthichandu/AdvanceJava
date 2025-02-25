package FirstMethodPrograms;

import java.util.Scanner;

public class ReverseOfANumber {

	public void Reverse(int number)
	{
		int reverse=0;
		while(number>0)
		{
			int ld = number%10;
			reverse = reverse*10+ld;
			number/=10;
		}
		System.out.println("Reverse of a number is : " + reverse);
			
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to reverse : ");
		int number = s.nextInt();
		ReverseOfANumber r = new ReverseOfANumber();
		r.Reverse(number);
		

	}

}
