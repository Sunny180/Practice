package com.tom;

public class Tester {

	public static void main(String[] args) {
		Breakfast breakfast = new Breakfast();
		breakfast.start();
		
		BrushTeeth bt = new BrushTeeth();
		Thread thread = new Thread(bt);
		thread.start();
		
		/*try {
			System.out.println("Making breakfast");
			Thread.sleep(4000);
			System.out.println("Breakfast done");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println("Brushing teeth");
			Thread.sleep(3000);
			System.out.println("finish");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}*/
	}

}
