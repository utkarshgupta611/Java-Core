package com.prvt.dao;

import com.prvt.Exception.BankingException;

public interface BankingDao {

	double deposite(double amount);

	double withdraw(double debit) throws BankingException;

	double getBalance();

}
