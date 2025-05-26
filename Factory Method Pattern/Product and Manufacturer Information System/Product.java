package com.product;

import com.manfacturer.Manufacturer;


public class Product {
      

	//private instance variables
	private String productName;
	private String category;
	private Manufacturer manufacturer;
	private double price;
	
	
	static {
		
	}
	
	//private constructor
	private Product(String  productName,String category, Manufacturer manufacturer,double price) {
		this. productName= productName;
	    this.category=category;
	    this.manufacturer= manufacturer;
		this.price=price;	
	}
	
	//setters
	
	public void setProductName(String productName) {
		this.productName=productName;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this. manufacturer=  manufacturer;;
	}
	public void setPrice(double price) {
		
			
		    this.price=price;	
		
	}
	
	
	//getters
	public String getProductName() {
		return this.productName;
	}
	public String getCategory() {
		return this.category;
	}
	public  Manufacturer getManufacturer() {
		return this.manufacturer;
	}
	public double getPrice() {
		return this.price;	
	}
	
	@Override
	public String toString() {
		return "Prodcut Name:"+this.productName+"\nCategory:"+this.category+"\nPrice:"+this.price;
	}
	
	//Indirectly creating object of Product
	public  static Product getProducttObject(String  productName,String category, Manufacturer manufacturer,double price) {
		if(price<0||manufacturer==null) {
			return null;
		}
		
		return new Product(productName,category,manufacturer,price);
	}
	
}
