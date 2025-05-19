package com.library.staff;

public class Librariyan {
       private String librariyanName;
       private int yearsOfExp;
       

       public void setLibrariyanName(String librariyanName) {
       	this.librariyanName=librariyanName;
       }
       public void setYearsOfExp(int yearsOfExp) {
       	this.yearsOfExp=yearsOfExp;
       }
       
       public String getLibrariyanName() {
       	return librariyanName;
       }
        
       public int getyearsOfExp() {
       	return yearsOfExp;
       }
       
       public void showLibrarynInfo() {
       	System.out.println("Librariyan Name: "+librariyanName+"\nYears Of Experience: "+ yearsOfExp);
       }
       
}
