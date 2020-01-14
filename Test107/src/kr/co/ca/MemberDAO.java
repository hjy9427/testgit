package kr.co.ca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO{

	// Real DB instead of private static arrayList
	private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "ca";
	private static final String PASSWORD = "ca";

	public MemberDAO() {
		//1.creating a driver btw java and DB using Class.forName
		try {
			Class.forName(DRIVER);
			System.out.println("a driver is loaded successfully");
		}
		catch (Exception e) {
			e.printStackTrace();
		};
	}

	public void insert(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into member2 values(?, ?, ?)";//dynamically instead of id, name, age
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("connection is created");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId()); // 1st ? 
			pstmt.setString(2, dto.getName()); // 2nd ?
			pstmt.setInt(3, dto.getAge());// 3rd ?

			pstmt.executeUpdate(); // sends pstmt to db

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

	// list all members of DB
	public ArrayList<MemberDTO> select() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from member2";
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				list.add(new MemberDTO(id, name, age));
			}

		} catch (Exception e) {
			e.printStackTrace();

		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if (pstmt!=null) {
					pstmt.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	public MemberDTO selectById(String id){
		MemberDTO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from member2 where id =?";
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				dto = new MemberDTO(id, name, age);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs!=null) {	rs.close();}
				if (pstmt!=null) {pstmt.close();}
				if (conn!=null) {conn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}

	public void update(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update member2 set name=?, age=?, where id=?";
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getId());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt!=null) {pstmt.close();}
				if (conn!=null) {conn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void delete(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql ="delete from member2 where id=?";
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt!=null) {pstmt.close();}
				if (conn!=null) {conn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	

}





