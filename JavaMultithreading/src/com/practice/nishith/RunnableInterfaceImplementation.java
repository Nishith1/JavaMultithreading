package com.practice.nishith;

public class RunnableInterfaceImplementation implements Runnable {

	@Override
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("Hello Using Runnable Interface:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	}

}
