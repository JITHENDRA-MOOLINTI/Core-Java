package com.inheritance;


/*Inheritance Types:
 *    1.Single Level Inheritance
 *    2.MultiLevel Inheritance
 *    3.Multiple Inheritance(not supported)
 *    4.Hierarchy Inheritance
 *    5.Hybrid Inheritance*/

class Parent{
	int a=10;
	
	public void m1() {
		System.out.println("method 1");
	}
}
//extends:extends keyword is used to make relation between classes
class Child extends Parent{
	
	int b=3;
	public void m2() {
		System.out.println("method 2");
	}
}

public class P1 {
   
	public static void main(String[] args) {
		//1)ans
		Parent p=new Parent();
		System.out.println(p.a);
		p.m1();
		//Child c2=(Child)p;//Class Cast Exception:it throws class cast exception because it has parent type object and reference
		//and it convert into child class reference but the object parent type that's why it throws class cast exception
		
		//2)Yes we can Access the with the help of child type of reference we can access the parent class variables and methods 
		//and also child we can access the child class variables and methods
		Child c=new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		c.m1();
		c.m2();
		
		//upcasting:We can store child class reference into parent class type is known as upcasting
	   Parent p1=new Child();
	   System.out.println(p1.a);
	   //You Can't Access the Child Class behaviors  and variables with parent type reference because because in compile type it checks
	   //the which type reference it has.the type of variables and methods here print.Here Parent class Variables and behaviors it print
	   //System.out.println(p1.b);
	   p1.m1();
	   //p1.m2();
	   
	   //DownCasting:We can store the parent class reference into child class object by using 
	   //down casting.here it can print all variables and Behaviors of the parent and child class as it in public
	   Child c1=(Child)p1;
	   c1.m1();
	   c1.m2();
	   System.out.println(c1.a);
	   System.out.println(c1.b);
	  
	   
	  Child c3=new Parent();
	   //Compilation Error:A Parent doesn't have the extra features defined in the Child class.
	   

	   
	}

}
