package collectionListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
	List<String> colorList = new ArrayList<>();
	String[] colorArray = { "red", "blue", "green", "orange", "gray", "red"};
	for (String color : colorArray) {
		colorList.add(color);
	}
	System.out.println(colorList);
	System.out.println(colorList.get(3));
	//Replace
	colorList.set(3, "Yellow");
	
	//insert
	colorList.add(1, "black");
	
	//Remove by index
	colorList.remove(1);
	System.out.println(colorList);
	
	//Remove by name
	colorList.remove("Yellow");
	System.out.println(colorList);
	
	//Sort
	Collections.sort(colorList);
	String [] removeArray = {"green", "red"};
	List<String> removeList = Arrays.asList(removeArray);
	
	// from colorList remove elements present in removeList
	System.out.println(colorList);
	System.out.println("removed");
	colorList.remove(removeArray);
	System.out.println(colorList);
}}
