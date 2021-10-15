package collectionMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("mobile", "Samsung");
		map.put("bike", "suzuki");
		map.put("car", "Honda");
		map.put("deo", "Axe");
		map.put("perfume", "d&g");
		
		System.out.println(map);
		
		System.out.println(map.get("deo"));
		
		map.put("bike", "Kawasaki"); 
		System.out.println(map);
		
		System.out.println("Loop");
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		for (String key : keySet) {
			System.out.println(key +" : " + map.get(key));
		
		}
	}

}


