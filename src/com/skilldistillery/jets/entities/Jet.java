package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jet {
	private String type;
	private String model;
	private double speed;
	private int range;
	private long price;


	public Jet() {

	}

	public Jet(String type, String model, double speed, int range, long price) {
		this.type = type;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}


	public abstract void fly();
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}
	
	public double getSpeedinMach() {		
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, model, speed, range, price);
	}

	@Override
	public String toString() {
		return "Type = " + type + "\t Model = " + model + "\t Speed (MPH) = " + speed + "\t Range (Miles) = " + range + "\t Price (USD) = "  + price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(type, other.type) && Objects.equals(model, other.model) && Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed) && price == other.price && range == other.range
				&& price == other.price;
	}	
	
}
