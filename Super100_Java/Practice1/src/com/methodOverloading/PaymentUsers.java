package com.methodOverloading;

public class PaymentUsers extends PaymentGateway {

	public static void main(String[] args) {
		
		PaymentUsers u1 = new PaymentUsers();
		u1.payment("Upiaditya@12345", 205);
	}

}
