package com.exceptionbasics;

public class ExceptionOne {

	public static void main(String[] args) {
		try{
		int i =20;
		i = 20/0;
		System.out.println("i = " + i);
		}
			catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Welcome");
}
}