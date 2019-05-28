package com.tom;

public class Horse extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i<=10000 ; i++) {
		System.out.println("Horse 2" + i);
	}
		
	}
	
}

