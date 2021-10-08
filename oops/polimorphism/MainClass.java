package com.prvt.oops.polimorphism;

public class MainClass {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		Pet p = d;
		Animal a = d;
		Pet pet = new Pet();
		
		// polimorphism dog play role of dog d, pet p
		d.walk();
		p.walk();
		
		
		pet.walk();
	}
}

// one entity many form
// thier are two type of polimorphism -- 1)Runtime polimorphism 2) Compiletime polimorphism
//1)Runtime polimorphism =>know as dynamic binding /late binding, slower Excecution
//2) Compiletime polimorphism =>know as static binding /early binding, fast Excecution