package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
			System.out.println((i+1) + ": " + jets.get(i));
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
	public void iterateJets() {
		ListIterator<Jet> jetsListIterator = jets.listIterator();
		while (jetsListIterator.hasNext()) {
			System.out.println(jetsListIterator.next());
			
				System.out.println(jets.get(2).getSpeed());
			}
			
		}
			
	public void viewFastestJet () {
		
//		for (int i = 0; i < jets.size(); i++) {
//		Collections.sort(jets.get(i).getSpeed());
		
	}
		
	//}
	

	public void viewFastest () {
		System.out.println("Fastest jet: ");
		System.out.println();
		
		double maxSpeed = jets.get(0).getSpeed();
		
		double currentSpeed = 0.0;
		
		
		
		for (int i = 0; i < jets.size(); i++) {
			
			currentSpeed = jets.get(i).getSpeed();
			
			if (currentSpeed > maxSpeed) {
				
				maxSpeed = jets.get(i).getSpeed();
			
				}
			
			
			System.out.println();
			

			 }
		
	
	}
		
	
	
	public void viewLongestRange () {
		System.out.println("Longest range: ");
		System.out.println();
		
		int maxRange = jets.get(0).getRange();
		
		int currentRange = 0;
		
		for (int i = 0; i < jets.size(); i++) {
			
			currentRange = jets.get(i).getRange();
			if (currentRange > maxRange) {
				maxRange = currentRange;
				jets.get(i).getRange();
					System.out.println(jets.get(i));
					System.out.println();
					break;
				}
			}
		}
		

	
	public void loadCargoJets () {
		System.out.println("Loading cargo jets");
		System.out.println();
		
		
//		ListIterator<Jet> jetsListIterator = jets.listIterator();
//		while (jetsListIterator.hasNext()) {
//			System.out.println(jetsListIterator.next());
			for (int i = 0; i < jets.size(); i++)
				if (jets.get(i).getType().equals("Cargo Plane")) {
					
					System.out.println(jets.get(i));
					System.out.println();
				}
		
		}
		
		
		
		

	
	public void dogFight () {
		System.out.println("Dog Fight!");
		System.out.println();
		
		for (int i = 0; i < jets.size(); i++)
			if (jets.get(i).getType().equals("Fighter Jet")) {
				
				System.out.println(jets.get(i));
				System.out.println();
			}
	}
	
	public void addJet () {
			System.out.println("Follow the instructions below to build your jet.");
			System.out.println();
			
		
			System.out.println("Enter jet model.");
			System.out.println();
			
			String model = sc.next();
			sc.nextLine();
			
			System.out.println("Enter a number for jet speed in MPH.");
			System.out.println();
			
			double speed = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Enter an integer number for range in miles.");
			System.out.println();
			
			int range = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter a number for jet price.");
			System.out.println();
			
			long price = sc.nextLong();
			sc.nextLine();
		
			System.out.println("Enter a number from the list below to choose jet type.");
			System.out.println();
			System.out.println("1: Passenger \t 2: Cargo Plane \t 3: Fighter Jet");
			
			int numType = sc.nextInt();
			sc.nextLine();
			
			if (numType == 1) {
				String type = "Passenger";
				PassengerJet custJet = new PassengerJet(type, model, speed, range, price);
				jets.add(custJet);
				
			}
			
			if (numType == 2) {
				String type = "Cargo Plane";
				PassengerJet custJet = new PassengerJet(type, model, speed, range, price);
				jets.add(custJet);
				
			}
			
			if (numType == 3) {
				String type = "Fighter Jet";
				PassengerJet custJet = new PassengerJet(type, model, speed, range, price);
				jets.add(custJet);
			}
			
			
			System.out.println();
			}

		
	
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
		
	
	
	public void removeJet () {
		System.out.println("Please choose the number of the jet you would like to remove.");
		System.out.println();
		
		for (int i = 0; i < jets.size(); i++) {
			System.out.println((i+1) + " " + jets.get(i));
		}
		

		int numToDelete = sc.nextInt();
		
				jets.remove(numToDelete - 1);
		
			
			
		}
		
	}


