package com.prvt.oops.inheritanceDemo;

public class FootBallPlayer extends Person{

	public void play() {
		System.out.println(Name + " is a Player plays football");
	}

	@Override
	public void walk() {
		System.out.println(Name + " dont walk he run ");
	}
	
	
}
