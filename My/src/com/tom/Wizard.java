package com.tom;

public class Wizard extends Thread{
	
		try {
			System.out.println("THUNDER�@���Ϣ��");
			Thread.sleep(4000);
			System.out.println("��֢�ܢҢӢ�@�Ӣܢ�");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			
	public void run() {		
		������������]�^�F
	�b
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard w1 = new Wizard();
		w1.start();
		Wizard w2 = new Wizard();
		w2.start();
	}

}

