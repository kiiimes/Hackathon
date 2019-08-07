package com.ji.ui;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.*;


public class LoginPanel extends JPanel {

   Image img = null;
   private JButton loginBtn;
   private JLabel idLabel;
   private JLabel pwLabel;
   private JTextField idTextField;
   private JPasswordField pwTextField;
   private BtnListener btnL;

   private ManagerPanel managerPanel;
   private StudentPanel studentPanel;

   public LoginPanel() {
      setPreferredSize(new Dimension(1900,950));
      setLayout(null);
      setBounds(0,0,1900,950);
      setBackground(Color.WHITE);

      btnL = new BtnListener();
      
      try {
      File sourceimage = new File("C:\\Users\\은숙\\Desktop\\해오라기\\매\\bin\\KakaoTalk_20180627_054250910.jpg");
      img = ImageIO.read(sourceimage);
      }catch(IOException e){
         System.out.println("이미지 파일이 없습니다");
      }


      idLabel = new JLabel("ID");
      idLabel.setLayout(null);
      idLabel.setBounds(800,400,100,50);
      idLabel.setFont(new Font("",Font.PLAIN,15));
      add(idLabel);

      pwLabel = new JLabel("PW");
      pwLabel.setLayout(null);
      pwLabel.setBounds(800,470,100,50);
      pwLabel.setFont(new Font("",Font.PLAIN,15));
      add(pwLabel);

      idTextField = new JTextField();
      idTextField.setLayout(null);
      idTextField.setBounds(850,400,200,50);
      add(idTextField);

      pwTextField = new JPasswordField();
      pwTextField.setLayout(null);
      pwTextField.setBounds(850,470,200,50);
      add(pwTextField);

      loginBtn = new JButton("LOGIN");
      loginBtn.setLayout(null);
      loginBtn.setBounds(900,600,100,50);
      loginBtn.addActionListener(btnL);
      add(loginBtn);

   }
   protected void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(img, 450, 100, this);
   }

   private class BtnListener implements ActionListener{
      public void actionPerformed(ActionEvent event) {
         Object obj=event.getSource();
         String text_id = idTextField.getText();
         String text_pw = pwTextField.getText();

         if(obj==loginBtn) { 
            
            if(text_id.equals("") || text_pw.equals("")  ) {
               //비밀번호 일치하는지 확인해줘야함
               JOptionPane.showMessageDialog(null, "Enter Id and Pw!", "Fail Login", JOptionPane.ERROR_MESSAGE);
            }//아이디나 비밀번호 미입력시
            
            else{
               if(text_id.equals("root")) {
                  if(false) {
                     //비밀번호 일치하는지 확인해줘야함//비밀번호 틀리면 오류 메세지
                     //JOptionPane.showMessageDialog(null, "Retry!", "Fail Login", JOptionPane.ERROR_MESSAGE);
                  }//비밀번호 틀림
                  else {
                     removeAll();
                     
                     managerPanel = new ManagerPanel(text_id);
                     managerPanel.setLayout(null);
                     managerPanel.setBounds(0,0,1900,950);
                     add(managerPanel);
                     managerPanel.setVisible(true);
                       repaint();
                  }
               }//관리자용
               else {
                  if(false) {
                     //비밀번호 일치하는지 확인해줘야함//비밀번호 틀리면 오류 메세지
                     //JOptionPane.showMessageDialog(null, "Retry!", "Fail Login", JOptionPane.ERROR_MESSAGE);
                  }//비밀번호 틀림
                  else {
                     removeAll();
                     
                     studentPanel = new StudentPanel(text_id);
                     studentPanel.setLayout(null);
                     studentPanel.setBounds(0,0,1900,950);
                     add(studentPanel);
                     studentPanel.setVisible(true);
                     
                       repaint();
                  }
               }//사용자용
            }//아이디나 비밀번호 입력시
         }   
      }//BtnListener

   }

}