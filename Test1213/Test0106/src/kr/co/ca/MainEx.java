package kr.co.ca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹��ε� ����");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		String USER = "ca";
		String PASSWORD = "ca";
		//memberdao�� ����ƽ ����� ����
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conncetion ����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		}

}
