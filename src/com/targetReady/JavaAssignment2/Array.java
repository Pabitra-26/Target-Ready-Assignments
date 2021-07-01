/*
 Author: Pabitra Priyadarshini Jena
 
 Task: Generate an ArrayIndexOutOfBoundsExceptions and 
 use catch and finally blocks to handle the exception and reset the index value 
 */



package com.targetReady.JavaAssignment2;

public class Array {
	public static void main(String[] args) {
		Array arrayObject = new Array();
		arrayObject.catchException();		
	}

	
	public  void catchException(){
		int arr[] = {1,2,3,4,5};
		int i = 5;
		try {
			int val = arr[i];
			System.out.println("i in try block: "+i);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			i =0;
			System.out.println("Value of i is reset to "+i);
			System.out.println(arr[i]);
		}
	}
}
