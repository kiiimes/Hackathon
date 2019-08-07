package com.ji.ui;

import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Vector;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.ji.model.dao.AdminTrackDAO;
import com.ji.model.dao.StdTrackInfoDAO;
import com.ji.model.vo.SelectTrackCntVO;
import com.ji.model.vo.TrackVO;
import com.ji.model.vo.SubjectVO;


public class UpdateSubjectPanel extends JPanel {

	   private JLabel trackNameLbl,subjectNameLbl,typeLbl,funcLbl,newSubjectLbl;

	   private JLabel subNumLbl;private JTextField subNumTf;private itemListener itemL;

	   private JComboBox<String> trackNameCb,subjectNameCb,typeCb,funcCb;
	   private JTextField newSubjectTf;
	   private JButton update;

	   private String trackNameArr[] = {"사물인터넷","멀티미디어","시스템응용","인공지능","가상현실"};
	   private String[] subjectNameArr=new String[1000];//트랙별로 DB에서 받아와야함
	   private String typeArr[] = {"필수","선택"};
	   private String funcArr[] = {"추가","삭제","수정"};
	   private ShowTrack showTrack;

	   private BtnListener btnL;
	   
	   public String tableName;
		public String subjectTableName;
		public String newSubjectName;
		public String trackTableName;
		public String typeName;
		public String subNumTxf;
		public String condition = "";
		public String num;
		int typeNum=0;
		int n=0;

		
		 StdTrackInfoDAO stdTrackInfo = StdTrackInfoDAO.getInstance();
	      ArrayList<SubjectVO> arrSubjectVO = new ArrayList<SubjectVO>();
	      AdminTrackDAO adminTrack = AdminTrackDAO.getInstance();
	      ArrayList<SubjectVO> subName = new ArrayList<SubjectVO>();
			 
	      
	   Vector<String> col = new Vector<String>();
	   DefaultTableModel model;
	   Vector<String> drow;
	   JTable table;

	   public UpdateSubjectPanel() {
	      setPreferredSize(new Dimension(1900,800));
	      setBackground(Color.WHITE);

	      btnL = new BtnListener();

	      itemL = new itemListener();

	      trackNameLbl = new JLabel("트랙 이름");
	      trackNameLbl.setLayout(null);
	      trackNameLbl.setFont(new Font("",Font.BOLD, 15));
	      trackNameLbl.setBounds(20,10,70,50);
	      add(trackNameLbl);

	      subjectNameLbl= new JLabel("과목명");
	      subjectNameLbl.setFont(new Font("",Font.BOLD, 15));
	      subjectNameLbl.setLayout(null);
	      subjectNameLbl.setBounds(400,10,50,50);
	      add(subjectNameLbl);

	      typeLbl= new JLabel("종류");
	      typeLbl.setLayout(null);
	      typeLbl.setFont(new Font("",Font.BOLD, 15));
	      typeLbl.setBounds(780,10,50,50);
	      add(typeLbl);

	      funcLbl= new JLabel("기능");
	      funcLbl.setLayout(null);
	      funcLbl.setFont(new Font("",Font.BOLD, 15));
	      funcLbl.setBounds(1150,10,50,50);
	      add(funcLbl);

	      newSubjectLbl= new JLabel("수정 및 추가 과목 이름");
	      newSubjectLbl.setLayout(null);
	      newSubjectLbl.setFont(new Font("",Font.BOLD, 15));
	      newSubjectLbl.setBounds(1450,10,200,50);
	      newSubjectLbl.setVisible(true);
	      add(newSubjectLbl);

	      //추가
	      subNumLbl= new JLabel("학수번호");
	      subNumLbl.setLayout(null);
	      subNumLbl.setFont(new Font("",Font.BOLD, 15));
	      subNumLbl.setBounds(1450,70,100,50);
	      add(subNumLbl);


	      trackNameCb = new JComboBox<String>(trackNameArr);
	      trackNameCb.setLayout(null);
	      trackNameCb.setBounds(100,10,200,50);
	      trackNameCb.setBackground(Color.WHITE);
	      add(trackNameCb);

	      subjectNameCb = new JComboBox<String>(subjectNameArr);
	      subjectNameCb.setLayout(null);
	      subjectNameCb.setBounds(480,10,200,50);
	      subjectNameCb.setBackground(Color.WHITE);
	      subjectNameCb.setEnabled(false);
	      add(subjectNameCb);

	      typeCb = new JComboBox<String>(typeArr);
	      typeCb.setLayout(null);
	      typeCb.setBounds(850,10,200,50);
	      typeCb.setBackground(Color.WHITE);
	      add(typeCb);

	      funcCb = new JComboBox<String>(funcArr);
	      funcCb.setLayout(null);
	      funcCb.setBounds(1230,10,150,50);
	      funcCb.setBackground(Color.WHITE);
	      funcCb.addItemListener(itemL);
	      add(funcCb);

	      newSubjectTf = new JTextField();
	      newSubjectTf.setLayout(null);
	      newSubjectTf.setBounds(1630,10,150,50);
	      newSubjectTf.setBackground(Color.WHITE);
	      newSubjectTf.setVisible(true);
	      add(newSubjectTf);

	      subNumTf = new JTextField();
	      subNumTf.setLayout(null);
	      subNumTf.setBounds(1570,70,200,50);
	      subNumTf.setBackground(Color.WHITE);
	      subNumTf.setVisible(true);
	      add(subNumTf);

	      update = new JButton("GO");
	      update.setLayout(null);
	      update.setBounds(1800,10,70,50);
	      update.setForeground(Color.black);
	      update.setBackground(Color.WHITE);
	      update.addActionListener(btnL);
	      add(update);
	   }

