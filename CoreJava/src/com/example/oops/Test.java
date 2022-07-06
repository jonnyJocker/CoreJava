package com.example.oops;

public class Test {
	public static void main(String args[]) {
		Car c=new Car();
		c.carMake="Maruti";
		c.carModel="Swift";
		c.colour="Red";
		c.yearOfManufacture=2023;
		
		c.startCar();
		c.driveCar();
		c.applyBrakes();
		c.stopCar();
		
		System.out.println(c.toString());
		
		AdvancedCar ac=new AdvancedCar();
		ac.carMake="Maruti";
		ac.carModel="Desire";
		ac.colour="Black";
		ac.yearOfManufacture=2022;
		
		ac.startCar();
		ac.driveCar();
		ac.applyBrakes();
		ac.stopCar();
		ac.ac();
		ac.airbags();
		
		System.out.println(ac.toString());
	}
}
