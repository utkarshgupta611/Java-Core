package com.prvt.oops.EncapsulationDemo2;

public class MainClass {

	public static void main(String[] args) {

		ClothingItem cloth = new ClothingItem("Shirt", "M", 1200);
		displayProduct(cloth);

		Shirt shirt = new Shirt("L", 1400);
		displayProduct(shirt);
		shirt.setPattern("strips");
		System.out.println("Pateern of shirt is : " + shirt.getPattern());

		ClothingItem reakShirt = new Shirt("XL", 1500);
		displayProduct(reakShirt);
	}

	private static void displayProduct(Product product) {
		String output = product.getClass().getSimpleName() + "[type=" + product.getType() + ", size="
				+ product.getSize() + ", price=" + product.getPrice() + "]";
		System.out.println(output);
	}
}
