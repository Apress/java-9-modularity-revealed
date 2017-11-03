package com.apress.tightcoupling;

public class CurrentAccount {

	long deposit;

	public void depositMoney(long amount) {
		deposit = amount;
	}

	public long getDeposit() {
		return deposit;
	}

}
