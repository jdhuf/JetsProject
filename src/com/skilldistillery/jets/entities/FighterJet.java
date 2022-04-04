package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {

	}

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);

	}

	@Override
	public void fight() {

		System.out.println("This jet fights!");

	}

	@Override
	public void fly() {
		System.out.println("Model: " + this.getModel() + ", Speed: " + this.getSpeed() + ", Range: " + this.getRange() + ", Price: " + this.getPrice() + ", Time Can Fly: " + (this.getSpeed() / this.getRange()));
	}

}
