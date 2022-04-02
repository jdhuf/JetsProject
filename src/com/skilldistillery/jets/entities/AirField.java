package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class AirField {

	private List<Jet> jets;// fleet

	public AirField() {
		jets = new ArrayList<>();

		readFromFile("jets.txt");
//		System.out.println(jets);
	}

	public List<Jet> readFromFile(String fn) {

	//	List<Jet> readJets = new ArrayList<>();

		try (BufferedReader bufIn = new BufferedReader(new FileReader(fn))) {
			String line;

			while ((line = bufIn.readLine()) != null) {
				String[] jetInfo = line.split(",");
		//		System.out.println(jetInfo);

				String typeJet = jetInfo[0];
				String model = jetInfo[1];
				double speed = Double.parseDouble(jetInfo[2]);
				int range = Integer.parseInt(jetInfo[3]);
				long price = Long.parseLong(jetInfo[4]);

				
				

				switch (jetInfo[0]) {

				case "Passenger Jet":
					PassengerJet passJet = new PassengerJet(model, speed, range, price);
					jets.add(passJet);
					break;
				case "Cargo Plane":
					CargoPlane cargoPl = new CargoPlane(model, speed, range, price);
					jets.add(cargoPl);
					break;
				case "Fighter Jet":
					FighterJet fightJet = new FighterJet(model, speed, range, price);
					jets.add(fightJet);
					break;

				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return jets;

	}

	public List<Jet> getJets() {
	//	System.out.println(jets);
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}

	public void displayJets() {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(jets.get(i));
			System.out.println();
		}
	}
	
	public void fly() {
		System.out.println("flying from AirField");
		System.out.println();
		
	}
	
	public void viewFastest () {
		System.out.println("Fastest jet: ");
		System.out.println();
	}
	
	public void viewLongestRange () {
		System.out.println("Longest range: ");
		System.out.println();
	}
	
	public void loadCargoJets () {
		System.out.println("Loading cargo jets");
		System.out.println();
	}
	
	public void dogFight () {
		System.out.println("Dog Fight!");
		System.out.println();
	}
	
	public void addJet () {
		System.out.println("Adding jet");
		System.out.println();
		
	}
	
	public void removeJet () {
		System.out.println("Removing jet");
		System.out.println();
		
	}

}
