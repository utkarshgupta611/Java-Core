package com.prvt.collection.basic;

public class Bike {

	private int id;
	private String model;
	private int price;
	
	
	public Bike(int id, String model, int price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
	}
	public Bike() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", model=" + model + ", price=" + price + "]";
	}
	
	
}
