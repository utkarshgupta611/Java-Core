package com.prvt.oops.inheritanceDemo;

public class Teacher extends Person{

	public void teach() {
		System.out.println( Name + " is Teaching");
	}
	
	@Override
	public void eat() {
		System.out.println(Name + " eat  Panner roll");
	}

}
