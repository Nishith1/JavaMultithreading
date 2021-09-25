package com.practice.nishith;

public class MyThread implements Runnable{

	@Override
	public void run() {
			//System.out.println("MyThread Using Runnable Interface:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("State of the threadOne while it called join method on threadTwo "+Demo.myThreadOne.getState());
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
