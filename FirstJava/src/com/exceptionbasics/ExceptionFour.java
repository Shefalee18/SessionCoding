package com.exceptionbasics;

public class ExceptionFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		try{
		if(i==5){
			throw new ArithmeticException("Invalid Number");
		}
		else{
			System.out.println("Correct number");
		}
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
		}
		System.out.println("Maintaining the flow of application");
	}

}
