package com.apress.looseCoupling;

public class Main {

    public static void main(String[] args) {

		CurrentAccount currentAccount = new CurrentAccount();
		Customer firstCustomer = new Customer(currentAccount);
		firstCustomer.deposit(10);

		DepositAccount depositAccount = new DepositAccount();
		Customer secondCustomer = new Customer(depositAccount);
		secondCustomer.deposit(100);

		SavingsAccount savingsAccount = new SavingsAccount();
		Customer thirdCustomer = new Customer(savingsAccount);
		thirdCustomer.deposit(200);

		System.out.println("First Customer current account amount: " + firstCustomer.getAccount().getDeposit());
		System.out.println("Second Customer deposit account amount: " + secondCustomer.getAccount().getDeposit());
		System.out.println("Third Customer savings account amount: " + thirdCustomer.getAccount().getDeposit());
    }
}
