package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet {

	public PassengerJet() {

	}

	public PassengerJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);

	}

	@Override
	public void fly() {
		System.out.println("Model: " + this.getModel() + ", Speed: " + this.getSpeed() + ", Range: " + this.getRange() + ", Price: " + this.getPrice() + ", Time Can Fly: " + (this.getSpeed() * this.getRange()));
		
	}

}
