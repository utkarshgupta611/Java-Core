package com.prvt.oops.EncapsulationDemo;

public class Student {

	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age<20) { 
		 this.age = age;}
		else {
		System.out.println("You are older for admission");}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
