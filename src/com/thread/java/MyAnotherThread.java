package com.thread.java;

public class MyAnotherThread extends Thread {
     public void run() {
    	 for(int i=10;i>=1;i--) {
    		 System.out.println("another thread " +i);
    	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	 }
    	 
     }
    
}
