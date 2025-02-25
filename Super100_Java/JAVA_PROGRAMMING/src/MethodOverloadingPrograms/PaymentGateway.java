package MethodOverloadingPrograms;

public class PaymentGateway {

	public void payment(String UpiId)
	{
		System.out.println("Payment Done By Using upiId : "+UpiId);
	}
	public void payment(long DebitcardNumber ,int ExpiryDate , int CVV)
	{
		System.out.println("Payment Done By Using DebitCard : "+DebitcardNumber);
		System.out.println("ExpiryDate : "+ExpiryDate);
		System.out.println("CVV : "+CVV);
	}
	public void netBanking(String netBanking , int otp)
	{
		System.out.println("Payment Done By Using netBanking : "+netBanking);
		System.out.println("otp : "+otp);
	}
	public static void main(String[] args) {
	
		PaymentGateway payment = new PaymentGateway();
		payment.payment("8AS92745800HFS");
		

	}

}
