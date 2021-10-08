package com.prvt.oops.inheritanceDemo;

public class MainClass {

	public static void main(String[] args) {
	
		Teacher t = new Teacher();
		t.Name = "Paul";
		t.teach();
		t.eat();
		t.walk();
		
		FootBallPlayer f = new FootBallPlayer();
		f.Name = "Neymar Jr";
		f.play();
		f.eat();
		f.walk();
		
//		//Upcasting
//		Teacher t1 = new Teacher();
//		Person p =t1;
//		
//		//Downcasting
//		Person p2 = new Person();
//		FootBallPlayer f2 = (FootBallPlayer) p; // will cause run time Error
		
//		Person p2 = new Person();
//		FootBallPlayer f2 = (FootBallPlayer) p; // will cause run time Error
	}

}

// Act of Driving new things from existing thing
// by Extend a class
// use a dry methodology
//overridding
