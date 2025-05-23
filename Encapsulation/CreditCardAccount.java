package com.encapsulation;

import java.util.Scanner;

public class CreditCardAccount {
	
	private String customerName;
	private double creditLimit;
	private double currentDebt;
	private double interestRate;
   
	Scanner sc=new Scanner(System.in);
	
	public CreditCardAccount(String customerName,double creditLimit,double currentDebt ,double interestRate){
		
		this.customerName=customerName;
		this.creditLimit=creditLimit;
		this.interestRate=interestRate;
		this.currentDebt=currentDebt;

       System.out.println( "Credit Card Created Successfully" );
	}
   
	public String getCustomerName() {
		return this.customerName;
	}
	public  void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public double getCreditLimit() {
		return this.creditLimit;
	}
	public  void setCreditLimit(double creditLimit) {
		this.creditLimit=creditLimit;
	}
	public double getCurrentDebt() {
		return this.currentDebt;
	}
	public  void setCurrentDebt(double  currentDebt) {
		this. currentDebt= currentDebt;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	public  void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	
	public void swipeCard(double amount) {
		if(amount>this.getCreditLimit()) {
			System.out.println( "Transaction declined:Limit exceeded");
		}
		else {
			this.currentDebt+=amount;
			System.out.println("Credit Card Swipped SuccessFully at Current Credi Card debt is:"+this.currentDebt);
		}
	}
	
	public void makePayement(double amount) {
		
		if(amount>this.getCurrentDebt()) {
			System.out.println("Excess payment not allowed.");
		}
		else {
			this.currentDebt-=amount;
			System.out.println("You are succesfully paying credicard debt and remaning balance:"+this.currentDebt);
		}
	}
	
	public void applyInterest() {
		System.out.println("He is not paying credit card bill in this month.Give (Yes/No)");
		String choice=sc.next();
		if(choice.equalsIgnoreCase("yes")) {
			this.currentDebt+=(currentDebt*(this.interestRate/100.0));
			System.out.println("Current Debt is:"+this.currentDebt);
		}
		
	}
	
	public static void main(String[] args) {
		
		CreditCardAccount c = new CreditCardAccount("jithu",100000,10000,2);
		c.swipeCard(1000);
		c.swipeCard(200000);
		c.makePayement(3000);
		c.makePayement(150000);
		c.applyInterest();
	}

}
