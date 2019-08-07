package com.ji.ui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import com.ji.model.dao.StdTrackInfoDAO;
import com.ji.model.vo.SelectTrackCntVO;
import com.ji.model.dao.AdminTrackDAO;
import com.ji.model.dao.StdTrackInfoDAO;
import com.ji.model.vo.TrackVO;
import com.ji.model.vo.SubjectVO;


public class ShowTrack extends JPanel {

	private JPanel primaryP,selectP;
	private JLabel primaryLbl,selectLbl;

	private String[] primaryArr,selectArr;

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

	public ShowTrack(String trackName) {

		setPreferredSize(new Dimension(1800,620));
		setBackground(Color.WHITE);

		primaryP = new JPanel();
		primaryP.setLayout(null);
		primaryP.setBounds(0,0,1800,300);
		add(primaryP);

		primaryLbl = new JLabel("�ʼ� ����");
		primaryLbl.setLayout(null);
		primaryLbl.setFont(new Font("",Font.BOLD, 20));
		primaryLbl.setBounds(30,5,100,30);
		primaryP.add(primaryLbl);

		primaryArr = new String[1000];//�̰͵� ���������� flag �� ���� �ʼ��ΰŸ� �ֱ�


		for(int i=0;i<20;i++) {
			primaryArr[i] = null;
		}


		switch(trackName) {
		case "�繰���ͳ�":
			System.out.println("�繰");
			primaryP.removeAll();
			primaryP.add(primaryLbl);
			
			n = stdTrackInfo.selectFSubject(3).size();
			subName = stdTrackInfo.selectFSubject(3);

			for (int i=0;i<n;i++) {
				primaryArr[i] = subName.get(i).getSubjectName();
				System.out.println(primaryArr[i]);
			}

			for(int i=0;i<n;i++) {

				JLabel lbl = new JLabel(primaryArr[i]);
				lbl.setLayout(null);
				lbl.setBounds(50+((i/5)*500),60+((i)*60)%300,400,50);
				primaryP.add(lbl);
			}
			repaint();
			break;
		case "��Ƽ�̵��":
			System.out.println("��Ƽ�̵��");
			primaryP.removeAll();
			primaryP.add(primaryLbl);
			
			n = stdTrackInfo.selectFSubject(2).size();
			subName = stdTrackInfo.selectFSubject(2);
			for (int i=0;i<n;i++) {
				primaryArr[i] = subName.get(i).getSubjectName();
				System.out.println(primaryArr[i]);
			}
			for(int i=0;i<n;i++) {

				JLabel lbl = new JLabel(primaryArr[i]);
				lbl.setLayout(null);
				lbl.setBounds(50+((i/5)*500),60+((i)*60)%300,400,50);

				primaryP.add(lbl);
			}
			add(primaryP);

			repaint();
			break;
		case "�ý�������":
			System.out.println("���뤷");
			primaryP.removeAll();
			primaryP.add(primaryLbl);
			
			n = stdTrackInfo.selectFSubject(4).size();
			subName = stdTrackInfo.selectFSubject(4);
			for (int i=0;i<n;i++) {
				primaryArr[i] = subName.get(i).getSubjectName();
				System.out.println(primaryArr[i]);
			}

			for(int i=0;i<n;i++) {

				JLabel lbl = new JLabel(primaryArr[i]);
				lbl.setLayout(null);
				lbl.setBounds(50+((i/5)*500),60+((i)*60)%300,400,50);
				primaryP.add(lbl);
			}
			repaint();
			break;
		case "�ΰ�����":
			System.out.println("�ΰ�����");
			primaryP.removeAll();
			primaryP.add(primaryLbl);
			
			n = stdTrackInfo.selectFSubject(5).size();
			subName = stdTrackInfo.selectFSubject(5);
			for (int i=0;i<n;i++) {
				primaryArr[i] = subName.get(i).getSubjectName();
				System.out.println(primaryArr[i]);
			}

			for(int i=0;i<n;i++) {

				JLabel lbl = new JLabel(primaryArr[i]);
				lbl.setLayout(null);
				lbl.setBounds(50+((i/5)*500),60+((i)*60)%300,400,50);
				primaryP.add(lbl);
			}
			repaint();
			break;
		case "��������":
			System.out.println("��������");
			primaryP.removeAll();
			primaryP.add(primaryLbl);
			
			n = stdTrackInfo.selectFSubject(6).size();
			subName = stdTrackInfo.selectFSubject(6);
			for (int i=0;i<n;i++) {
				primaryArr[i] = subName.get(i).getSubjectName();
				System.out.println(primaryArr[i]);
			}
			

			for(int i=0;i<n;i++) {

				JLabel lbl = new JLabel(primaryArr[i]);
				lbl.setLayout(null);
				lbl.setBounds(50+((i/5)*500),60+((i)*60)%300,400,50);
				primaryP.add(lbl);
			}
			repaint();
			break;
		}      
		

		selectP = new JPanel();
		selectP.setLayout(null);
		selectP.setBounds(0,320,1800,300);
		add(selectP);

		selectLbl = new JLabel("���� ����");
		selectLbl.setLayout(null);
		selectLbl.setFont(new Font("",Font.BOLD, 20));
		selectLbl.setBounds(30,5,100,30);
		selectP.add(selectLbl);

		selectArr = new String[1000];

		for(int i=0;i<20;i++) {
			selectArr[i] = null;
		}

		switch(trackName) {
		case "�繰���ͳ�":
			selectP.removeAll();
			selectP.add(selectLbl);
			
			n = stdTrackInfo.selectTSubject(3).size();
			subName = stdTrackInfo.selectTSubject(3);

			for (int i=0;i<n;i++) {
				selectArr[i] = subName.get(i).getSubjectName();
			}

			for(int i=0;i<n;i++) {

				JLabel lbl = new JLabel(selectArr[i]);
				lbl.setLayout(null);
				lbl.setBounds(50+((i/5)*500),60+((i)*60)%300,400,50);
				selectP.add(lbl);
			}
			repaint();
			break;
		case "��Ƽ�̵��":
			selectP.removeAll();
			selectP.add(selectLbl);
			n = stdTrackInfo.selectTSubject(2).size();
			subName = stdTrackInfo.selectTSubject(2);
			for (int i=0;i<n;i++) {
				selectArr[i] = subName.get(i).getSubjectName();
			}

			for(int i=0;i<n;i++) {

				JLabel lbl = new JLabel(selectArr[i]);
				lbl.setLayout(null);
				lbl.setBounds(50+((i/5)*500),60+((i)*60)%300,400,50);
				selectP.add(lbl);
			}
			repaint();
			break;
		case "�ý�������":
			selectP.removeAll();
			selectP.add(selectLbl);
			n = stdTrackInfo.selectTSubject(4).size();
			subName = stdTrackInfo.selectTSubject(4);
			for (int i=0;i<n;i++) {
				selectArr[i] = subName.get(i).getSubjectName();
			}

			for(int i=0;i<n;i++) {

				JLabel lbl = new JLabel(selectArr[i]);
				lbl.setLayout(null);
				lbl.setBounds(50+((i/5)*500),60+((i)*60)%300,400,50);
				selectP.add(lbl);
			}
			repaint();
			break;
		case "�ΰ�����":
			selectP.removeAll();
			selectP.add(selectLbl);
			
			n = stdTrackInfo.selectTSubject(5).size();
			subName = stdTrackInfo.selectTSubject(5);
			for (int i=0;i<n;i++) {
				selectArr[i] = subName.get(i).getSubjectName();
			}

			for(int i=0;i<n;i++) {

				JLabel lbl = new JLabel(selectArr[i]);
				lbl.setLayout(null);
				lbl.setBounds(50+((i/5)*500),60+((i)*60)%300,400,50);
				selectP.add(lbl);
			}
			repaint();
			break;
		case "��������":
			selectP.removeAll();
			selectP.add(selectLbl);
			n = stdTrackInfo.selectTSubject(6).size();
			subName = stdTrackInfo.selectTSubject(6);
			for (int i=0;i<n;i++) {
				selectArr[i] = subName.get(i).getSubjectName();
			}

			for(int i=0;i<n;i++) {

				JLabel lbl = new JLabel(selectArr[i]);
				lbl.setLayout(null);
				lbl.setBounds(50+((i/5)*500),60+((i)*60)%300,400,50);
				selectP.add(lbl);
			}
			repaint();
			break;
		}      

	}


}