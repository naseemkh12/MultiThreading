package com.thread.java;

public class MyThirdThread extends Thread{
      public void run() {
    	  for(int i=1;i<=10;i++) {
    		  System.out.println("my third thread "+i);
    		  try {
    		  Thread.sleep(1000);
    	  }catch(InterruptedException e) {
    		  
    	  }
    	  }
      }
}
