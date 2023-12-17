package com.exceptionbasics;

public class ExceptionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		String s= null;
		try{
			System.out.println(s.length());
			i=10/0;
			System.out.println(i);
		}
		catch(NullPointerException np){
			np.printStackTrace();
		}
		catch(ArithmeticException ap){
			ap.printStackTrace();
		}
		//Always Super class should be last one in the hierarchy otherwise it will throw error if you
		//place it on the top saying other exceptions ate unreachable as it is already handled by 
		//super class Exception
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
