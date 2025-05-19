package com.bank.customer;

public class Customer {
     
	private int  cId;
	private String cName;
	
	public void setCId(int cId) {
    	this.cId=cId;
    }
    public void setCName(String cName) {
    	this.cName=cName;
    }
    
    public int getCId() {
    	return cId;
    }
     
    public String getCName() {
    	return cName;
    }
    
    public void showCustomerInfo() {
    	System.out.println("Account Number: "+cId+"\nBalance: "+ cName);
    }
}
