package com.ji.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ji.model.DatabaseConnect;
import com.ji.model.vo.StudentVO;
import com.ji.model.vo.CompleteVO;
import com.ji.model.vo.SelectTrackCntVO;
import com.ji.model.vo.RecomTrackCntVO;

public class AdminTrackDAO {
	//�̱��� Ŭ������ ����� ���ؼ� �����ڸ� private�� ����
	private AdminTrackDAO() {}
	//�ϳ��� ��ü�� �ּҷ� ������ ���� ����
	private static AdminTrackDAO obj;
	//������ static������ ��ü�� �������ִ� �޼��� ����
	public static AdminTrackDAO getInstance() {
		if(obj==null) {
			obj=new AdminTrackDAO();
		}
		return obj;
	}
	
	private Connection conn = DatabaseConnect.getConnection();
	
	public void insertSubject(String subjectNum,String subjectName){
		
		String sql = "insert into Subject values (?,?)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,subjectNum);
			pstmt.setString(2,subjectName);
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}//insert
	
public void updateSubject(String subjectNum,String subjectName){
		
		System.out.println("fkfkfk");
	
		String sql = "update Subject set subjectName="+subjectName+" where subjectNum="+subjectNum;
		
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			System.out.println(pstmt);
			
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}//update
	
public void deleteSubject(String subjectNum){
		
		String sql = "delete from Subject where subjectNum =?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,subjectNum);
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}//delete
	
	
	public void insertTrack(int trackKey,String subjectNum,int flag){
		
		String sql = "insert into TrackSubject values (?,?,?)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,trackKey);
			pstmt.setString(2,subjectNum);
			pstmt.setInt(3,flag);
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}//insert
	
	public void updateTrack(int trackKey,String subjectNum,int flag){
		
		String sql = "update trackSubject set subjectNum=?, flag=? where trackKey=?";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,trackKey);
			pstmt.setString(2,subjectNum);
			pstmt.setInt(3,flag);
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}//update
	
	public void deleteTrack(String subjectNum){
		
		String sql = "delete from TrackSubject where subjectNum =?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,subjectNum);
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}//delete

public void insertMTrack(int trackNum,String trackName){
		
		String sql = "insert into Track values (?,?)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,trackNum);
			pstmt.setString(2,trackName);
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}//insert
	
	public void updateMTrack(int trackNum,String trackName){
		
		String sql = "update Track set trackNum = ?,trackName = ?";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,trackNum);
			pstmt.setString(2,trackName);
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}//update
	
	public void deleteMTrack(int trackNum){
		
		String sql = "delete from track where trackNum =?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,trackNum);
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}//delete
	
	
}
