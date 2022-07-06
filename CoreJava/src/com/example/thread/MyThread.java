package com.example.thread;

public class MyThread extends Thread{
	String threadName;
	
	MyThread(String name){
		this.threadName=name;
	}
	
	@Override
	public void run() {
		try {
		for(int i=0;i<20;i++)
			System.out.println("MyThread - " +i);
		Thread.sleep(2000);
	}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
