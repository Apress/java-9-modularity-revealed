package com.apress.looseCoupling;

public class CurrentAccount implements AccountInterface {

	long deposit;

	public CurrentAccount() {
	}

	@Override
	public long getDeposit() {
		return deposit;
	}

	@Override
	public void depositMoney(long amount) {
		deposit = amount;
	}
}