	   private class itemListener implements ItemListener{
	      public void itemStateChanged(ItemEvent e) {
	         if((e.getItem()).equals("추가")) {
	            subjectNameCb.setEnabled(false);
	            newSubjectLbl.setVisible(true);
	            newSubjectTf.setVisible(true);
	            subNumTf.setVisible(true);
	            subNumLbl.setVisible(true);
	            
	            
	         }
	         else if((e.getItem()).equals("수정")) {

	            subjectNameCb.setEnabled(true);
	            newSubjectLbl.setVisible(true);
	            newSubjectTf.setVisible(true);
	            subNumTf.setVisible(false);
	            subNumLbl.setVisible(false);
	            trackTableName = trackNameArr[trackNameCb.getSelectedIndex()];
				System.out.println(trackTableName);
	            

				for(int i=0;i<n;i++) {
					subjectNameArr[i] = null;
				}
	          
				
				switch(trackTableName) {
				 case "사물인터넷":
					 n = stdTrackInfo.selectAllSubject(3).size();
					 subName = stdTrackInfo.selectAllSubject(3);
					
					 for(int i=0;i<n;i++) {
						 subjectNameArr[i] = subName.get(i).getSubjectName();
						 System.out.println("####");
						 System.out.println(subjectNameArr[i]);
					 }
		    		  break;
		    	  case "멀티미디어":
		    		  n = stdTrackInfo.selectAllSubject(2).size();
						 subName = stdTrackInfo.selectAllSubject(2);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
		    	  case "시스템응용":
		    		  n = stdTrackInfo.selectAllSubject(4).size();
						 subName = stdTrackInfo.selectAllSubject(4);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
		    	  case "인공지능":
		    		  n = stdTrackInfo.selectAllSubject(5).size();
						 subName = stdTrackInfo.selectAllSubject(5);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
		    	  case "가상현실":
		    		  n = stdTrackInfo.selectAllSubject(6).size();
						 subName = stdTrackInfo.selectAllSubject(6);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
				}
				subjectNameCb.setVisible(false);
				subjectNameCb = new JComboBox<String>(subjectNameArr);
			      subjectNameCb.setLayout(null);
			      subjectNameCb.setBounds(480,10,200,50);
			      subjectNameCb.setBackground(Color.WHITE);
			      add(subjectNameCb);
			      

	         }

	         else {
	            subjectNameCb.setEnabled(true);
	            newSubjectLbl.setVisible(false);
	            newSubjectTf.setVisible(false);
	            subNumTf.setVisible(false);
	            subNumLbl.setVisible(false);
	            
	            trackTableName = trackNameArr[trackNameCb.getSelectedIndex()];
				System.out.println(trackTableName);
	            

				for(int i=0;i<n;i++) {
					subjectNameArr[i] = null;
				}
	          
				
				switch(trackTableName) {
				 case "사물인터넷":
					 n = stdTrackInfo.selectAllSubject(3).size();
					 subName = stdTrackInfo.selectAllSubject(3);
					
					 for(int i=0;i<n;i++) {
						 subjectNameArr[i] = subName.get(i).getSubjectName();
						 System.out.println("####");
						 System.out.println(subjectNameArr[i]);
					 }
		    		  break;
		    	  case "멀티미디어":
		    		  n = stdTrackInfo.selectAllSubject(2).size();
						 subName = stdTrackInfo.selectAllSubject(2);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
		    	  case "시스템응용":
		    		  n = stdTrackInfo.selectAllSubject(4).size();
						 subName = stdTrackInfo.selectAllSubject(4);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
		    	  case "인공지능":
		    		  n = stdTrackInfo.selectAllSubject(5).size();
						 subName = stdTrackInfo.selectAllSubject(5);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
		    	  case "가상현실":
		    		  n = stdTrackInfo.selectAllSubject(6).size();
						 subName = stdTrackInfo.selectAllSubject(6);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
				}
				
				subjectNameCb.setVisible(false);
				subjectNameCb = new JComboBox<String>(subjectNameArr);
			      subjectNameCb.setLayout(null);
			      subjectNameCb.setBounds(480,10,200,50);
			      subjectNameCb.setBackground(Color.WHITE);
			      add(subjectNameCb);
					
	         }
	      }
	   }

