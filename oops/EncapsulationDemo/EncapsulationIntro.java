package com.prvt.oops.EncapsulationDemo;

public class EncapsulationIntro {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.setAge(34);
		obj.setName("Arsh");
		
		System.out.println(obj.getAge());
	}
}
/*
 *  Encapsulation is a process of wrapping field , code, data, method into Single unit
 *  it help us to keep related field and method togethrt
 * it help to controll modification of data field(getter and setter - validation)
 * on updation it do not effect the other part
 * 
 * --- how to achieve Encapsulation
 * 
 * -- private the field and accessing tem using getter and setter , access modifier
  */
