package com.java8.feature.lamda;

public class LamdaCreateThread {

	public static void main(String[] args) {

		// creating thread with Runnable interface
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Thread is running");
			}
		};
		Thread t = new Thread(runnable);
		t.start();
		
		//Creating thread with Lambda expression
		Runnable runnable1 = () -> System.out.println("Thread is running");
		Thread t2 = new Thread(runnable1);
		t2.start();
	}

}
