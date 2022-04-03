package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {

	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);

	}

	@Override
	public void fight() {

		System.out.println("This jet fights!");

	}

	@Override
	public void fly() {
		System.out.println("Vroom, Fight, Fight, Fight!");
	}

}
