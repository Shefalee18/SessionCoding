package com.interfacebasics;

public interface Ifc1 {
	public static final int ifc1_x=5;// By default variable is Final only even without "final" keyword
	
	public abstract int add(int x,int y);// By default method is abstract only even without "abstract" keyword

	
	//Non-abstract methods in an interface needs to be declared default or static
	public default void test1(){
	}
	public static void test2(){
	}
	/*private method is allowed from Java 9 version.
	private default void test3(){
		}*/
}
