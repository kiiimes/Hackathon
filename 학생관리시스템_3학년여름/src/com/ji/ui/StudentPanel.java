package com.ji.ui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class StudentPanel extends JPanel {
   private String text;
   private JLabel name;
   private JPanel uppperPanel;
   private JPanel lowerPanel;
   
   private JButton logOutBtn;
   private BtnListener btnL;
   
   private RecommendTrackPanel recommendTrackPanel;

   
   public StudentPanel(String userName) {
      setPreferredSize(new Dimension(1900,950));
      btnL = new BtnListener();
      
      uppperPanel = new JPanel();
      uppperPanel.setLayout(null);
      uppperPanel.setBounds(0,0,1900,150);
      uppperPanel.setBackground(new Color(171,0,19));
      add(uppperPanel);
      
      text = userName;
      name = new JLabel("æ»≥Á«œººø‰, "+text+" ¥‘!");
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

      lowerPanel = new JPanel();
      lowerPanel.setLayout(null);
      lowerPanel.setBounds(0,150,1900,800);
      add(lowerPanel);
      
      recommendTrackPanel = new RecommendTrackPanel(text);
      recommendTrackPanel.setLayout(null);
      recommendTrackPanel.setBounds(0,0,1900,800);
      lowerPanel.add(recommendTrackPanel);
      
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


      }
      public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}         
     }//BtnMenuListener
   
}