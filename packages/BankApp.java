package com.bank.app;

import com.bank.accounts.BankAccount;
import com.bank.customer.Customer;

public class BankApp {

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount();
		Customer c = new Customer();
		b.setAccountNumber("1234");
		b.setBalance(2783474);
		c.setCId(12);
		c.setCName("Venkateswara");
		b.showAccountInfo();
		c.showCustomerInfo();
	}

}
