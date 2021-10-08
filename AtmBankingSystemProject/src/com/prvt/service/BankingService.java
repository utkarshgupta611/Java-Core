package com.prvt.service;

import com.prvt.Exception.BankingException;

public interface BankingService {

	double deposite(double amount);

	double withdraw(double debit) throws BankingException;

	double getBalance();

	

}
