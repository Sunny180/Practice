package com.tom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public MyFrame() {
		setSize(500 ,300);
		JButton ok = new JButton("ok");
		add(ok);
		JPanel north = new JPanel();
		north.add(ok);
		add(north.BorderLayout.NORTH);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame();
	}

}
