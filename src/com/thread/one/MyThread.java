package com.thread.one;

public class MyThread extends Thread {
 
	@Override
	public void run(){
		super.run();
		System.out.println("MyThread");
	}
	
}
