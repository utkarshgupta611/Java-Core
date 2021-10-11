package com.prvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.prvt.model.Employee;

public class Mainclass{

	public static void main(String[] args) {
		System.out.println("Welcome to employee Managmet system");

		Scanner scan = new Scanner(System.in);
		
		System.err.println("how many employee detail u want to add");
		int index = scan.nextInt();
		List<Employee> empList = new ArrayList<Employee>();
		try 
		{
			for (int i = 0; i < index; i++) {
				System.out.println("Enter --> id, name, email, phone number");
				empList.add(new Employee(scan.nextInt(), scan.next(), scan.next(), scan.nextDouble()));
				System.err.println("********************************************************************");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}finally {
			scan.close();
		}
		System.out.println("/n");
		System.out.println("=========================================");
		System.out.println(empList);
		System.out.println("=========================================");
	}

}
