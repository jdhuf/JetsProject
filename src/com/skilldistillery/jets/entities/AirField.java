package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	
	private List<Jet> jets;//fleet
	
	
	
	public AirField() {
		jets = new ArrayList<>();
		
		readFromFile("jets.txt");
		
	}
	
	public void readFromFile(String fn) {
		
		try ( BufferedReader bufIn = new BufferedReader(new FileReader(fn)) ) {
			  String line;
			  while ((line = bufIn.readLine()) != null) {
			    System.out.println(line);
			  String [] splitLine = line.split(", ");
			  System.out.println(splitLine.length);
			  String planetName = splitLine[0];
			  System.out.println(planetName);
			  
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
		
		
		
	}
	
	
	
}
