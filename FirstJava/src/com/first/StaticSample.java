package com.first;

public class StaticSample {
	static int x = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Inside main method");
		InnerStaticSample.display2();
		display1();
		System.out.println("2.Value of x is: " +x);
	}
	public static void display1(){
		System.out.println("3.Inside static display method");
		x=10;
	}
	static class InnerStaticSample{
		public static void display2(){
			System.out.println("4.Inside static class");
			x=8;
		}
	}
	static{
		System.out.println("5.Inside static block");
		x=20;
	}
	
}
