package com.itsj.polymorphism;

public class Car {
	protected String name;

	public Car(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int speedLimit()
	{
		return 100;
	}
}
