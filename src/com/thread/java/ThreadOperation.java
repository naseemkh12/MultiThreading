package com.thread.java;

class UserThread extends Thread{
	public void run() {
		System.out.println("this is userdefined thread");
	}
}

public class ThreadOperation {
	public static void main(String[] args) {
		System.out.println("program started ");
		int a = 10 + 20;
		
		System.out.println("sum is " + a);
        
		Thread t=Thread.currentThread();
		String name = t.getName();
		System.out.println("current running thrad "+name);
		
		t.setName("Naseem");
		System.out.println(t.getName());
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println(t.getId());
		System.out.println("program ended ");
		
		UserThread u = new UserThread();
		u.start();
	}
}
