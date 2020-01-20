package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class MemberDAO {
	private DataSource dataFactory;
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			dataFactory = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle11g");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}}
	
	private void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		
		try {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


	public List<MemberDTO> list() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from member2";
		ResultSet rs = null;
		
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString("name");
				int age = rs.getInt(3);//숫자 넣어줘도 됨
				//컬럼 순서 알고 있으니까
				
				list.add(new MemberDTO(id, name, age));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}
		return list;
	}

	public MemberDTO login(String id, int age) {
		MemberDTO login = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from member2 where id =? and age = ?";
		ResultSet rs = null;
		
		try {
			conn = dataFactory.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setInt(2, age);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString("name");
				login = new MemberDTO(id, name, age);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			closeAll(rs, pstmt, conn);
		}
		return login;
	}

}
