package com.prowings.principles.loosecoupling;

public class Traveler {
	
	private Vehicle vehicle;
	
	public Traveler(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public void startJourney() {
		vehicle.move();
	}

}
