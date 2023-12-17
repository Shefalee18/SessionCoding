package com.oops;

//Abstract class needs to be extended by subclass to implement its methods
public class AbstractionEg extends Calc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Need to implement the methods but there is no compulsion to add the logic 
	//for all the methods
	
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
// Abstraction is done by using "abstract" keyword before class name
 abstract class Calc{
	//Abstract class can have both abstract methods and non-abstract methods
	//Abstract method is just a template with no logic written
	public abstract int add(int x, int y);
	public abstract int sub(int x, int y);
	public int mult(int x, int y){
		return x*y;
	}
}
