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

	   private String trackNameArr[] = {"�繰���ͳ�","��Ƽ�̵��","�ý�������","�ΰ�����","��������"};
	   private String[] subjectNameArr=new String[1000];//Ʈ������ DB���� �޾ƿ;���
	   private String typeArr[] = {"�ʼ�","����"};
	   private String funcArr[] = {"�߰�","����","����"};
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

	      trackNameLbl = new JLabel("Ʈ�� �̸�");
	      trackNameLbl.setLayout(null);
	      trackNameLbl.setFont(new Font("",Font.BOLD, 15));
	      trackNameLbl.setBounds(20,10,70,50);
	      add(trackNameLbl);

	      subjectNameLbl= new JLabel("�����");
	      subjectNameLbl.setFont(new Font("",Font.BOLD, 15));
	      subjectNameLbl.setLayout(null);
	      subjectNameLbl.setBounds(400,10,50,50);
	      add(subjectNameLbl);

	      typeLbl= new JLabel("����");
	      typeLbl.setLayout(null);
	      typeLbl.setFont(new Font("",Font.BOLD, 15));
	      typeLbl.setBounds(780,10,50,50);
	      add(typeLbl);

	      funcLbl= new JLabel("���");
	      funcLbl.setLayout(null);
	      funcLbl.setFont(new Font("",Font.BOLD, 15));
	      funcLbl.setBounds(1150,10,50,50);
	      add(funcLbl);

	      newSubjectLbl= new JLabel("���� �� �߰� ���� �̸�");
	      newSubjectLbl.setLayout(null);
	      newSubjectLbl.setFont(new Font("",Font.BOLD, 15));
	      newSubjectLbl.setBounds(1450,10,200,50);
	      newSubjectLbl.setVisible(true);
	      add(newSubjectLbl);

	      //�߰�
	      subNumLbl= new JLabel("�м���ȣ");
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
	         if((e.getItem()).equals("�߰�")) {
	            subjectNameCb.setEnabled(false);
	            newSubjectLbl.setVisible(true);
	            newSubjectTf.setVisible(true);
	            subNumTf.setVisible(true);
	            subNumLbl.setVisible(true);
	            
	            
	         }
	         else if((e.getItem()).equals("����")) {

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
				 case "�繰���ͳ�":
					 n = stdTrackInfo.selectAllSubject(3).size();
					 subName = stdTrackInfo.selectAllSubject(3);
					
					 for(int i=0;i<n;i++) {
						 subjectNameArr[i] = subName.get(i).getSubjectName();
						 System.out.println("####");
						 System.out.println(subjectNameArr[i]);
					 }
		    		  break;
		    	  case "��Ƽ�̵��":
		    		  n = stdTrackInfo.selectAllSubject(2).size();
						 subName = stdTrackInfo.selectAllSubject(2);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
		    	  case "�ý�������":
		    		  n = stdTrackInfo.selectAllSubject(4).size();
						 subName = stdTrackInfo.selectAllSubject(4);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
		    	  case "�ΰ�����":
		    		  n = stdTrackInfo.selectAllSubject(5).size();
						 subName = stdTrackInfo.selectAllSubject(5);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
		    	  case "��������":
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
				 case "�繰���ͳ�":
					 n = stdTrackInfo.selectAllSubject(3).size();
					 subName = stdTrackInfo.selectAllSubject(3);
					
					 for(int i=0;i<n;i++) {
						 subjectNameArr[i] = subName.get(i).getSubjectName();
						 System.out.println("####");
						 System.out.println(subjectNameArr[i]);
					 }
		    		  break;
		    	  case "��Ƽ�̵��":
		    		  n = stdTrackInfo.selectAllSubject(2).size();
						 subName = stdTrackInfo.selectAllSubject(2);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
		    	  case "�ý�������":
		    		  n = stdTrackInfo.selectAllSubject(4).size();
						 subName = stdTrackInfo.selectAllSubject(4);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
		    	  case "�ΰ�����":
		    		  n = stdTrackInfo.selectAllSubject(5).size();
						 subName = stdTrackInfo.selectAllSubject(5);
						
						 for(int i=0;i<n;i++) {
							 subjectNameArr[i] = subName.get(i).getSubjectName();
							 System.out.println("####");
							 System.out.println(subjectNameArr[i]);
						 }
		    		  break;
		    	  case "��������":
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
				
				if (typeName == "�ʼ�") {
					typeNum=1;
				}
				
				
				switch(tableName) {
				case "����":
					subjectTableName = subjectNameArr[subjectNameCb.getSelectedIndex()];
					num = stdTrackInfo.selectSubjectNum(subjectTableName).get(0).getSubjectNum();
					adminTrack.updateSubject(num,newSubjectTf.getText());
					
					break;
					
				case "�߰�":
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
				    	  case "�繰���ͳ�":
				    		  adminTrack.insertTrack(3, subNumTxf, typeNum);
				    		  break;
				    	  case "��Ƽ�̵��":
				    		  adminTrack.insertTrack(2, subNumTxf, typeNum);
				    		  break;
				    	  case "�ý�������":
				    		  adminTrack.insertTrack(4, subNumTxf, typeNum);
				    		  break;
				    	  case "�ΰ�����":
				    		  adminTrack.insertTrack(5, subNumTxf, typeNum);
				    		  break;
				    	  case "��������":
				    		  adminTrack.insertTrack(6, subNumTxf, typeNum);
				    		  break;
				    	  
				      }
				      }
					break;
					
				case "����":
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
