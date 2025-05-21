package com.constructors.bankapp;
import com.constructors.BankAccount;
public class BankApp {

	public static void main(String[] args) {
		
	  BankAccount b = new BankAccount();
	  b.displayBankAccountDetails();
	  System.out.println("----------------------------------");
	   BankAccount b1 = new BankAccount(1000,"Alice","123 Street");
	   b1.displayBankAccountDetails();
	}
}
