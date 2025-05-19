package com.vehicles.app;

import com.vehicles.Car;
import com.vehicles.parts.Engine;

public class CarApp {

	public static void main(String[] args) {
		Car c = new Car();
		Engine e = new Engine();
		c.setBrand("Benz");
		c.setModel("S class");
		c.setPrice(100000);
		e.setEngineType("Turbo");
		e.setHorsePower(200);
		c.showCarInfo();
		e.showEngineInfo();
	}

}
