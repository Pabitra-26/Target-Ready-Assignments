/*
 Author: Pabitra Priyadarshini Jena
 
 Task: Create a class Shape with attributes length and width.
 Write a method boolean isSquare() if both sides are equal.
 If not, throw a custom RuntimeException (say NotASquareException). 
 The main() method should print out this exception message. 
 */



package com.targetReady.JavaAssignment2;

import java.util.Scanner;

public class Shape {
	float length, width;
	
	Shape(float length, float width){
		this.length = length;
		this.width = width;
	}
	
	public void isSquare() {
		System.out.println("This is a square.");
	}
	
	public void shapeDimension() {
		if(this.length!= this.width) {
			throw new NotASquareException();
		}
		else {
			isSquare();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.print("Enter length: ");
		Scanner sc = new Scanner(System.in);
		float length = sc.nextFloat();
		System.out.print("Enter width: ");
		float width = sc.nextFloat();
		Shape shapeObject = new Shape(length, width);
		try {
			shapeObject.shapeDimension();
		}
		catch(RuntimeException e){
			System.out.println(e.getMessage());			
		}
		
		
	}

}
