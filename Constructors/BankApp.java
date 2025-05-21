package com.constructors.bankapp;
import com.constructors.BankAccount;
public class BankApp {

	public static void main(String[] args) {
		
	  BankAccount b = new BankAccount();
	  b.displayBankAccountDetails();
	  System.out.println("----------------------------------");
	   BankAccount b1 = new BankAccount(1000,"Alice","123 Street");
	   b1.displayBankAccountDetails();
	   b1.deposit(2000);
	   b1.deposit(-1000);
	   b1.displayBankAccountDetails();
	   b1.withdraw(-9000);
	   b1.withdraw(4000);
	   b1.withdraw(200);
	   b1.updateAddress("123 KPHB");
	   b1.updateCustomerName("Jithendra");
	   b1.displayBankAccountDetails();
	}
}
