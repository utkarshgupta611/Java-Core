package com.prvt.collection.stringloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopingList2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		List<String> list = new ArrayList<>();
		System.out.println("Enter item to add in shoping List");
		try {
			while (!flag) {
				String item = scan.next();
				if (item.contains("end")) {
					flag = true;
				}
				list.add(item);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scan.close();
		}
		int lastIndex = list.size() - 1;
		list.remove(lastIndex);
		System.out.println(list);

	}
}
