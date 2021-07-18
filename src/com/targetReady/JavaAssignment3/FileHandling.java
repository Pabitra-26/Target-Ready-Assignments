/*
 Author: Pabitra Priyadarshini Jena 

 Task: Write program to create a file. 
 Using an input stream, read the contents of input.txt(given in this repository). 
 Count the number of times the word "Target" is repeated in the file and save the output 
 to a new file(out.txt) in the following format:
"The word Target is repeated n times"
 */


package com.targetReady.JavaAssignment3;
import java.io.FileInputStream;
import java.io.FileOutputStream;




public class FileHandling {
	
	public static void main(String[] args) {
	try {
		FileInputStream fin = new FileInputStream("D:\\input.txt");
		int i =0;
		int num = fin.available();
		char arr[] = new char[num];
		int j = 0;
		while((i=fin.read())!=-1) {
			arr[j]=(char)i;
			j++;
		}
//		for(int k =0; k<j;k++) {
//			System.out.println(arr[k]);
//		}
		String string = String.valueOf(arr);
		String[] arr2 = string.split(" ");
		int count = 0;
		for(i =0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
			if(arr2[i].equals("Target") ){
//				System.out.println(arr2[i]);
				count++;
			}
			
		}
		
		FileOutputStream fout = new FileOutputStream("D:\\output.txt");
		String s = "The word Target is repeated "+count+" times";
		byte b[] = s.getBytes();
		fout.write(b);
		fout.close();
		
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	}

}
