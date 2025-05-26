package com.main;

import com.book.Book;
import com.publisher.Publisher;

public class BPMain {

	public static void main(String[] args) {
	
		
		System.out.println("-----------Example 2-------------");
		//Example 1:
		Publisher p=Publisher.getManufacturerObject("Forum IAS", "AshokNagar", "PUB12345");
		Book b=Book.getProducttObject("Environmental Studies","Ramesh Rao", p, 890);
		if(p==null||b==null) {
			System.out.println("Book creation failed due to invalid data.");
		}
		else {
			System.out.println(p);
			System.out.println(b);
		}
		
		
		System.out.println("-----------Example 2-------------");
		//Example 2:
		
		Publisher p1=Publisher.getManufacturerObject("Forum IAS", "AshokNagar", "UB12345");
		Book b1=Book.getProducttObject("Environmental Studies","Ramesh Rao", p, 890);
		if(p1==null||b1==null) {
			System.out.println("Book creation failed due to invalid data.");
		}
		else {
			System.out.println(p);
			System.out.println(b);
		}
	}

}
