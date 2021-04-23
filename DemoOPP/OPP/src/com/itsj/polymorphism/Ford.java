package com.itsj.polymorphism;

public class Ford extends Car{
	private double price;
	private double tax;
	
	public Ford(String name, double price, double tax) {
		super(name);
		this.price = price;
		this.tax = tax;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	@Override
	public int speedLimit()
	{
		return 200;
	}

	public double getPrice(double tax)
	{
		return price + tax;
	}
}
