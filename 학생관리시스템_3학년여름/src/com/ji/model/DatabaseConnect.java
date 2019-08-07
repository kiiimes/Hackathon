package com.ji.model;

import java.sql.*;
import java.util.ArrayList;

import com.ji.model.vo.SelectTrackCntVO;

public class DatabaseConnect {
	
	private static final String USERNAME = "jihyun";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://203.250.148.53:3306/JH?useSSL=false&serverTimezone=UTC";
	
	//jdbc:DBMS:hostname:port:sid
	
	
	public static Connection dbConn;
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			System.out.println("DB Connection OK!");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("DB Driver Error!");
		}catch(SQLException se) {
			se.printStackTrace();
			
			System.out.println("DB Connection Error");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Unkonwn Error!");
		}
		return conn;
	}

	
}

