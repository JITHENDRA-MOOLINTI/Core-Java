package com.constructor.thiskeyword;

public class Employee {
     String name;
     double salary;
     public Employee(String name,double salary) {
    	 this.name=name;
    	 this.salary=salary;
     }
     
     public void setSalary(String name,double salary) {
    	 this.name=name;
    	 this.salary=salary;
     }
     
     public void display() {
    	 System.out.println("Name of the Employee: "+name+"\nSalary Of Employee: "+salary);
     }
     
     public static void main(String[] args) {
		
    	 Employee e = new Employee("jithu",10000);
    	 e.display();
    	 e.setSalary("Raja", 20000);
    	 e.display();
	}
}
