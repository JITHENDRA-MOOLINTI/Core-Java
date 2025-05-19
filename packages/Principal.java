package com.school.staff;

public class Principal {
   private String principalName;
   private int expYears;
   
   public void setPrincipalName(String principalName) {
	   this.principalName=principalName;
   }
   public void setExpYears(int expYears) {
	   this.expYears=expYears;
   }
    public String getPrincipalName() {
    	return principalName;
    }
    public int getExpYears() {
    	return expYears;
    }
    
    public String showPrincipalInfo() {
    	return "Principal Name: "+principalName+"\nExperience Years: "+expYears;
    }
}
