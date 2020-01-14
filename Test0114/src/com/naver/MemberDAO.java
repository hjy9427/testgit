package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
	private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "ca2";
	private static final String PASSWORD = "ca2";
	public MemberDAO() {
		try {
			Class.forName(DRIVER);
			System.out.println("a driver is loaded successfully");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public void insert2(MemberDTO dto) {
		Connection conn = null;
		Statement stmt = null;
		//java.sql
		
		String sql = "insert into member2 (id, name, age) values ('"+dto.getId()+"', '"+dto.getName()+"', '"+dto.getAge()+"')";
		//이거 복잡해서 프리페어드 스테이트머느 씀
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null){
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void insert(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into member2 values(?, ?, ?)";
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("connection is created");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());  
			pstmt.setString(2, dto.getName()); 
			pstmt.setInt(3, dto.getAge());
			pstmt.executeUpdate(); 

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}	
		}
	}
}
