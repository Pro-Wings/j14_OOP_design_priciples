package com.prowings.principles.openclosed;

public class CreditCardPayment implements Payment1{

	@Override
	public void pay() {
		System.out.println("Paying via Credit Card");
	}

}
