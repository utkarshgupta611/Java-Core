package com.prvt.collection.basic;

import java.util.List;

public class Showroom {

	public static void main(String[] args) {
		System.out.println("running");
		Factory bajaj = new Factory();
		int noBike = 0;
		List<Bike> list = bajaj.order(5);
		System.out.println(list);
	}
}
