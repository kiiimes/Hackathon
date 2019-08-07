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


public class SearchStud extends JPanel {

   private JTextField studIdField;
   private JPanel show;

   private JButton exit;
   private JLabel one, two, three;


   private JLabel studIdLbl,studNameShowLbl, studIdShowLbl, studMajorShowLbl, studSemesterShowLbl;
   private JLabel studNameLbl, studIDLbl, studMajorLbl, studSemesterLbl;

   private JLabel T1opt,T1ness,T2opt,T2ness,T3opt,T3ness,T4opt,T4ness,T5opt,T5ness;
   private JLabel lbl1,lbl2,lbl3,lbl4,lbl5;
   private JLabel lbl_1,lbl_2,lbl_3,lbl_4,lbl_5;
   
   private JButton track1, track2, track3, track4, track5;

   private JProgressBar T1Pbness,T2Pbness,T3Pbness,T4Pbness,T5Pbness;
   private JProgressBar T1Pbopt,T2Pbopt,T3Pbopt,T4Pbopt,T5Pbopt;

   private BtnListener btnL;



   private JButton searchBtn;


   public SearchStud() {
      setPreferredSize(new Dimension(1900,800));
      btnL = new BtnListener();

      studNameLbl = new JLabel();
      studIDLbl = new JLabel();
      studMajorLbl = new JLabel();
      studSemesterLbl = new JLabel();
      lbl_1 = new JLabel();
      lbl_2 = new JLabel();
      lbl_3 = new JLabel();
      lbl_4 = new JLabel();
      lbl_5 = new JLabel();
      lbl1 = new JLabel();
      lbl2 = new JLabel();
      lbl3 = new JLabel();
      lbl4 = new JLabel();
      lbl5 = new JLabel();

      studIdLbl = new JLabel("학번 입력 : ");
      studIdLbl.setLayout(null);
      studIdLbl.setFont(new Font("",Font.BOLD, 25));
      studIdLbl.setBounds(600,10,200,30);
      add(studIdLbl);

      studIdField = new JTextField();
      studIdField.setLayout(null);
      studIdField.setBounds(820,10,200,30);
      studIdField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
      add(studIdField);

      searchBtn = new JButton("검색");
      searchBtn.setLayout(null);
      searchBtn.setFont(new Font("",Font.BOLD, 25));
      searchBtn.setBounds(1100, 10, 100, 30);
      searchBtn.addMouseListener(btnL);
      add(searchBtn);

      studNameShowLbl = new JLabel("이름");
      studNameShowLbl.setLayout(null);
      studNameShowLbl.setFont(new Font("",Font.BOLD, 25));
      studNameShowLbl.setBounds(480,55,200,30);
      studNameShowLbl.setVisible(false);
      add(studNameShowLbl);

      studIdShowLbl = new JLabel("학번");
      studIdShowLbl.setLayout(null);
      studIdShowLbl.setFont(new Font("",Font.BOLD, 25));
      studIdShowLbl.setBounds(690,55,200,30);
      studIdShowLbl.setVisible(false);
      add(studIdShowLbl);

      studMajorShowLbl = new JLabel("학과");
      studMajorShowLbl.setLayout(null);
      studMajorShowLbl.setFont(new Font("",Font.BOLD, 25));
      studMajorShowLbl.setBounds(900,55,200,30);
      studMajorShowLbl.setVisible(false);
      add(studMajorShowLbl);

      studSemesterShowLbl = new JLabel("학기");
      studSemesterShowLbl.setLayout(null);
      studSemesterShowLbl.setFont(new Font("",Font.BOLD, 25));
      studSemesterShowLbl.setBounds(1210,55,200,30);
      studSemesterShowLbl.setVisible(false);
      add(studSemesterShowLbl);

      track1 = new JButton();
      track1.setFont(new Font("",Font.BOLD, 25));
      track1.setLayout(null);
      track1.setBounds(250,140,200,30);
      track1.setVisible(false);
      add(track1);

      T1Pbness = new JProgressBar();
      T1Pbness.setLayout(null);
      T1Pbness.setBounds(250,210,450,30);
      T1Pbness.setForeground(new Color(171,0,19));
      T1Pbness.setVisible(false);
      add(T1Pbness);

      T1Pbopt = new JProgressBar();
      T1Pbopt.setLayout(null);
      T1Pbopt.setBounds(250,260,450,30);
      T1Pbopt.setValue(40);
      T1Pbopt.setForeground(new Color(0,0,100));
      T1Pbopt.setVisible(false);
      add(T1Pbopt);

      track2 = new JButton();
      track2.setFont(new Font("",Font.BOLD, 25));
      track2.setLayout(null);
      track2.setBounds(1100,140,200,30);
      track2.setVisible(false);
      add(track2);

      T2Pbness = new JProgressBar();
      T2Pbness.setLayout(null);
      T2Pbness.setBounds(1100,210,450,30);
      T2Pbness.setValue(60);
      T2Pbness.setForeground(new Color(171,0,19));
      T2Pbness.setVisible(false);
      add(T2Pbness);

      T2Pbopt = new JProgressBar();
      T2Pbopt.setLayout(null);
      T2Pbopt.setBounds(1100,260,450,30);
      T2Pbopt.setValue(20);
      T2Pbopt.setForeground(new Color(0,0,100));
      T2Pbopt.setVisible(false);
      add(T2Pbopt);

      track3 = new JButton();
      track3.setFont(new Font("",Font.BOLD, 25));
      track3.setLayout(null);
      track3.setBounds(50,440,200,30);
      track3.setVisible(false);
      add(track3);

      T3Pbness = new JProgressBar();
      T3Pbness.setLayout(null);
      T3Pbness.setBounds(50,510,400,30);
      T3Pbness.setValue(0);
      T3Pbness.setForeground(new Color(171,0,19));
      T3Pbness.setVisible(false);
      add(T3Pbness);

      T3Pbopt = new JProgressBar();
      T3Pbopt.setLayout(null);
      T3Pbopt.setBounds(50,560,400,30);
      T3Pbopt.setValue(20);
      T3Pbopt.setForeground(new Color(0,0,100));
      T3Pbopt.setVisible(false);
      add(T3Pbopt);

      track4 = new JButton();
      track4.setFont(new Font("",Font.BOLD, 25));
      track4.setLayout(null);
      track4.setBounds(650,440,200,30);
      track4.setVisible(false);
      add(track4);

      T4Pbness = new JProgressBar();
      T4Pbness.setLayout(null);
      T4Pbness.setBounds(650,510,400,30);
      T4Pbness.setValue(0);
      T4Pbness.setForeground(new Color(171,0,19));
      T4Pbness.setVisible(false);
      add(T4Pbness);

      T4Pbopt = new JProgressBar();
      T4Pbopt.setLayout(null);
      T4Pbopt.setBounds(650,560,400,30);
      T4Pbopt.setValue(20);
      T4Pbopt.setForeground(new Color(0,0,100));
      T4Pbopt.setVisible(false);
      add(T4Pbopt);

      track5 = new JButton();
      track5.setFont(new Font("",Font.BOLD, 25));
      track5.setLayout(null);
      track5.setBounds(1250,420,200,30);
      track5.setVisible(false);
      add(track5);

      T5Pbness = new JProgressBar();
      T5Pbness.setLayout(null);
      T5Pbness.setBounds(1250,510,400,30);
      T5Pbness.setValue(30);
      T5Pbness.setForeground(new Color(171,0,19));
      T5Pbness.setVisible(false);
      add(T5Pbness);

      T5Pbopt = new JProgressBar();
      T5Pbopt.setLayout(null);
      T5Pbopt.setBounds(1250,560,400,30);
      T5Pbopt.setValue(20);
      T5Pbopt.setForeground(new Color(0,0,100));
      T5Pbopt.setVisible(false);
      add(T5Pbopt);


   }

