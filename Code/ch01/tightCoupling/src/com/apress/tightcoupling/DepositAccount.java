package com.apress.tightcoupling;

public class DepositAccount {

	long deposit;

	public void depositMoney(long amount) {
		deposit = amount;
	}

	public long getDeposit() {
		return deposit;
	}
}

