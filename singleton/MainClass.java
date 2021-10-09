package com.prvt.singleton;

public class MainClass {

	public static void main(String[] args) {

		// no object can created because we change the constructor to private
//		AppConfig obj = new AppConfig();
		
		AppConfig obj = AppConfig.getInstance();
		//now every obj created will be static so only one object will create
		
	}

}
