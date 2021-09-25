package com.practice.nishith;

public class Demo {
	static Thread myThreadOne;
	static Thread myThreadTwo;
	
	public static void main(String[] args) throws InterruptedException {
//		Runner runnerOne = new Runner();
//		runnerOne.start();
//		Runner runnerTwo = new Runner();
//		runnerTwo.start();
//		Runner runnerThree = new Runner();
//		runnerThree.start();
		
		
//		Thread runnerOne = new Thread(new RunnableInterfaceImplementation());
//		runnerOne.start();
//		Thread runnerTwo = new Thread(new RunnableInterfaceImplementation());
//		runnerTwo.start();
//		Thread runnerThree = new Thread(new RunnableInterfaceImplementation());
//		runnerThree.start();
		
		myThreadOne = new Thread(new MyThread());
		System.out.println("State of the thread one after creating the thread : "+myThreadOne.getState());
		myThreadOne.start();
		System.out.println("State of the thread one after calling the start method : "+myThreadOne.getState());
		
		myThreadTwo = new Thread(new MyThread());
		System.out.println("State of the thread two after creating the thread : "+myThreadTwo.getState());
		myThreadTwo.start();
		System.out.println("State of the thread two after calling the start method : "+myThreadTwo.getState());
	
		myThreadOne.sleep(200);
		
		myThreadTwo.join();
		
		
	}

}
