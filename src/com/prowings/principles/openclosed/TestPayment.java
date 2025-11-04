package com.prowings.principles.openclosed;

public class TestPayment {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Payment1 creditCardPayment = new PaytmPayment();
		
		creditCardPayment.pay();
		
		
		
		System.out.println("main method ended");
		
	}

}
