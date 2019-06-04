package com.tom;

public class BrushTeeth implements Runnable{
	public void run(){
		try {
			System.out.println("Brushing teeth");
			Thread.sleep(3000);
			System.out.println("finish");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
