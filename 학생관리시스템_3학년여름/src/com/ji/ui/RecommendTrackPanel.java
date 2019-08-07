package com.ji.ui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

import com.ji.model.dao.StdTrackInfoDAO;
import com.ji.model.dao.StuInfoDAO;
import com.ji.model.vo.RecomTrackCntVO;
import com.ji.model.vo.SelectTrackCntVO;
import com.ji.model.vo.StudentVO;


public class RecommendTrackPanel extends JPanel {
   
   private JTextField studIdField;
   private JPanel show;
   
   private JButton exit;
   private JLabel one, two, three;
   
   
   private JLabel studIdLbl,studNameShowLbl, studIdShowLbl, studMajorShowLbl, studSemesterShowLbl;
   private JLabel studNameLbl, studIDLbl, studMajorLbl, studSemesterLbl;
   
   private JLabel T1opt,T1ness,T2opt,T2ness,T3opt,T3ness,T4opt,T4ness,T5opt,T5ness;
   
   private JButton track1, track2, track3, track4, track5;
   
   private JProgressBar T1Pbness,T2Pbness,T3Pbness,T4Pbness,T5Pbness;
   private JProgressBar T1Pbopt,T2Pbopt,T3Pbopt,T4Pbopt,T5Pbopt;
   
   private BtnListener btnL;
   
   
   