	private class BtnListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {

			JButton b = (JButton) event.getSource();
			
			String btnName = null;
			btnName = b.getText();

			switch (btnName) {
			case "GO":
				
				tableName = funcArr[funcCb.getSelectedIndex()];
				trackTableName = trackNameArr[trackNameCb.getSelectedIndex()];
				
				typeName = typeArr[typeCb.getSelectedIndex()];
				
				if (typeName == "필수") {
					typeNum=1;
				}
				
				
				switch(tableName) {
				case "수정":
					subjectTableName = subjectNameArr[subjectNameCb.getSelectedIndex()];
					num = stdTrackInfo.selectSubjectNum(subjectTableName).get(0).getSubjectNum();
					adminTrack.updateSubject(num,newSubjectTf.getText());
					
					break;
					
				case "추가":
					newSubjectName = newSubjectTf.getText();
					subNumTxf = subNumTf.getText();
					
				      arrSubjectVO = stdTrackInfo.selectSubject();
				      
				      int flag =0;
				      for(int i=0;i<arrSubjectVO.size();i++) {
				    	  if(newSubjectName == arrSubjectVO.get(i).getSubjectName()||subNumTxf==arrSubjectVO.get(i).getSubjectNum()) {
				    		  flag =1;
				    	  }
				      }
				      
				      if(flag==0) {
				    	  adminTrack.insertSubject(subNumTxf, newSubjectName);
				    	  switch(trackTableName) {
				    	  case "사물인터넷":
				    		  adminTrack.insertTrack(3, subNumTxf, typeNum);
				    		  break;
				    	  case "멀티미디어":
				    		  adminTrack.insertTrack(2, subNumTxf, typeNum);
				    		  break;
				    	  case "시스템응용":
				    		  adminTrack.insertTrack(4, subNumTxf, typeNum);
				    		  break;
				    	  case "인공지능":
				    		  adminTrack.insertTrack(5, subNumTxf, typeNum);
				    		  break;
				    	  case "가상현실":
				    		  adminTrack.insertTrack(6, subNumTxf, typeNum);
				    		  break;
				    	  
				      }
				      }
					break;
					
				case "삭제":
					System.out.println(subjectNameArr[0]+"||||###");
					subjectTableName = subjectNameArr[subjectNameCb.getSelectedIndex()];
					System.out.println(subjectTableName+"@@@@@@");
					num = stdTrackInfo.selectSubjectNum(subjectTableName).get(0).getSubjectNum();
					adminTrack.deleteSubject(num);
					adminTrack.deleteTrack(num);
					break;
				
				}
				
		}
			if(b == update) {
	            showTrack = new ShowTrack((trackNameCb.getSelectedItem()).toString());
	            showTrack.setLayout(null);
	            showTrack.setBounds(50,140,1800,620);
	            add(showTrack);
	            repaint();
	         }

	} // BtnListener class
		
	}
}
