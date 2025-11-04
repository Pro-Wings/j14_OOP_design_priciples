package com.prowings.principles.loosecoupling;

public class TestCoupling {
	
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		Bus bus = new Bus();	
		Car car = new Car();
		Helicopter helicopter = new Helicopter();
		
		Traveler traveler = new Traveler(helicopter);
		
		traveler.startJourney();
		
	}

}
