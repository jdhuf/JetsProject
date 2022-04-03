package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {

	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);

	}
	

	@Override
	public void loadCargo() {
		System.out.println("This plane carries cargo.");
	}

	@Override
	public void fly() {
		System.out.println("I carry heavy things.");
		
	}

}
