package com.encapsulation;

public class LoanApplication {
	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outstandingBalance;
	
	public LoanApplication(String customerName,double loanAmount,double interestRate,int loanTerm,double outstandingBalance){
		
		this.customerName=customerName;
		this.loanAmount=loanAmount;
		this.interestRate=interestRate;
		this.loanTerm=loanTerm;
		this.outstandingBalance=outstandingBalance;
       System.out.println("Loan Application Submitted");
	}
   
	public String getCustomerName() {
		return this.customerName;
	}
	public  void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public double getLoanAmount() {
		return this.loanAmount;
	}
	public  void setLoanAmount(double loanAmount) {
		this.loanAmount=loanAmount;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	public  void setinterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	public int getloanTerm() {
		return this.loanTerm;
	}
	public  void setloanTerm(int loanTerm) {
		this.loanTerm=loanTerm;
	}
	public double getOutstandingBalance() {
		return this.outstandingBalance;
	}
	public  void seOutstandingBalance(double outstandingBalance) {
		this.outstandingBalance=outstandingBalance;
	}
	
	
	public void makePayement(double amount) {
		if(amount<=0) {
			System.out.println("invalid amount");
		}
		else if(this.outstandingBalance<amount) {
			System.out.println("Payment exceeds loan balance");
		}
		else {
			this.outstandingBalance-=amount;
			System.out.println("Successfully deducted:"+this.outstandingBalance);
		}
	}
	
	public double calculateEMI() {
		double monrate = this.interestRate / (12 * 100);
	    int months = this.loanTerm * 12;

	    if (monrate == 0) {
	        
	        return this.loanAmount / months;
	    }

	    double emi = (this.loanAmount * monrate * Math.pow(1 + monrate, months)) /
	                 (Math.pow(1 + monrate, months) - 1);
	    
	    return Math.round(emi*100.0)/100.0;
		
	}
	
	public void displayLoanDetails() {
		System.out.println("Customer Name:"+this.customerName+"\nInterest Rate:"+this.interestRate+"\nEMI:"+this.calculateEMI()+"\nBalance: "+this.outstandingBalance);
		System.out.println("-------------------------------------------------------------------------------");
	}
	
	
	public static void main(String[] args) {
		
		LoanApplication l = new LoanApplication("jithu",500000,10,5,1000);
		l.displayLoanDetails();
		l.makePayement(7000);
		l.setCustomerName("Nandha");
		l.seOutstandingBalance(23000);
		l.setinterestRate(8.6);
		l.setLoanAmount(700000);
		l.setloanTerm(8);
		l.displayLoanDetails();
		
	LoanApplication l1 = new LoanApplication("Sivaji",100000,7.6,4,6000);
		l1.displayLoanDetails();
		l1.makePayement(7000);
		l1.setCustomerName("Harha Vardhan");
		l1.seOutstandingBalance(23000);
		l1.setinterestRate(8.6);
		l1.setLoanAmount(700000);
		l1.setloanTerm(8);
		l1.displayLoanDetails();
		
	}

}
