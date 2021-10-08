package com.prvt.keyword;

class Employee{
	int id;
	int salary;
	static String ceo;
	static {
		ceo = "larry";
		System.out.println("static run first than def constr");
	}
	
	
	public Employee() {
		System.out.println("default construcoor");
	}


	public void show() {
		System.out.println(id + " | " + salary + " | " + ceo);
	}
}

public class StaticDemo {

	static int i = 0;
	// both employee work in same company
	public static void main(String[] args) {
		Employee utkarsh = new Employee();
		utkarsh.id = 07;
		utkarsh.salary = 25000;
//		utkarsh.ceo = "bob";
		 i= 8;
		
		Employee arsh = new Employee();
		arsh.id = 12;
		arsh.salary = 30000;
//		arsh.ceo = "bob";
//		arsh.ceo = "elon"; 
		     //or
		Employee.ceo = "mat";
		
		utkarsh.show();
		arsh.show();
	}
}
// static variable will be same for all object
// static variable can be access by class
// static method can call static method
// we dont need to create obj to call static method

// class loaded only once and def constr run eevery time for obj creation