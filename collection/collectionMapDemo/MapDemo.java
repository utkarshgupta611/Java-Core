package collectionMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
public static void main(String[] args) {
	
	Map<String, String> list = new HashMap<>();
	Scanner scan = new Scanner(System.in);
	String category = null;
	String Brand = null ;
	boolean	token = true;
	while(token) {
	System.out.println("Enter a Category ");
	 category = scan.next();
	System.out.println("Enter product");
	Brand = scan.next();


		if (category=="end"){
			token=false;
		}
		list.put(category, Brand);	
	System.out.println(list);
}
	
}
}
