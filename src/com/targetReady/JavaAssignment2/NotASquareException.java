/*
 Author: Pabitra Priyadarshini Jena 

 Task: Create a class Shape with attributes length and width.
 Write a method boolean isSquare() if both sides are equal.
 If not, throw a custom RuntimeException (say NotASquareException). 
 The main() method should print out this exception message.
 
  This is the custom exception class for the given task.
 */


package com.targetReady.JavaAssignment2;

public class NotASquareException extends RuntimeException {
	NotASquareException(){
		super("This is not a square.");
	}
	
}
