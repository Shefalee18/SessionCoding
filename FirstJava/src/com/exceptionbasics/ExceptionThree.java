package com.exceptionbasics;

public class ExceptionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		try{
			int i = 20/0;
			System.out.println(i);
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
		}
		finally{
			System.out.println("Finally always get executed");
		}
			
		System.out.println("Maintaining the flow of application");
	}

}
