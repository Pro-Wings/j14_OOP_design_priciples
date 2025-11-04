package com.prowings.principles.openclosed;

public class GooglePayPeyment implements Payment1 {
	@Override
	public void pay() {
		System.out.println("Paying via Google Pay");
	}

}
