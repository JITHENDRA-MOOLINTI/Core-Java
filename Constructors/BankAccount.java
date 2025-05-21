package com.constructors;

public class BankAccount {
     double balance;
     String customerName;
     String address;
     
     public BankAccount(double balance,String customerName,String address){
    	 this.balance=balance;
    	 this.customerName=customerName;
    	 this.address=address;
     }
     
     public BankAccount() {
    	 this.balance=0;
    	 this.customerName="NA";
    	 this.address="NA";
     }
     
     public void deposit(double amount) {
    	 if(amount>0) {
    		 this.balance+=amount;
    	 }else {
    		 System.out.println("Inavlid Amount.Deposit Failed");
    	 }
     }
     
     public void withdraw(double amount) {
    	 if(amount<0) {
    		 System.out.println("Invalid Amount.Withdraw Failed");
    	 }
    	 else if(amount>this.balance) {
    		 System.out.println("Insufficient funds.Withdrawl Failed");
    	 }else {
    		 this.balance-=amount;
    	 }
     }
     
     public void updateAddress(String newAddress) {
    	 this.address=newAddress;
    	 System.out.println("Address Updated Successfully to:"+newAddress);
     }
     
     public void updateCustomerName(String newCustomerName) {
    	 this.customerName=newCustomerName;
    	 System.out.println("Customer Name updated successfully to:"+newCustomerName);
     }
     
     public void displayBankAccountDetails() {
    	 System.out.println("Customer Name:"+customerName+"\nAddress"+address+"\nBalance:"+balance);
     }
     
}
