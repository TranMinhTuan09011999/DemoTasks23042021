package com.itsj.polymorphism;

public class DemoPolymorphism {
	public static void main(String[] args) {
		Ford ford = new Ford("Forf Everest",9500,2500);
		int speedLimit = ford.speedLimit(); 
		System.out.println("Speed Limit: " + speedLimit);
		double price = ford.getPrice();
		System.out.println("Price of Ford: " + price);
		double priceAndTax = ford.getPrice(ford.getTax());
		System.out.println("Price of Ford after tax: " + priceAndTax);
	}
}
