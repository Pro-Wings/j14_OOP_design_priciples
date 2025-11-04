package com.prowings.principles.tightcoupling;

public class Traveler {

//	private Car car = new Car(); // 🚨 Tight coupling!
//	private Bus bus = new Bus(); // 🚨 Tight coupling!
	private Bike bike = new Bike(); // 🚨 Tight coupling!
	
	public void startJourney() {
//		car.move();
//		bus.move();
		bike.move();
	}

}
