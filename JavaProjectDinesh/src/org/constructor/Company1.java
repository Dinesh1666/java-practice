package org.constructor;

public class Company1 extends Employee1 {
	
	public Company1() {
		super();
		System.out.println("child default constructor");
	}
	
	public Company1(int a) {
		super(14);
		System.out.println("child int paramete constructor"+a);
	}
	
	public Company1(float b) {
		super(1.7895f);
		System.out.println("child float parameterized constructor"+b);
	}
	
	public static void main(String[] args) {
		new Company1();
		new Company1(1452);
		new Company1(1.045f);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