   private JButton searchBtn;
   
   
   public RecommendTrackPanel(String text) {
      setPreferredSize(new Dimension(1900,800));
     // btnL = new BtnListener();
      
      studNameLbl = new JLabel();
      studIDLbl = new JLabel();
      studMajorLbl = new JLabel();
      studSemesterLbl = new JLabel();
      
      studNameShowLbl = new JLabel("이름");
      studNameShowLbl.setLayout(null);
      studNameShowLbl.setFont(new Font("",Font.BOLD, 25));
      studNameShowLbl.setBounds(480,55,200,30);
      studNameShowLbl.setVisible(true);
      add(studNameShowLbl);
      
      studIdShowLbl = new JLabel("학번");
      studIdShowLbl.setLayout(null);
      studIdShowLbl.setFont(new Font("",Font.BOLD, 25));
      studIdShowLbl.setBounds(690,55,200,30);
      studIdShowLbl.setVisible(true);
      add(studIdShowLbl);
      
      studMajorShowLbl = new JLabel("학과");
      studMajorShowLbl.setLayout(null);
      studMajorShowLbl.setFont(new Font("",Font.BOLD, 25));
      studMajorShowLbl.setBounds(900,55,200,30);
      studMajorShowLbl.setVisible(true);
      add(studMajorShowLbl);
      
      studSemesterShowLbl = new JLabel("학기");
      studSemesterShowLbl.setLayout(null);
      studSemesterShowLbl.setFont(new Font("",Font.BOLD, 25));
      studSemesterShowLbl.setBounds(1210,55,200,30);
      studSemesterShowLbl.setVisible(true);
      add(studSemesterShowLbl);
      
      track1 = new JButton();
      track1.setFont(new Font("",Font.BOLD, 25));
      track1.setLayout(null);
      track1.setBounds(250,140,200,30);
      track1.setVisible(true);
      add(track1);
      
      T1Pbness = new JProgressBar();
      T1Pbness.setLayout(null);
      T1Pbness.setBounds(250,210,450,30);
      T1Pbness.setForeground(new Color(171,0,19));
      T1Pbness.setVisible(true);
      add(T1Pbness);
      
      T1Pbopt = new JProgressBar();
      T1Pbopt.setLayout(null);
      T1Pbopt.setBounds(250,260,450,30);
      T1Pbopt.setForeground(new Color(0,0,100));
      T1Pbopt.setVisible(true);
      add(T1Pbopt);
   
      track2 = new JButton();
      track2.setFont(new Font("",Font.BOLD, 25));
      track2.setLayout(null);
      track2.setBounds(1100,140,200,30);
      track2.setVisible(true);
      add(track2);
      
      T2Pbness = new JProgressBar();
      T2Pbness.setLayout(null);
      T2Pbness.setBounds(1100,210,450,30);
      T2Pbness.setForeground(new Color(171,0,19));
      T2Pbness.setVisible(true);
      add(T2Pbness);
      
      T2Pbopt = new JProgressBar();
      T2Pbopt.setLayout(null);
      T2Pbopt.setBounds(1100,260,450,30);
      T2Pbopt.setForeground(new Color(0,0,100));
      T2Pbopt.setVisible(true);
      add(T2Pbopt);
      
      track3 = new JButton();
      track3.setFont(new Font("",Font.BOLD, 25));
      track3.setLayout(null);
      track3.setBounds(50,440,200,30);
      track3.setVisible(true);
      add(track3);
      
      T3Pbness = new JProgressBar();
      T3Pbness.setLayout(null);
      T3Pbness.setBounds(50,510,400,30);
      T3Pbness.setForeground(new Color(171,0,19));
      T3Pbness.setVisible(true);
      add(T3Pbness);
      
      T3Pbopt = new JProgressBar();
      T3Pbopt.setLayout(null);
      T3Pbopt.setBounds(50,560,400,30);
      T3Pbopt.setForeground(new Color(0,0,100));
      T3Pbopt.setVisible(true);
      add(T3Pbopt);

      track4 = new JButton();
      track4.setFont(new Font("",Font.BOLD, 25));
      track4.setLayout(null);
      track4.setBounds(650,440,200,30);
      track4.setVisible(true);
      add(track4);
      
      T4Pbness = new JProgressBar();
      T4Pbness.setLayout(null);
      T4Pbness.setBounds(650,510,400,30);
      T4Pbness.setForeground(new Color(171,0,19));
      T4Pbness.setVisible(true);
      add(T4Pbness);
      
      T4Pbopt = new JProgressBar();
      T4Pbopt.setLayout(null);
      T4Pbopt.setBounds(650,560,400,30);
      T4Pbopt.setForeground(new Color(0,0,100));
      T4Pbopt.setVisible(true);
      add(T4Pbopt);
      
      track5 = new JButton();
      track5.setFont(new Font("",Font.BOLD, 25));
      track5.setLayout(null);
      track5.setBounds(1250,420,200,30);
      track5.setVisible(true);
      add(track5);
      
      T5Pbness = new JProgressBar();
      T5Pbness.setLayout(null);
      T5Pbness.setBounds(1250,510,400,30);
      T5Pbness.setForeground(new Color(171,0,19));
      T5Pbness.setVisible(true);
      add(T5Pbness);
      
      T5Pbopt = new JProgressBar();
      T5Pbopt.setLayout(null);
      T5Pbopt.setBounds(1250,560,400,30);
      T5Pbopt.setForeground(new Color(0,0,100));
      T5Pbopt.setVisible(true);
      add(T5Pbopt);
      
      showStudent(text);
      
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
   
   public void showStudent(String text){
      int id, semester;
      String name, major;
      id = Integer.parseInt(text);
      
       StuInfoDAO StuInfo = StuInfoDAO.getInstance();
         ArrayList<StudentVO> arrStudentVO = new ArrayList<StudentVO>();
         arrStudentVO = StuInfo.selectInfo(id);   
        
        name = arrStudentVO.get(0).getStudentName();
        major = arrStudentVO.get(0).getMajor();
       semester = arrStudentVO.get(0).getSemester();
         
       studNameLbl.setText(name);
       studNameLbl.setLayout(null);
       studNameLbl.setBounds(480,90,200,30);
       studNameLbl.setFont(new Font("",Font.BOLD, 20));
       add(studNameLbl);
       
       studIDLbl.setText(text);
       studIDLbl.setLayout(null);
       studIDLbl.setBounds(690,90,200,30);
       studIDLbl.setFont(new Font("",Font.BOLD, 20));
       add(studIDLbl);
       
       studMajorLbl.setText(major);
       studMajorLbl.setLayout(null);
       studMajorLbl.setBounds(900,90,300,30);
       studMajorLbl.setFont(new Font("",Font.BOLD, 20));
       add(studMajorLbl);
       
       studSemesterLbl.setText(Integer.toString(semester));
       studSemesterLbl.setLayout(null);
       studSemesterLbl.setBounds(1210,90,200,30);
       studSemesterLbl.setFont(new Font("",Font.BOLD, 20));
       add(studSemesterLbl);

       StdTrackInfoDAO stdTrackInfo = StdTrackInfoDAO.getInstance();
        ArrayList<RecomTrackCntVO> arrSelectTrackCntVO = new ArrayList<RecomTrackCntVO>();
        arrSelectTrackCntVO = stdTrackInfo.recomTrackCount(id);   

       
        for(int i=0;i<arrSelectTrackCntVO.size();i++) {
           String trackname;
           int key = (int)(arrSelectTrackCntVO.get(i).getTrackKey());
           
           if(key==2) {
              trackname = "multimedia";
           }
           else if(key == 3) {
              trackname = "IoT";
           }
           else if(key==4) {
              trackname = "System application";
           }
           else if(key ==5) {
              trackname = "AI";
           }
           else if(key==6) {
              trackname = "virtual reality";
           }
           else
              trackname = "NULL";
           
           StdTrackInfoDAO track = StdTrackInfoDAO.getInstance();
            ArrayList<RecomTrackCntVO> arrTrackVO = new ArrayList<RecomTrackCntVO>();
            arrTrackVO = track.recomTrackCount_2ness(id,key);   
            
           int pb = (int)((arrTrackVO.get(0).getCount())/3.0*100.0);      
           if(i==0) {
              track1.setText(trackname);
              T1Pbness.setValue(pb);
           }
           else if(i==1) {
              track2.setText(trackname);
              T2Pbness.setValue(pb);
           }
           else if(i==2) {
              track3.setText(trackname);
              T3Pbness.setValue(pb);
           }
           else if(i==3) {
              track4.setText(trackname);
              T4Pbness.setValue(pb);
           }
           else if(i==4) {
              track5.setText(trackname);
              T5Pbness.setValue(pb);
           }
           
           StdTrackInfoDAO Track = StdTrackInfoDAO.getInstance();
            ArrayList<RecomTrackCntVO> ArrTrackVO = new ArrayList<RecomTrackCntVO>();
            ArrTrackVO = Track.recomTrackCount_2opt(id,key);   
            
           pb = (int)((ArrTrackVO.get(0).getCount())/6.0*100.0);      
           if(i==0)T1Pbopt.setValue(pb);
           else if(i==1)T2Pbopt.setValue(pb);
           else if(i==2)T3Pbopt.setValue(pb);
           else if(i==3)T4Pbopt.setValue(pb);
           else if(i==4)T5Pbopt.setValue(pb);
           
           
        }
      
       
      
   }
   
}