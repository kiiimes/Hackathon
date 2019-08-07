package com.ji.ui;

import javax.swing.JFrame;

public class App extends JFrame{
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Track");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setResizable(false);//frame 기본 설정
	    
	    LoginPanel primary =new LoginPanel();
	    frame.getContentPane().add(primary);
	    frame.pack();
	    frame.setVisible(true);//frame 기본 설정
	   }
}
