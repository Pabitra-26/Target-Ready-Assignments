/*
 Author: Pabitra Priyadarshini Jena
 
 Task: Create a class with two methods method1() and method2(). 
 Method2() should throw a NullPointerException. 
 Call method2() from method1(). 
 method1() should catch the specific exception and transform this into a Custom Exception and 
 throw the custom exception created back to main() method. 
 Main method should print out the message of the caught exception
 */


package com.targetReady.JavaAssignment2;

public class ExceptionsDemoWithMethods {
	
	public void method1() throws CustomException{
		try {
			method2();			
		}
		catch(NullPointerException e) {
			throw new CustomException();
		}
		
	}
	
	public void method2() {
		Object ref = null;
		ref.toString();
	
	}
	
	public static void main(String[] args) {
		ExceptionsDemoWithMethods demo = new ExceptionsDemoWithMethods();
		try {
			demo.method1();
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}

}
