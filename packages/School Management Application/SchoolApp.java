package com.school.app;
import com.school.managemet.*;
import com.school.staff.*;
public class SchoolApp {
     public static void main(String[] args) {
		
    	 School s = new School();
    	 Principal  p = new Principal();
    	 s.setLocation("Tirupati");
    	 s.setName("Vidyalaya");
    	 p.setPrincipalName("Ramarao");
    	 p.setExpYears(10);
    	 System.out.println(s.showSchoolInfo());
    	 System.out.println(p.showPrincipalInfo());
	}
}
