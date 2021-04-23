package com.itsj.abstraction;

public class DemoAbstraction {
	public static void main(String[] args) {
		Shape r = new Rectangle();
		Shape c = new Circle();
		r.draw();
		c.draw();
	}
}
