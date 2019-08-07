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

public class StuInfoDAO {
   //싱글톤 클래스로 만들기 위해서 생성자를 private로 선언
   private StuInfoDAO() {}
   //하나의 객체를 주소로 저장할 변수 선언
   private static StuInfoDAO obj;
   //선언한 static변수에 객체를 생성해주는 메서드 선언
   public static StuInfoDAO getInstance() {
      if(obj==null) {
         obj=new StuInfoDAO();
      }
      return obj;
   }
   
   private Connection conn = DatabaseConnect.getConnection();
   
   public ArrayList<StudentVO> selectInfo(int studentID){
      String sql = "select studentName,major,semester from Student where studentID = "+studentID;

      
      PreparedStatement pstmt = null;
      
      ArrayList<StudentVO> arrStudentVO = new ArrayList<StudentVO>();
      
      try {
         pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         
         while(rs.next()) {
            StudentVO tempStudentVO = new StudentVO(rs.getString("studentName"),
                  rs.getString("major"),
                  rs.getInt("semester"));
            arrStudentVO.add(tempStudentVO);
         }
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
      
      return arrStudentVO;
   }//선택 트랙 번호 반환하는 쿼리 selectTrack, studentName
   
   
   
   
   
}