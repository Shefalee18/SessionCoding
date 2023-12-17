package com.exceptionbasics;

public class ExceptionFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionFive ef= new ExceptionFive();
		try {
			ef.ageValidation(10);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Maintaining the flow of application");

	}
	public void ageValidation(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("Not eligible to vote");
		else
			System.out.println("Eligible to vote");
			
	}

}
