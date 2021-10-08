package com.prvt.oops.abstraction;

public class RepairShop {

	public static void repairCar(Car car) {
		System.out.println(" car is repaired   ");
	}
	public static void main(String[] args) {
		Audi audi = new Audi();
		BMW bmw = new BMW();

		repairCar(audi);
		repairCar(bmw);
	}
 
}
//Abstract = > hiding internal detail or complexity and showing  only essential info to user, as it help us reduce complexity and effort
// Abstraction can be achieve by abstract class or interface
// Abstract class can not create an object
// if their is a abstract method it is imp to to be a class as abstract class
// if Abstract class has non abstract method they are know as concrete method