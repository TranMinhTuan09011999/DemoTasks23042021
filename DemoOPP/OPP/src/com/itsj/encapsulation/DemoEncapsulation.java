package com.itsj.encapsulation;

public class DemoEncapsulation {
	public static void main(String[] args) {
		Student s = new Student();
        s.setId (27);
        s.setname("Tom Lee");      
        System.out.println("Student ID: " + s.getId()
                            + "\nStudent Name: " + s.getname());
	}
}