   private class BtnListener implements MouseListener{
      public void mouseClicked(MouseEvent event) {}
      public void mousePressed(MouseEvent event) {}
      public void mouseReleased(MouseEvent event) {
         JButton btn = (JButton)event.getSource();

         if(btn == searchBtn) {
            studNameShowLbl.setVisible(true);
            studIdShowLbl.setVisible(true);
            studMajorShowLbl.setVisible(true);
            studSemesterShowLbl.setVisible(true);
            
            showStudent();

            track1.setVisible(true);
            track2.setVisible(true);
            track3.setVisible(true);
            track4.setVisible(true);
            track5.setVisible(true);
            T1Pbness.setVisible(true);
            T1Pbopt.setVisible(true);
            T2Pbness.setVisible(true);
            T2Pbopt.setVisible(true);
            T3Pbness.setVisible(true);
            T3Pbopt.setVisible(true);
            T4Pbness.setVisible(true);
            T4Pbopt.setVisible(true);
            T5Pbness.setVisible(true);
            T5Pbopt.setVisible(true);
            repaint();
            //db에서 학번으로 검색해서 값 얻어와야 ?
         }
      }
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}         
   }//BtnMenuListener

   public void showStudent(){
      int id, semester;
      String name, major;
      id = Integer.parseInt(studIdField.getText());

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

      studIDLbl.setText(Integer.toString(id));
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


      lbl1.setLayout(null);
      lbl1.setBounds(710,210,30,30);

      lbl2.setLayout(null);
      lbl2.setBounds(1560,210,30,30);

      lbl3.setLayout(null);
      lbl3.setBounds(460,510,30,30);
      
      lbl4.setLayout(null);
      lbl4.setBounds(1060,510,30,30);
      
      lbl5.setLayout(null);
      lbl5.setBounds(1660,510,30,30);
      

      lbl_1.setLayout(null);
      lbl_1.setBounds(710,260,30,30);
      
      lbl_2.setLayout(null);
      lbl_2.setBounds(1560,260,30,30);
      
      lbl_3.setLayout(null);
      lbl_3.setBounds(460,560,30,30);

      lbl_4.setLayout(null);
      lbl_4.setBounds(1060,560,30,30);
      
      lbl_5.setLayout(null);
      lbl_5.setBounds(1660,560,30,30);
      
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
            lbl1.removeAll();
            lbl1.setText(String.valueOf(pb)+"%");
            add(lbl1);
         }
         else if(i==1) {
            track2.setText(trackname);
            T2Pbness.setValue(pb); 
            lbl2.removeAll();
            lbl2.setText(String.valueOf(pb)+"%");
            add(lbl2);
         }
         else if(i==2) {
            track3.setText(trackname);
            T3Pbness.setValue(pb);
            lbl3.removeAll();
            lbl3.setText(String.valueOf(pb)+"%");
            add(lbl3);
         }
         else if(i==3) {
            track4.setText(trackname);
            T4Pbness.setValue(pb);
            lbl4.removeAll();
            lbl4.setText(String.valueOf(pb)+"%");
            add(lbl4);
         }
         else if(i==4) {
            track5.setText(trackname);
            T5Pbness.setValue(pb);
            lbl5.removeAll();
            lbl5.setText(String.valueOf(pb)+"%");
            add(lbl5);
         }
         repaint();

         StdTrackInfoDAO Track = StdTrackInfoDAO.getInstance();
         ArrayList<RecomTrackCntVO> ArrTrackVO = new ArrayList<RecomTrackCntVO>();
         ArrTrackVO = Track.recomTrackCount_2opt(id,key);   

         pb = (int)((ArrTrackVO.get(0).getCount())/6.0*100.0);      
         if(i==0) {
            T1Pbopt.setValue(pb);
            lbl_1.setText(String.valueOf(pb)+"%");
            add(lbl_1);
         }
         
         else if(i==1){
            T2Pbopt.setValue(pb);
            lbl_2.setText(String.valueOf(pb)+"%");
            add(lbl_2);
         }
         else if(i==2){
            T3Pbopt.setValue(pb); 
            lbl_3.setText(String.valueOf(pb)+"%");
            add(lbl_3);

         }
         else if(i==3){
            T4Pbopt.setValue(pb);
            lbl_4.setText(String.valueOf(pb)+"%");
            add(lbl_4);
         }
         else if(i==4){
            T5Pbopt.setValue(pb);
            lbl_5.setText(String.valueOf(pb)+"%");
            add(lbl_5);
         }
         repaint();
      }
   }

}