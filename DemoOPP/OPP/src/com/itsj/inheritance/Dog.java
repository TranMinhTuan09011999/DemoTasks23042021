package com.itsj.inheritance;

public class Dog extends Animal{
	private String color;

	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	
	public void display() {
	    System.out.println("My name is " + name);
	  }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
