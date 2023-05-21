package org.constructor;

public class Employee1 {
	
	public Employee1() {
		System.out.println("default constructor");
	}
	
	public Employee1(int a) {
		this();
		System.out.println("parameterized constructor"+a);
	}
	public Employee1(float b) {
		this();
		System.out.println("parameterized constructor"+b);
	}
	
	public static void main(String[] args) {
		new Employee1();
		new Employee1(141547894);
		new Employee1(0.45f);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
