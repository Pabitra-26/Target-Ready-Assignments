/*
 Author: Pabitra Priyadarshini Jena
 
 Task: Create a class with two methods method1() and method2(). 
 Method2() should throw a NullPointerException. 
 Call method2() from method1(). 
 method1() should catch the specific exception and transform this into a Custom Exception and 
 throw the custom exception created back to main() method. 
 Main method should print out the message of the caught exception.
 
 This is the custom exception class for the given task.
 */



package com.targetReady.JavaAssignment2;

public class CustomException extends Exception{
	CustomException(){
		super("This is a custom exception");
	}

}
