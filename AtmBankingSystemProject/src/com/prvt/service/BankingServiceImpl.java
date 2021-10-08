package com.prvt.service;

import com.prvt.Exception.BankingException;
import com.prvt.dao.BankingDao;
import com.prvt.dao.BankingDaoImpl;

public class BankingServiceImpl implements BankingService {

	private BankingDao bDao;
	
	public BankingServiceImpl() {
		bDao = new BankingDaoImpl();
	}
	
	
	@Override
	public double deposite(double amount) {
		return bDao.deposite(amount);
	}


	@Override
	public double withdraw(double debit) throws BankingException {
		return bDao.withdraw(debit);
	}


	@Override
	public double getBalance() {
		return bDao.getBalance();
	}

}
