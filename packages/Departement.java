package com.comapny.admin;



public class Departement {
   private int deptId;
   private String deptName;
   
   public void setDeptId(int deptId) {
	   this.deptId=deptId;   
   }
   public void setDeptName(String deptName) {
	  this.deptName=deptName;   
   }
   public int getDeptId() {
	   return deptId;
   }
   public String getDeptName() {
	   return deptName;
   }
   public void showDepartmentDetails() {
	   System.out.println("Departement ID: "+deptId+"\nDepartement Name: "+deptName);
   }
   
}
