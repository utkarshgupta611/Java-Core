package com.prvt.singleton;

public class AppConfig {

	private AppConfig() {
	}
	
//	we can intialize here also but this object will be created if needed or not so better to create when call using conditions
	private static AppConfig obj = null;
	
	public static AppConfig getInstance() {
		if(obj == null) {
			obj =new AppConfig();
		}
		return obj;
	}

	
}
