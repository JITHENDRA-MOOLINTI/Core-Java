package com.main;

import com.manfacturer.Manufacturer;
import com.product.Product;

public class PAndMInformationSystem {

	public static void main(String[] args) {
		
		System.out.println("-----------Example 1-------------");
		//Example 1:
		Manufacturer m=Manufacturer.getManufacturerObject("Harshavardhan", "KPHB 123", "1234567890");
		Product p=Product.getProducttObject("AC", "Electronics", m, 25000);
		if(p==null||m==null) {
			System.out.println("Invalid product manufacturer information.");
		}
		else {
			System.out.println(m);
			System.out.println(p);
		}
		
		System.out.println("-----------Example 2-------------");
		//Example 2:
		Manufacturer m1=Manufacturer.getManufacturerObject("Harshavardhan", "KPHB 123", "1234567890");
		Product p1=Product.getProducttObject("AC", "Electronics", m, -25000);
		if(p1==null||m1==null) {
			System.out.println("Invalid product manufacturer information.");
		}
		else {
			System.out.println(m1);
			System.out.println(p1);
		}
		
		

	}

}
