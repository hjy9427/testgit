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
	//��ҹ��� �߿�
	
	
	public BankDAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void transfer(String from, String to, int howmuch) {
		//�Ͽ��ġ�� �� ������
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql1 = "update bank set balance = balance-? where id = ?";
		//���� �ܾ׿��� ���ְ� �ٽ� �� �ܾ����� ������
		String sql2 = "update bank set balance = balance+? where id = ?";
		
		boolean all = false;
		
		try {
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			conn.setAutoCommit(false);
			//transaction�����Ϸ��� ����Ŀ��Ǯ��a��
			
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, from);
			pstmt.executeUpdate();
			
			pstmt.close();//�̰� ������ �����������彺����Ʈ��Ʈ����ť��2���� ����
			
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
			}//���� ���� �� ������ Ʈ���� ĳġ
			
			
			
			
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
