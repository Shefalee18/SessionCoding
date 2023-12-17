package com.first;

public class ExampleOne {
	//Core Java example to show the visibility of class , variables and methods 
	//within the same package
	public int age = 40;
	//private ExampleOne(){} //When constructor is private we can't create object outside of class

	public static void main(String[] args) {
		System.out.println("ExampleOne output");
		System.out.println(args.length);
		
		for(int i=0;i<args.length;i++){
		System.out.println(args[i]);
		ExampleOne e = new ExampleOne();
		System.out.println(e.add(10,20));
		System.out.println(e.sub(20,10));
		
		}
	}
	public int add(int a,int b){
	return (a+b);
	}
	public int sub(int a,int b){
		return (a-b);
	}
}
class ExampleTwo{
	public int mult(int a,int b){
		return (a*b);
		}
	
}