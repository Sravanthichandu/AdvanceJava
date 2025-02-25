package com.methodOverloading;

public class PaymentGateway {
	
	public void payment(String upid)
	{
		System.out.println("Payment Processed using UPID");
	}
	public void payment(long debitCard,int expDate,int cvv )
	{
		System.out.println("Payment Processed using DebitCard");
		System.out.println("DebitCard : "+debitCard);
		System.out.println("ExpiryDate: "+expDate);
		System.out.println("CVV       : "+cvv);
	}
	public void payment(String netbanking,int otp)
	{
		System.out.println("Payment Processed using NetBanking");
	}

	public static void main(String[] args) {
		

	}

}
