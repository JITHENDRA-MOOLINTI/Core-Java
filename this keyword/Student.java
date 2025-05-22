package com.constructor.thiskeyword;

public class Student {
	
	 int rollNo;
	 String name;
	 
	public Student(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public void updateDetails(String name) 
	{
		
		System.out.println("Old name: "+this.name+"\nnew Name: "+name);
		this.name=name;
		
	}
	
	public void displayDetails() 
	{
		
		System.out.println("Name of Student: "+this.name+"\nRoll No: "+this.rollNo);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Student s = new Student(1,"jithu");
		s.displayDetails();
		s.updateDetails("Sivaji");
		s.displayDetails();
		
	}

}
