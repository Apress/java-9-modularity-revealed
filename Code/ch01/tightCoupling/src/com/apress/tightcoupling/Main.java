package com.apress.tightcoupling;

public class Main {

    public static void main(String[] args) {

		Customer firstCustomer = new Customer();
		firstCustomer.depositMoneyIntoCurrentAccount(50);

		Customer secondCustomer = new Customer();
		secondCustomer.depositMoneyIntoDepositAccount(100);

		Customer thirdCustomer = new Customer();
		thirdCustomer.depositMoneyIntoSavingsAccount(200);

		System.out.println("First Customer current account amount: " + firstCustomer.getCurrentAccount().getDeposit());
		System.out.println("Second Customer deposit account amount: " + secondCustomer.getDepositAccount().getDeposit());
		System.out.println("Third Customer savings account amount: " + thirdCustomer.getSavingsAccount().getDeposit());
    }
	
}
