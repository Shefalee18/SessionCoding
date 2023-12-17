package com.first;

public class NewClass {
	//Core Java example to show the visibility of class , variables and methods 
	//inside another class within the same package

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleOne eo = new ExampleOne();
		eo.age=7;
		System.out.println(eo.age);
		System.out.println(eo.add(30, 20));
		ExampleTwo et = new ExampleTwo();
		System.out.println(et.mult(3, 5));

	}

}
