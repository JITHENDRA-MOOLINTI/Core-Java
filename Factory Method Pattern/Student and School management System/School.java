package com.school;

public class School {
	  
	  private String schoolName;
	  private String schoolAddress;
	  private String schoolMotto;
	  
	  
	  //Private Constructor
	  private School(String schoolName,String schoolAddress,String schoolMotto) {
		  this.schoolName= schoolName;
		  this.schoolAddress=schoolAddress;
		  this.schoolMotto=schoolMotto;
	  }
	  
	  //setters
	  public void setSchoolName(String schoolName) {
		  this.schoolName=schoolName;
	  }
	  public void setSchoolAddress(String schoolAddress) {
		  this.schoolAddress=schoolAddress;
	  }
	  public void setSchoolMotto(String schoolMotto) {
		  this.schoolMotto=schoolMotto;
	  }
	  
	  
	  //getters
	  public String getSchoolName() {
		  return this.schoolName;
	  }
	  public String getSchoolAddress() {
		  return this.schoolAddress;
	  }
	  public String getSchoolMotto() {
		  return this.schoolMotto;
	  }
	  
	  @Override
	  public String toString() {
		  return "School Name:"+this.schoolName+"\nAddress:"+this.schoolAddress+"\nMotto:"+this.schoolMotto;
	  }
	  
	//Indirectly creating object of School
	 public static School getSchoolObject(String schoolName,String schoolAddress,String schoolMotto) {
		 if(schoolName==null||schoolAddress==null||schoolMotto==null||schoolName.isEmpty()||schoolAddress.isEmpty()||schoolMotto.isEmpty())
			 {
				 
				 return null;
			 }
		      return new School(schoolName,schoolAddress,schoolMotto);
		 }

	
}
