package com.prvt;

import java.util.Scanner;

import com.prvt.Exception.BankingException;
import com.prvt.service.BankingService;
import com.prvt.service.BankingServiceImpl;

public class BankingMain {

	private static   BankingService bService;
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		bService = new BankingServiceImpl();
		boolean flag = false;
		int choise = 0;

		while (!flag) {
			choise = getChoise(scan);
			switch (choise) {
			case 1:
				System.out.println("1. DEPOSITE");
				System.out.println("---------------------------");
				double amount = 0;
				System.out.println("Enter Ammount You Want To Deposite in bank");
				amount = scan.nextDouble();
				double balance = bService.deposite(amount);
				System.out.println("------------------------------------------------");
				System.err.println("your Balance is == "+ balance);
				System.out.println("------------------------------------------------");

				break;
			case 2:
				System.out.println("2. WITHDRAW");
				double debit = 0;
				debit = scan.nextDouble();
				try {
					balance = bService.withdraw(debit);
					System.out.println("------------------------------------------------");
					System.out.println("Amount Debited == " + debit);
					System.err.println("your Balance is == "+ balance);
					System.out.println("------------------------------------------------");
				} catch (BankingException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("3. CHECK BALANCE");
				balance = bService.getBalance();
				System.out.println("------------------------------------------------");
				System.err.println("your Balance is == "+ balance);
				System.out.println("------------------------------------------------");
				break;
			case 4:
				System.out.println("4. EXIT");

				System.out.println("Thaank You For Visit");
				flag = true;
				break;

			default:
				System.err.println("Please Enter number from 1 - 4");
				break;
			}
		}
	}

	private static int getChoise(Scanner scan) {
		int choise = 0;
		System.err.println("WELCOME TO BANK  ");
		System.out.println("1. DEPOSITE");
		System.out.println("2. WITHDRAW");
		System.out.println("3. CHECK BALANCE");
		System.out.println("4. EXIT");
		choise = scan.nextInt();
		return choise;
	}

}
