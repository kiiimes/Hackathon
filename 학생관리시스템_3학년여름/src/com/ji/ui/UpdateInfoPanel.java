package com.ji.ui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class UpdateInfoPanel extends JPanel {
   
   private JTextField studIdField;
   private JPanel show;
   
   private JLabel studIdLbl,studNameShowLbl, studIdShowLbl, studMajorShowLbl, studSemesterShowLbl;

   
   public UpdateInfoPanel() {
      setPreferredSize(new Dimension(1900,800));
      
      studIdLbl = new JLabel("UpdateInfoPanel");
      studIdLbl.setLayout(null);
      studIdLbl.setBounds(100,150,200,800);
      add(studIdLbl);
   }
   
   private class BtnListener implements MouseListener{
        public void mouseClicked(MouseEvent event) {}
        public void mousePressed(MouseEvent event) {}
        public void mouseReleased(MouseEvent event) {
           JButton btn = (JButton)event.getSource();
           
        }
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}         
     }//BtnMenuListener
}