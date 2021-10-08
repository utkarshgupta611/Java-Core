package com.prvt.collection.basic;

import java.util.ArrayList;
import java.util.List;

public class Factory {
	
	List<Bike> bikeList = new ArrayList<>();

	public List<Bike> order(int noBike) {
		for (int i = 0; i < noBike; i++) {
			Bike b1 = new Bike(i, "Bajaj ", i * 10000);
			bikeList.add(b1);
		}
		return bikeList;
		
	}



}
