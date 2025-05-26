package com.manfacturer;


public class Manufacturer {

	//private instance variables
	private String manfacturerName;
	private String manfacturerAddress;
	private String registrationNumber;
	
	//private constructor
	private Manufacturer(String manfacturerName,String manfacturerAddress,String registrationNumber) {
		this.manfacturerName=manfacturerName;
	    this.manfacturerAddress=manfacturerAddress;
	    this.registrationNumber= registrationNumber;
	
	}
	
	//setters
	
	public void setManfacturerName(String manfacturerName) {
		this.manfacturerName=manfacturerName;
	}
	public void setManfacturerAddress(String manfacturerAddress) {
		this.manfacturerAddress=manfacturerAddress;
	}
	public void setSchool(String registrationNumber) {
		this.registrationNumber= registrationNumber;
	}
	
	
	//getters
	public String getManfacturerName() {
		return this.manfacturerName;
	}
	public String setmanfacturerAddress() {
		return this.manfacturerAddress;
	}
	public String setregistrationNumber() {
		return this.registrationNumber;
	}
	
	@Override
	public String toString() {
		return "Manufacturer Name:"+this.manfacturerName+"\nAddress:"+this.manfacturerAddress+"\nRegistration Number:"+this.registrationNumber;
	}
	
	//Indirectly creating object of 
	public static Manufacturer getManufacturerObject(String manfacturerName,String manfacturerAddress,String registrationNumber) {
		if(registrationNumber.length()<10||registrationNumber.length()>10) {
			return null;
		}
		
		return new Manufacturer( manfacturerName, manfacturerAddress,registrationNumber);
	}
}
