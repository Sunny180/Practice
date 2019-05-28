package com.tom;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h = new Horse();
		h.start();
		
		HorseRunnable h1 = new HorseRunnable();
		Thread thread = new Thread(h1);
		thread.start();
		
		/*for(int i = 1; i<=10000: i++) {
			System.out.println("Horse 1" + i);
		}*/
		System.out.println("main end");
	}

}
