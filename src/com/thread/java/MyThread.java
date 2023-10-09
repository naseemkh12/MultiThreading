package com.thread.java;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("value of i "+i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
//				e.printStackTrace();
			}
		}
	}
    public static void main(String[] args) {
		MyThread t = new MyThread();
		
		Thread t1 = new Thread(t);
		MyAnotherThread t2 = new MyAnotherThread();
		MyThirdThread t3 = new MyThirdThread();
		t1.start();
		t2.start();
		t3.start();
		
		}
	}
