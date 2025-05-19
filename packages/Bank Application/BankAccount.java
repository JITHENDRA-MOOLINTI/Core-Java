package com.bank.accounts;

public class BankAccount {
    private String accountNumber;
    private double balance;
    
    public void setAccountNumber(String accountNumber) {
    	this.accountNumber=accountNumber;
    }
    public void setBalance(double balance) {
    	this.balance=balance;
    }
    
    public String getaccountNumber() {
    	return accountNumber;
    }
     
    public double getBalance() {
    	return balance;
    }
    
    public void showAccountInfo() {
    	System.out.println("Account Number: "+accountNumber+"\nBalance: "+ balance);
    }
}
