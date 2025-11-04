package com.prowings.principles.openclosed;

public class UPIPayment implements Payment1{
	
	@Override
	public void pay() {
		System.out.println("Paying via UPI");
	}

}
