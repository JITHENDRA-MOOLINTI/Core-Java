package com.school.managemet;

public class School {
     private String name;
     private String location;
     
    public void setName(String name) {
    	this.name=name;
    }
    public void setLocation(String location) {
    	this.location=location;
    }
    
    public String getName() {
    	return this.name;
    }
     
    public String getLocation() {
    	return this.location;
    }
    
    public String showSchoolInfo() {
    	return "School Name: "+this.name+"\nSchool Location: "+this.location;
    }
}
