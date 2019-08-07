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
import com.ji.model.vo.TrackVO;
import com.ji.model.vo.SubjectVO;
import com.ji.model.vo.TrackSubjectVO;

public class StdTrackInfoDAO {
   //싱글톤 클래스로 만들기 위해서 생성자를 private로 선언
   private StdTrackInfoDAO() {}
   //하나의 객체를 주소로 저장할 변수 선언
   private static StdTrackInfoDAO obj;
   //선언한 static변수에 객체를 생성해주는 메서드 선언
   public static StdTrackInfoDAO getInstance() {
      if(obj==null) {
         obj=new StdTrackInfoDAO();
      }
      return obj;
   }
   
   private Connection conn = DatabaseConnect.getConnection();
   

   public ArrayList<SubjectVO> selectFSubject(int trackKey){

      String sql = "select subjectNum,subjectName from Subject where subjectNum in (select subjectNum from TrackSubject where trackKey ="+trackKey+" and flag = 1)";

      //String sql = "insert into customer values (?,?,?,?,?,?,?)";
      
      PreparedStatement pstmt = null;
      
      ArrayList<SubjectVO> arrSubjectVO = new ArrayList<SubjectVO>();
      
      try {
         pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         
         while(rs.next()) {
            SubjectVO tempSubjectVO = new SubjectVO(rs.getString("subjectNum"),
                  rs.getString("subjectName"));
            arrSubjectVO.add(tempSubjectVO);
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
      
      return arrSubjectVO;
   }

   
   public ArrayList<SubjectVO> selectTSubject(int trackKey){

      String sql = "select subjectNum,subjectName from Subject where subjectNum in (select subjectNum from TrackSubject where trackKey ="+trackKey+" and flag = 0)";

      //String sql = "insert into customer values (?,?,?,?,?,?,?)";
      
      PreparedStatement pstmt = null;
      
      ArrayList<SubjectVO> arrSubjectVO = new ArrayList<SubjectVO>();
      
      try {
         pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         
         while(rs.next()) {
            SubjectVO tempSubjectVO = new SubjectVO(rs.getString("subjectNum"),
                  rs.getString("subjectName"));
            arrSubjectVO.add(tempSubjectVO);
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
      
      return arrSubjectVO;
   }
   
   
   public ArrayList<SubjectVO> selectAllSubject(int trackKey){

      String sql = "select subjectNum,subjectName from Subject where subjectNum in (select subjectNum from TrackSubject where trackKey ="+trackKey+")";

      //String sql = "insert into customer values (?,?,?,?,?,?,?)";
      
      PreparedStatement pstmt = null;
      
      ArrayList<SubjectVO> arrSubjectVO = new ArrayList<SubjectVO>();
      
      try {
         pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         
         while(rs.next()) {
            SubjectVO tempSubjectVO = new SubjectVO(rs.getString("subjectNum"),
                  rs.getString("subjectName"));
            arrSubjectVO.add(tempSubjectVO);
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
      
      return arrSubjectVO;
   }
   
   public ArrayList<TrackSubjectVO> selectTrackSubject(int trackKey){

      String sql = "select * from TrackSubject where trackKey = "+trackKey+")";

      //String sql = "insert into customer values (?,?,?,?,?,?,?)";
      
      PreparedStatement pstmt = null;
      
      ArrayList<TrackSubjectVO> arrTrackSubjectVO = new ArrayList<TrackSubjectVO>();
      
      try {
         pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         
         while(rs.next()) {
            TrackSubjectVO tempTrackSubjectVO = new TrackSubjectVO(rs.getInt("trackKey"),
                  rs.getString("subjectNum"),rs.getInt("flag"));
            arrTrackSubjectVO.add(tempTrackSubjectVO);
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
      
      return arrTrackSubjectVO;
   }
   
   public ArrayList<SubjectVO> selectSubjectNum(String subjectName){
      String sql = "select subjectNum,subjectName from Subject where subjectName='"+subjectName+"'";

      //String sql = "insert into customer values (?,?,?,?,?,?,?)";
      
      PreparedStatement pstmt = null;
      
      ArrayList<SubjectVO> arrSubjectVO = new ArrayList<SubjectVO>();
      
      try {
         pstmt = conn.prepareStatement(sql);
         System.out.println(pstmt);
         ResultSet rs = pstmt.executeQuery();
         
         while(rs.next()) {
            SubjectVO tempSubjectVO = new SubjectVO(rs.getString("subjectNum"),
                  rs.getString("subjectName"));
            arrSubjectVO.add(tempSubjectVO);
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
      
      return arrSubjectVO;
   }
   
   
   public ArrayList<SubjectVO> selectSubject(){
      String sql = "select * from Subject";

      //String sql = "insert into customer values (?,?,?,?,?,?,?)";
      
      PreparedStatement pstmt = null;
      
      ArrayList<SubjectVO> arrSubjectVO = new ArrayList<SubjectVO>();
      
      try {
         pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         
         while(rs.next()) {
            SubjectVO tempSubjectVO = new SubjectVO(rs.getString("subjectNum"),
                  rs.getString("subjectName"));
            arrSubjectVO.add(tempSubjectVO);
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
      
      return arrSubjectVO;
   }
   
   public ArrayList<StudentVO> selectTrack(int studentID){
      String sql = "select studentName,selectTrack from Student where studentID = ?";

      //String sql = "insert into customer values (?,?,?,?,?,?,?)";
      
      PreparedStatement pstmt = null;
      
      ArrayList<StudentVO> arrStudentVO = new ArrayList<StudentVO>();
      
      try {
         pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         
         while(rs.next()) {
            StudentVO tempStudentVO = new StudentVO(rs.getInt("studentId"),
                  rs.getString("studentName"),
                  rs.getString("major"),
                  rs.getString("college"),
                  rs.getInt("grade"),
                  rs.getInt("semester"),
                  rs.getInt("selectTrack"));
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
   
   
   public ArrayList<CompleteVO> selectSubject(int studentID){
      String sql = "select subjectNum from Complete where studentID = ?";
      
      PreparedStatement pstmt = null;
      ArrayList<CompleteVO> arrCompleteVO = new ArrayList<CompleteVO>();
      
      try {
         pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         
         while(rs.next()) {
            CompleteVO tempCompleteVO = new CompleteVO(rs.getInt("studentId"),
                  rs.getString("subjectNum"));
            arrCompleteVO.add(tempCompleteVO);
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
      
      return arrCompleteVO;
   }//들은 과목 보여주는 쿼리
   
   public ArrayList<SelectTrackCntVO> selectTrackCount(){
      String sql = "select selectTrack,count(*) from Student group by selectTrack order by selectTrack";
      //String sql = "insert into customer values (?,?,?,?,?,?,?)";
      
      PreparedStatement pstmt = null;
      ArrayList<SelectTrackCntVO> arrSelectTrackCntVO = new ArrayList<SelectTrackCntVO>();
      
      try {
         pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         
         while(rs.next()) {
            SelectTrackCntVO tempSelectTrackCntVO = new SelectTrackCntVO(rs.getInt("selectTrack"),
                  rs.getInt("count(*)"));
            arrSelectTrackCntVO.add(tempSelectTrackCntVO);
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
      
      return arrSelectTrackCntVO;
   }//선택 과목별 카운트 반환
   
   
   public ArrayList<RecomTrackCntVO> recomTrackCount(int studentId){
      String sql = "select trackKey,count(*) from TrackSubject where subjectNum in (select subjectNum from Complete where studentID = "+studentId+") group by trackKey order by count(*) desc";

      //String sql = "insert into customer values (?,?,?,?,?,?,?)";
      
      PreparedStatement pstmt = null;
      ArrayList<RecomTrackCntVO> arrRecomTrackCnt = new ArrayList<RecomTrackCntVO>();
      
      try {
         pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         
         while(rs.next()) {
            RecomTrackCntVO tempRecomTrackCnt = new RecomTrackCntVO(rs.getInt("trackKey"),
                  rs.getInt("count(*)"));
            arrRecomTrackCnt.add(tempRecomTrackCnt);
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
      
      return arrRecomTrackCnt;
   }//추천 과목별 카운트 반환
   
   
      public ArrayList<RecomTrackCntVO> recomTrackCount_2ness(int studentId,int key){
            String sql = "select count(*) from TrackSubject, Complete where TrackSubject.subjectNum=Complete.subjectNum and TrackSubject.trackKey = "+key+" and Complete.studentId = "+studentId+" and TrackSubject.flag=1";
            
            PreparedStatement pstmt = null;
            ArrayList<RecomTrackCntVO> arrRecomTrackCnt = new ArrayList<RecomTrackCntVO>();
            
            try {
               pstmt = conn.prepareStatement(sql);
               ResultSet rs = pstmt.executeQuery();
               
               while(rs.next()) {
                  RecomTrackCntVO tempRecomTrackCnt = new RecomTrackCntVO(rs.getInt("count(*)"));
                  arrRecomTrackCnt.add(tempRecomTrackCnt);
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
            
            return arrRecomTrackCnt;
         }//학생 한명에게 트랙별 필수과목 이수갯수 반환

         
         
         
         public ArrayList<RecomTrackCntVO> recomTrackCount_2opt(int studentId,int key){
            String sql = "select count(*) from TrackSubject, Complete where TrackSubject.subjectNum=Complete.subjectNum and TrackSubject.trackKey = "+key+" and Complete.studentId = "+studentId+" and TrackSubject.flag=0";
            
            PreparedStatement pstmt = null;
            ArrayList<RecomTrackCntVO> arrRecomTrackCnt = new ArrayList<RecomTrackCntVO>();
            
            try {
               pstmt = conn.prepareStatement(sql);
               ResultSet rs = pstmt.executeQuery();
               
               while(rs.next()) {
                  RecomTrackCntVO tempRecomTrackCnt = new RecomTrackCntVO(rs.getInt("count(*)"));
                  arrRecomTrackCnt.add(tempRecomTrackCnt);
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
            
            return arrRecomTrackCnt;
         }//학생 한명에게 트랙별 선택과목 이수갯수 반환
   
   
   
   
}