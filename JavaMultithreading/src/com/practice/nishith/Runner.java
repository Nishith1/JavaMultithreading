package com.practice.nishith;

public class Runner extends Thread {

	@Override
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("Hello Using Thread Extension:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
