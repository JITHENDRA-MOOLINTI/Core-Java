package com.vehicles;

public class Car {
  private String brand;
  private String model;
  private double price;
  
  public void setBrand(String brand) {
	  this.brand=brand;
  }
  public void setModel(String model) {
	  this.model=model;
  }
  public void setPrice(double price) {
	  this.price=price;
  }
  public String getBrand() {
	  return brand;
  }
  public double getPrice() {
	  return price;
  }
  public String getModel() {
	  return model;
  }
  
  public void showCarInfo() {
	  System.out.println("Car Brand: "+brand+"\nCar Model: "+model+"\nCar Price: "+price);
  }
}
