package com.example.oops;

public class Car {
	String carMake;
	String carModel;
	String colour;
	int yearOfManufacture;
	
	public void startCar() {
		System.out.println("Car has started");
	}
	
	public void driveCar() {
		System.out.println("Moving forward");
	}
	
	public void applyBrakes() {
		System.out.println("Applying Brakes");
	}
	
	public void stopCar() {
		System.out.println("Car has stopped");
	}

	@Override
	public String toString() {
		return "Car [carMake=" + carMake + ", carModel=" + carModel + ", colour=" + colour + ", yearOfManufacture="
				+ yearOfManufacture + "]";
	}
}
