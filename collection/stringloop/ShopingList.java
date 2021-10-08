package com.prvt.collection.stringloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopingList {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		List<String> list = new ArrayList<>();
 		System.out.println("Enter item to add in shoping List");
		while(!flag)
		{
			String item = scan.next();
			if(item.contains("end"))
			{
				flag = true;
			}
			list.add(item);
		}
		int lastIndex = list.size() -1 ;
		list.remove(lastIndex);
		System.out.println(list);
		scan.close();
	}
}
