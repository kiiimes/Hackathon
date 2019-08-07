package com.ji.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ManagerPanel extends JPanel {
	
	private JLabel name;
	private JPanel uppperPanel;
	private JPanel lowerPanel;
	
	private JButton logOutBtn;
	private JButton showAllBtn;
	private JButton updateSubjectBtn;
	private JButton serchStudentBtn;
	private BtnListener btnL;
	
	private ShowAllPanel showAllPanel;
	private SearchStud searchStudPanel;
	private UpdateSubjectPanel updateSubjectPanel;
	
	public ManagerPanel(String userName) {
		setPreferredSize(new Dimension(1900,950));
		btnL = new BtnListener();
		
		uppperPanel = new JPanel();
		uppperPanel.setLayout(null);
		uppperPanel.setBounds(0,0,1900,150);
		uppperPanel.setBackground(new Color(171,0,19));
		add(uppperPanel);
		
		String text = userName;
		name = new JLabel("안녕하세요, "+text+" 님!");
		name.setFont(new Font("",Font.BOLD, 15));
		name.setForeground(Color.white);
		name.setBounds(1650,50,200,20);
		uppperPanel.add(name);
	
		logOutBtn = new JButton("LOGOUT");
		logOutBtn.setFont(new Font("",Font.BOLD, 10));
		logOutBtn.setBounds(1700,80,100,30);
		logOutBtn.addMouseListener(btnL);
		logOutBtn.setBackground(Color.WHITE);
		uppperPanel.add(logOutBtn);	

		showAllBtn = new JButton("Show All Track");
		showAllBtn.setFont(new Font("",Font.BOLD, 15));
		showAllBtn.setBounds(150,70,200,30);
		showAllBtn.setBackground(Color.WHITE);
		showAllBtn.addMouseListener(btnL);
		uppperPanel.add(showAllBtn);	

		updateSubjectBtn = new JButton("Update Infomation");
		updateSubjectBtn.setFont(new Font("",Font.BOLD, 15));
		updateSubjectBtn.setBounds(450,70,200,30);
		updateSubjectBtn.setBackground(Color.WHITE);
		updateSubjectBtn.addMouseListener(btnL);
		uppperPanel.add(updateSubjectBtn);	

		serchStudentBtn = new JButton("Search Student");
		serchStudentBtn.setFont(new Font("",Font.BOLD, 15));
		serchStudentBtn.setBounds(750,70,200,30);
		serchStudentBtn.setBackground(Color.WHITE);
		serchStudentBtn.addMouseListener(btnL);
		uppperPanel.add(serchStudentBtn);	


		lowerPanel = new JPanel();
		lowerPanel.setLayout(null);
		lowerPanel.setBounds(0,150,1900,800);
		add(lowerPanel);
		
		showAllPanel = new ShowAllPanel();
		showAllPanel.setLayout(null);
		showAllPanel.setBounds(0,0,1900,800);
		
		lowerPanel.add(showAllPanel);
		
	}

	private class BtnListener implements MouseListener{
        public void mouseClicked(MouseEvent event) {}
        public void mousePressed(MouseEvent event) {}
        public void mouseReleased(MouseEvent event) {
        	JButton btn = (JButton)event.getSource();
        	
        	if(btn == logOutBtn) {
        		removeAll();
        		
        		LoginPanel loginPanel = new LoginPanel();
        		loginPanel.setLayout(null);
        		loginPanel.setBounds(0,0,1900,950);
				add(loginPanel);
				loginPanel.setVisible(true);
        		repaint();
        	}
        	if(btn == showAllBtn) {
        		lowerPanel.removeAll();
        		
        		showAllPanel = new ShowAllPanel();
        		showAllPanel.setLayout(null);
        		showAllPanel.setBounds(0,0,1900,800);
        		
        		lowerPanel.add(showAllPanel);
        		repaint();
        	}//전체보기
        	
        	if(btn == serchStudentBtn) {
        		lowerPanel.removeAll();
        		
        		searchStudPanel = new SearchStud();
        		searchStudPanel.setLayout(null);
        		searchStudPanel.setBounds(0,0,1900,800);
        		
        		lowerPanel.add(searchStudPanel);
        		repaint();
        	}//학생 검색
        	
        	if(btn == updateSubjectBtn) {
        		lowerPanel.removeAll();
        		
        		updateSubjectPanel = new UpdateSubjectPanel();
        		updateSubjectPanel.setLayout(null);
        		updateSubjectPanel.setBounds(0,0,1900,800);
        		
        		lowerPanel.add(updateSubjectPanel);
        		repaint();
        	}//트랙별 과목 정보 수정
        }
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}         
     }//BtnMenuListener
}
