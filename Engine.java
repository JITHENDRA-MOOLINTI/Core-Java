package com.vehicles.parts;

public class Engine {
	  private String engineType;
	  private int horsePower;
	 
	  
	  public void setEngineType(String engineType) {
		  this.engineType=engineType;
	  }
	  public void setHorsePower(int  horsePower) {
		  this. horsePower= horsePower;
	  }
	  public String getEngineType() {
		  return engineType;
	  }
	  public int getHorsePower() {
		  return horsePower;
	  }

	  public void showEngineInfo() {
		  System.out.println("Engine Type: "+engineType+"\nHorse Power: "+horsePower);
	  }
}
