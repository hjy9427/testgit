package kr.co.ca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankDAO {
	private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "ca";
	private final String PASSWORD = "ca";
	//대소문자 중요
	
	
	public BankDAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void transfer(String from, String to, int howmuch) {
		//하우머치는 얼마 보낼지
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql1 = "update bank set balance = balance-? where id = ?";
		//원래 잔액에서 빼주고 다시 그 잔액으로 보내줌
		String sql2 = "update bank set balance = balance+? where id = ?";
		
		boolean all = false;
		
		try {
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			conn.setAutoCommit(false);
			//transaction구현하려면 오토커밋풀어줭함
			
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, from);
			pstmt.executeUpdate();
			
			pstmt.close();//이거 없으면 콘쩜프리페어드스테이트먼트에스큐일2에서 경고뜸
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, to);
			pstmt.executeUpdate();
			
			all = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(all) {
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//이프 엘스 쓴 다음에 트라이 캐치
			
			
			
			
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
}
