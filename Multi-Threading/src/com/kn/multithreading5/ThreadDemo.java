package com.kn.multithreading5;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.setName("Numbers");
		thread2.setName("Characters");
		
		thread1.start();
		thread2.start();
	}

}
