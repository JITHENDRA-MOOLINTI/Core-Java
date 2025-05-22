package com.constructor.thiskeyword;

public class Box {
	int length;
	
	public Box(int length) {
		this.length=length;
	}
     public Box() {
    	 
     }
	public Box setLength(int length) {
		this.length=length;
		return this;
	}
	public void display() {
		System.out.println(length);
	}
	public static void main(String[] args) {
		
       Box box = new Box();
       box.setLength(10).display();
       Box b= new Box(12);
       b.setLength(10).display();
       
	}

}
