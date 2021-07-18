/*
 Author: Pabitra Priyadarshini Jena  
 
 Task: Create two threads. One thread should print "ping". 
 Other thread should print "pong". 
 Schedule the threads in such a way that your program prints ping-pong ping-pong alternatively for 
 100 iterations.
NOTE: Do not use Thread.sleep() method for this. 
 */

package com.targetReady.JavaAssignment3;



public class PingPong{
	
	int counter = 1;
	
	public void Ping() {
		synchronized(this) {
			while(counter<=100) {
				while(counter%2==0) {
					try {
						wait();
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}
				}
				System.out.println("Ping");
				counter++;
				notify();
			}
		}
	}
	
	public void Pong() {
		synchronized(this) {
			while(counter<=100) {
				while(counter%2==1) {
					try {
						wait();
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}
				}
				System.out.println("Pong");
				counter++;
				notify();
			}
		}
	}
	
	public static void main(String[] args) {
		PingPong pp = new PingPong();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				pp.Ping();
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				pp.Pong();
			}
		});
		
		t1.start();
		t2.start();
	}
				
}
			
			