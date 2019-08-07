
package com.ji.ui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

import com.ji.model.dao.StdTrackInfoDAO;
import com.ji.model.vo.SelectTrackCntVO;
import com.ji.model.vo.RecomTrackCntVO;

public class ShowAllPanel extends JPanel {

   private JLabel iotTrackLbl,multiTrackLbl,systemTrackLbl,aiTrackLbl,virtualTrackLbl;
   private JLabel pbValue1,pbValue2,pbValue3,pbValue4,pbValue5;

   private JProgressBar iotTrackPb1,multiTrackPb1,systemTrackPb1,aiTrackPb1,virtualTrackPb1;
   private JProgressBar iotTrackPb2,multiTrackPb2,systemTrackPb2,aiTrackPb2,virtualTrackPb2;

   public ShowAllPanel() {
      setPreferredSize(new Dimension(1900,800));
      setBackground(Color.WHITE);

      iotTrackLbl = new JLabel("IOT Track");
      iotTrackLbl.setLayout(null);
      iotTrackLbl.setFont(new Font("",Font.BOLD, 15));
      iotTrackLbl.setBounds(140,10,200,50);
      add(iotTrackLbl);

      multiTrackLbl= new JLabel("Multi Media Track");
      multiTrackLbl.setFont(new Font("",Font.BOLD, 15));
      multiTrackLbl.setLayout(null);
      multiTrackLbl.setBounds(140,180,200,50);
      add(multiTrackLbl);

      systemTrackLbl= new JLabel("System App Track");
      systemTrackLbl.setLayout(null);
      systemTrackLbl.setFont(new Font("",Font.BOLD, 15));
      systemTrackLbl.setBounds(140,350,200,50);
      add(systemTrackLbl);

      aiTrackLbl= new JLabel("AI Track");
      aiTrackLbl.setLayout(null);
      aiTrackLbl.setFont(new Font("",Font.BOLD, 15));
      aiTrackLbl.setBounds(140,520,200,50);
      add(aiTrackLbl);

      virtualTrackLbl= new JLabel("Virtual Track");
      virtualTrackLbl.setLayout(null);
      virtualTrackLbl.setFont(new Font("",Font.BOLD, 15));
      virtualTrackLbl.setBounds(140,690,200,50);
      add(virtualTrackLbl);

      StdTrackInfoDAO stdTrackInfo = StdTrackInfoDAO.getInstance();
      ArrayList<SelectTrackCntVO> arrSelectTrackCntVO = new ArrayList<SelectTrackCntVO>();
      arrSelectTrackCntVO = stdTrackInfo.selectTrackCount();   


      ArrayList<RecomTrackCntVO> arrRecomTrackCntVO = new ArrayList<RecomTrackCntVO>();

      //        arrRecomTrackCntVO = stdTrackInfo.recomTrackCount(); 


      iotTrackPb1 = new JProgressBar();
      iotTrackPb1.setLayout(null);
      iotTrackPb1.setBounds(380,10,1000,30);
      int pb1 = (int)(arrSelectTrackCntVO.get(0).getCount()/9.0*100.0);      
      iotTrackPb1.setValue(pb1);      
      iotTrackPb1.setForeground(new Color(171,0,19));
      add(iotTrackPb1);
      
      pbValue1 = new JLabel(String.valueOf(pb1)+"%");
      pbValue1.setLayout(null);
      pbValue1.setBounds(1390,10,50,30);
      add(pbValue1);

      iotTrackPb2 = new JProgressBar();
      iotTrackPb2.setLayout(null);
      iotTrackPb2.setBounds(380,50,1000,30);
      iotTrackPb2.setValue(10);
      iotTrackPb2.setForeground(new Color(0,0,100));
      add(iotTrackPb2);

      multiTrackPb1 = new JProgressBar();
      multiTrackPb1.setLayout(null);
      multiTrackPb1.setBounds(380,180,1000,30);
      int pb2 = (int)(arrSelectTrackCntVO.get(1).getCount()/9.0*100.0);   
      multiTrackPb1.setValue(pb2);
      multiTrackPb1.setForeground(new Color(171,0,19));
      add(multiTrackPb1);

      pbValue2 = new JLabel(String.valueOf(pb2)+"%");
      pbValue2.setLayout(null);
      pbValue2.setBounds(1390,180,50,30);
      add(pbValue2);

      multiTrackPb2 = new JProgressBar();
      multiTrackPb2.setLayout(null);
      multiTrackPb2.setBounds(380,220,1000,30);
      multiTrackPb2.setValue(20);
      multiTrackPb2.setForeground(new Color(0,0,100));
      add(multiTrackPb2);

      systemTrackPb1 = new JProgressBar();
      systemTrackPb1.setLayout(null);
      systemTrackPb1.setBounds(380,350,1000,30);
      int pb3 = (int)(arrSelectTrackCntVO.get(2).getCount()/9.0*100.0);   
      systemTrackPb1.setValue(pb3);
      systemTrackPb1.setForeground(new Color(171,0,19));
      add(systemTrackPb1);

      pbValue3 = new JLabel(String.valueOf(pb3)+"%");
      pbValue3.setLayout(null);
      pbValue3.setBounds(1390,350,50,30);
      add(pbValue3);
      
      systemTrackPb2 = new JProgressBar();
      systemTrackPb2.setLayout(null);
      systemTrackPb2.setBounds(380,390,1000,30);
      systemTrackPb2.setValue(30);
      systemTrackPb2.setForeground(new Color(0,0,100));
      add(systemTrackPb2);

      aiTrackPb1 = new JProgressBar();
      aiTrackPb1.setLayout(null);
      aiTrackPb1.setBounds(380,520,1000,30);
      int pb4 = (int)(arrSelectTrackCntVO.get(3).getCount()/9.0*100.0);   
      aiTrackPb1.setValue(pb4);
      aiTrackPb1.setForeground(new Color(171,0,19));
      add(aiTrackPb1);
      
      pbValue4 = new JLabel(String.valueOf(pb4)+"%");
      pbValue4.setLayout(null);
      pbValue4.setBounds(1390,520,50,30);
      add(pbValue4);

      aiTrackPb2 = new JProgressBar();
      aiTrackPb2.setLayout(null);
      aiTrackPb2.setBounds(380,560,1000,30);
      aiTrackPb2.setValue(40);
      aiTrackPb2.setForeground(new Color(0,0,100));
      add(aiTrackPb2);

      virtualTrackPb1 = new JProgressBar();
      virtualTrackPb1.setLayout(null);
      virtualTrackPb1.setBounds(380,690,1000,30);
      int pb5 = (int)(arrSelectTrackCntVO.get(4).getCount()/9.0*100.0);   
      virtualTrackPb1.setValue(pb5);
      virtualTrackPb1.setForeground(new Color(171,0,19));
      add(virtualTrackPb1);

      pbValue5 = new JLabel(String.valueOf(pb5)+"%");
      pbValue5.setLayout(null);
      pbValue5.setBounds(1390,690,50,30);
      add(pbValue5);
      
      virtualTrackPb2 = new JProgressBar();
      virtualTrackPb2.setLayout(null);
      virtualTrackPb2.setBounds(380,730,1000,30);
      virtualTrackPb2.setValue(50);
      virtualTrackPb2.setForeground(new Color(0,0,100));
      add(virtualTrackPb2);
   }
}
