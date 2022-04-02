package com.skilldistillery.jets.app;


import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {
	

	private AirField af = new AirField();
	private Scanner sc = new Scanner(System.in);
	//private List<Jet> jetFleet = af.getJets();

	public static void main(String[] args) {
		JetsApplication jetsApp = new JetsApplication();
		jetsApp.launch();
		
		

	}
	
	private void launch() {
	//	af.readFromFile("jets.txt");
	//	System.out.println(af.getJets());
		displayUserMenu();
		
	}
	
	
	
	private void displayUserMenu() {
		
		System.out.println("Please enter a number from the list below.");
		System.out.println();
			System.out.println("1: List fleet");
			System.out.println("2: Fly all jets");
			System.out.println("3: View fastest jet");
			System.out.println("4: View jet with longest range");
			System.out.println("5: Load all cargo jets");
			System.out.println("6: Dogfight!");
			System.out.println("7: Add a jet to the fleet");
			System.out.println("8: Remove a jet from the fleet");
			System.out.println("9: Quit");
			System.out.println();

			String menuSelection = sc.next();
			//sc.nextLine();
			
			if (menuSelection.equals("1")) {
				
				af.displayJets();

			}
			
			if (menuSelection.equals("2")) {
				
				af.fly();
				
			}
			
		
	}
	

	
	

}
