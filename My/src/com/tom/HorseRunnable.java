package com.tom;

public class HorseRunnable implements Runnable{

	public void run() {
		for(int i = 1; i<=10000 ; i++) {
		System.out.println("Horse 2" + i);
	}
}
}
