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
      File sourceimage = new File("C:\\Users\\����\\Desktop\\�ؿ����\\��\\bin\\KakaoTalk_20180627_054250910.jpg");
      img = ImageIO.read(sourceimage);
      }catch(IOException e){
         System.out.println("�̹��� ������ �����ϴ�");
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
               //��й�ȣ ��ġ�ϴ��� Ȯ���������
               JOptionPane.showMessageDialog(null, "Enter Id and Pw!", "Fail Login", JOptionPane.ERROR_MESSAGE);
            }//���̵� ��й�ȣ ���Է½�
            
            else{
               if(text_id.equals("root")) {
                  if(false) {
                     //��й�ȣ ��ġ�ϴ��� Ȯ���������//��й�ȣ Ʋ���� ���� �޼���
                     //JOptionPane.showMessageDialog(null, "Retry!", "Fail Login", JOptionPane.ERROR_MESSAGE);
                  }//��й�ȣ Ʋ��
                  else {
                     removeAll();
                     
                     managerPanel = new ManagerPanel(text_id);
                     managerPanel.setLayout(null);
                     managerPanel.setBounds(0,0,1900,950);
                     add(managerPanel);
                     managerPanel.setVisible(true);
                       repaint();
                  }
               }//�����ڿ�
               else {
                  if(false) {
                     //��й�ȣ ��ġ�ϴ��� Ȯ���������//��й�ȣ Ʋ���� ���� �޼���
                     //JOptionPane.showMessageDialog(null, "Retry!", "Fail Login", JOptionPane.ERROR_MESSAGE);
                  }//��й�ȣ Ʋ��
                  else {
                     removeAll();
                     
                     studentPanel = new StudentPanel(text_id);
                     studentPanel.setLayout(null);
                     studentPanel.setBounds(0,0,1900,950);
                     add(studentPanel);
                     studentPanel.setVisible(true);
                     
                       repaint();
                  }
               }//����ڿ�
            }//���̵� ��й�ȣ �Է½�
         }   
      }//BtnListener

   }

}