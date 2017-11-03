package com.apress.tightcoupling;

public class Customer {

	private CurrentAccount currentAccount;
	private DepositAccount depositAccount;
	private SavingsAccount savingsAccount;

	public Customer() {
		currentAccount = new CurrentAccount();
		depositAccount = new DepositAccount();
		savingsAccount = new SavingsAccount();
	}

	public void depositMoneyIntoCurrentAccount(long amount) {

		currentAccount.depositMoney(amount);
	}

	public void depositMoneyIntoDepositAccount(long amount) {

		depositAccount.depositMoney(amount);
	}

	public void depositMoneyIntoSavingsAccount(long amount) {

		savingsAccount.depositMoney(amount);
	}

	public CurrentAccount getCurrentAccount() {
		return currentAccount;
	}

	public DepositAccount getDepositAccount() {
		return depositAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

}
