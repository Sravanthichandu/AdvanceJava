package Level1Programming;

import java.util.Random;
import java.util.Scanner;

public class WhatsApp {

	public static void phoneNumber()
	{
		Scanner wtsapp=new Scanner(System.in);
		System.out.println("To start with the wtsapp Login with PhoneNumber :");
		System.out.println("Enter your PhoneNumber ");
		long phoneNumber = wtsapp.nextLong();
		
		WhatsApp wts=new WhatsApp();
		wts.otpGeneration();

	}
	public static void welcome()
	{
		String welcomeMessage= "Getting start with whatsap \uD83D\uDE0A\";";
		System.out.println(welcomeMessage);
				
	}
	public void otpGeneration()
	{
		System.out.println("OTP :");
		Random r = new Random();
		int otp=r.nextInt(100);
		System.out.println(otp);
		System.out.println("Please Enter Otp : ");
		Scanner otpp = new Scanner(System.in);
		int otpNumber = otpp.nextInt();		
	}
	public static void main(String[] args) {
		phoneNumber();

	}

}
