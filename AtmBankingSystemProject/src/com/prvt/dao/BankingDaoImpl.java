package com.prvt.dao;

import com.prvt.Exception.BankingException;

public class BankingDaoImpl implements BankingDao{

	private double balance = 1000;
	private static final  double minbalance= 500;
	@Override
	public double deposite(double amount) {
		balance += amount; 
		return balance;
	}

	@Override
	public double withdraw(double debit) throws BankingException {
		balance -= debit; 
		if(balance < minbalance) {
			throw new BankingException("Insufficient fund .Kindly maintaine "
					+ "Min Balance");
		}
		return balance;
	}

	@Override
	public double getBalance() {
		
		return balance;
	}

}
