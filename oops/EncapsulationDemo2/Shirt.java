package com.prvt.oops.EncapsulationDemo2;

public class Shirt extends ClothingItem{

	private String pattern ="Not Set";
	
	public Shirt(String size, double price) {
		super("Shirt", size, price);
	}

	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	
}
