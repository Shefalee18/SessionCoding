package com.oops;

public class EncapsulationEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.display1();
		s.x=5;
		// Private class cannot be accessed by other class except its mother class
			//	InnerSample is = new InnerSample();
	}

}
// Encapsulating (binding) data and methods using keyword "private" when you don't 
// want to make it visible to other class 
class Sample{
	public int x=10;
	private int y=20;

	InnerSample is = new InnerSample();
	public void display1(){
		System.out.println("display1");
	//	int z=5;
		
		is.display2();
		display3();
	}
	private static void display3(){
		System.out.println("display3");
	}
	private class InnerSample{
		
		public void display2(){
			y=30;
			System.out.println("display2");
		}
	}
	
}