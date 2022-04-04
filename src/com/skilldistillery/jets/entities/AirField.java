package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class AirField {
	private Scanner sc = new Scanner(System.in);
	private List<Jet> jets;// fleet

	public AirField() {
		jets = new ArrayList<>();

		readFromFile("jets.txt");

	}

	public void readFromFile(String fn) {



		try (BufferedReader bufIn = new BufferedReader(new FileReader(fn))) {
			String line;

			while ((line = bufIn.readLine()) != null) {
				String[] jetInfo = line.split(",");

				String type = jetInfo[0];
				String model = jetInfo[1];
				double speed = Double.parseDouble(jetInfo[2]);
				int range = Integer.parseInt(jetInfo[3]);
				long price = Long.parseLong(jetInfo[4]);

				switch (jetInfo[0]) {

				case "Passenger Jet":
					PassengerJet passJet = new PassengerJet(type, model, speed, range, price);
					jets.add(passJet);
					break;
				case "Cargo Plane":
					CargoPlane cargoPl = new CargoPlane(type, model, speed, range, price);
					jets.add(cargoPl);
					break;
				case "Fighter Jet":
					FighterJet fightJet = new FighterJet(type, model, speed, range, price);
					jets.add(fightJet);
					break;

				}

			}
		}
		
		catch (IOException e) {
			System.err.println(e);
		}



	}

	public List<Jet> getJets() {

		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}
	


	public void displayJets() {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(jets.get(i));
			System.out.println();
			
//			System.out.println(jets.get(0).getType());
//			System.out.println(jets.get(0).getModel());
//			System.out.println(jets.get(0).getSpeed());
//			System.out.println(jets.get(0).getRange());
//			System.out.println(jets.get(0).getPrice());
		}
	}
	
	public void flyAllJets() {
		System.out.println("Flying High");
		System.out.println();
		for (int i = 0; i < jets.size(); i++) {
			jets.get(i).fly();
			System.out.println();
		
			}
			
	}

	//Test Code
//	public void iterateJets() {
//	//	ListIterator<Jet> jetsListIterator = jets.listIterator();
//	//	while (jetsListIterator.hasNext()) {
//		//	System.out.println(jetIterator.next());
//			
//				System.out.println(jets.get(2).getSpeed());
//			}
//			
//		}
			
		
	
	

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
		System.out.println(jets.get(0).getType());
		

		
		}
		
		

	
	public void dogFight () {
		System.out.println("Dog Fight!");
		System.out.println();
	}
	
	public void addJet () {
		System.out.println("Adding jet");
		System.out.println();


			String type = null;
			String model = null;
			double speed = 0.0;
			int range = 0;
			long price = 0;
			

			
			PassengerJet passJet = new PassengerJet(type, model, speed, range, price);
			jets.add(passJet);
//			switch (jetInfo[0]) {
//
//			case "Passenger Jet":
//				PassengerJet passJet = new PassengerJet(model, speed, range, price);
//				jets.add(passJet);
//				break;
//			case "Cargo Plane":
//				CargoPlane cargoPl = new CargoPlane(model, speed, range, price);
//				jets.add(cargoPl);
//				break;
//			case "Fighter Jet":
//				FighterJet fightJet = new FighterJet(model, speed, range, price);
//				jets.add(fightJet);
//				break;
//		
		
	}
	
	public void removeJet () {
		System.out.println("Removing jet");
		System.out.println();
		
	}

}
