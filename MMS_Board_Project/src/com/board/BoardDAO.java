package com.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

public class BoardDAO {
private DataSource dataFactory;
	
	public BoardDAO() {
		try {
			Context ctx = new InitialContext();
			dataFactory = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle11g");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insert(BoardDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into board3 (num,author,title,content,repRoot,repStep,repIndent) values(?, ?, ?, ?, ?, 0, 0)";
		//writeday, readcnt는 제외
		
		try {
			conn = dataFactory.getConnection();
			int num = createNum(conn);
			
			pstmt = conn.prepareStatement(sql);
			
	         pstmt.setInt(1, num);
	         pstmt.setString(2, dto.getAuthor());
	         pstmt.setString(3, dto.getTitle());
	         pstmt.setString(4, dto.getContent());
	         pstmt.setInt(5, num);
	        // pstmt.setInt(6, 0); 이 부분은 항상 0이기 때문에 sql문에 그냥 0을 집어넣음
	        // pstmt.setInt(7, 0);
	         
	         pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(null, pstmt, conn);
		}
	}

	private int createNum(Connection conn) {	//글을 올릴때 글 번호를 하나씩 올려주는 메서드
		int num = 1;
		
		PreparedStatement pstmt = null;
		String sql = "select max(num) from board3"; //글이 하나도 없을 수도 있기 때문에 +1은 안해줌, +1은 나중에 넣어줌 
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				num = rs.getInt(1)+1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, null); //conn은 이 메서드에서 잠깐 빌려쓰고 원래 메서드에서 또 쓰기 때문에 닫으면안됨
		}
		
		
		return num;
	}
	
	public List<BoardDTO> list() {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select num, title, author, to_char(writeday, 'yyyy/mm/dd') writeday, readcnt, repRoot, repStep, repIndent, good, bad from board3 order by repRoot desc, repStep asc";
		ResultSet rs = null;
		
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt(1); //1번(num)
				String title = rs.getString(2); //2번(title)
				String author = rs.getString(3);
				String writeday = rs.getString(4);
				int readcnt = rs.getInt(5);
				int repRoot = rs.getInt(6);
				int repStep = rs.getInt(7);
				int repIndent = rs.getInt(8);
				int good=rs.getInt(9);
				int bad=rs.getInt(10);
				list.add(new BoardDTO(num, author, title, null, writeday, readcnt, repRoot, repStep, repIndent, good, bad));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}
		
		return list;
	}
	
	public BoardDTO read(int num) {
		BoardDTO dto = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from board3 where num=?";
		ResultSet rs = null;
		
		try {
			conn = dataFactory.getConnection();
			 //readcnt값을 여기서 +1하면 밑에서 에러가 발생했을때도 +1이 증가되어있음(트랜잭션을 사용해서 복구해야함)
			//내가 작업할 때는 여기서 readcnt +1해주기(그냥 여기서 안하고 밑에서 +1해주면 되지만 트랜잭션 연습 위해)
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writeday = rs.getString("writeday");	//rs.getDate해도 되고 rs.getString해도 된다 (DB에서는 Date타입으로 했고, DTO에서는 String으로 함)
				int readcnt = rs.getInt("readcnt"); //readcnt값을 여기서 +1하면 에러가 발생했을때는 +1이 안됨
				String author = rs.getString("author");
				int good=rs.getInt("good");
				int bad=rs.getInt("bad");
				dto = new BoardDTO(num, author, title, content, writeday, readcnt, 0, 0, 0, good, bad);
				
			}
			
			increaseReadcnt(num, conn);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}
		
		return dto;
	}

	private void increaseReadcnt(int num, Connection conn) {	//글을 읽었을 때 조회수를 올려주는 메서드
		PreparedStatement pstmt = null;
		String sql = "update board3 set readcnt = readcnt +1 where num =?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(null, pstmt, null);	//conn은 닫으면 안됨 read에서 또 써야함... 하지만 위의 read 코드에서는 이 메서드가 맨 밑에 사용되기 때문에 conn을 닫아도 무관
		}
	}

	
	public BoardDTO countGood(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		BoardDTO dto = null;
		String sql="select * from board3 where num=?";
		ResultSet rs=null;
		try {
			conn=dataFactory.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writeday = rs.getString("writeday");	//rs.getDate해도 되고 rs.getString해도 된다 (DB에서는 Date타입으로 했고, DTO에서는 String으로 함)
				int readcnt = rs.getInt("readcnt"); //readcnt값을 여기서 +1하면 에러가 발생했을때는 +1이 안됨
				String author = rs.getString("author");
				int good=rs.getInt("good")+1;
				int bad=rs.getInt("bad");
				int repRoot=rs.getInt("repRoot");
				int repStep=rs.getInt("repStep");
				int repIndent = rs.getInt("repIndent");

				dto = new BoardDTO(num, author, title, content, writeday, readcnt, repRoot, repStep, repIndent, good, bad);
			}
			countGoodOnlyOnePerId(num, conn);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}
		return dto;
	}
	
	public void countGoodOnlyOnePerId(int num, Connection conn) {
		PreparedStatement pstmt=null;
		BoardDTO dto = null;
		String sql="select member3.id, board3.good from member3, board3 where board3.num=?";
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			int board3Good=0;
			if(rs.next()) {	
				board3Good=rs.getInt("good");
			}
			if (board3Good==0) {
				increaseGood(num, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, null);
		}
		
	}
	
	
	
public void increaseGood(int num, Connection conn) {
		
		PreparedStatement pstmt=null;
		String sql="update board3 set good = good + 1 where num=?";
		try {	
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			countGoodOnlyOnePerId(num, conn);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(null, pstmt, null);
		}
	}
public BoardDTO countBad(int num) {
	Connection conn=null;
	PreparedStatement pstmt=null;
	BoardDTO dto = null;
	String sql="select * from board3 where num=?";
	ResultSet rs=null;
	try {
		conn=dataFactory.getConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		rs=pstmt.executeQuery();
		if(rs.next()) {
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writeday = rs.getString("writeday");	//rs.getDate해도 되고 rs.getString해도 된다 (DB에서는 Date타입으로 했고, DTO에서는 String으로 함)
			int readcnt = rs.getInt("readcnt"); //readcnt값을 여기서 +1하면 에러가 발생했을때는 +1이 안됨
			String author = rs.getString("author");
			int good=rs.getInt("good");
			int bad=rs.getInt("bad")+1;
			int repRoot=rs.getInt("repRoot");
			int repStep=rs.getInt("repStep");
			int repIndent = rs.getInt("repIndent");

			dto = new BoardDTO(num, author, title, content, writeday, readcnt, repRoot, repStep, repIndent, good, bad);

		}
		countBadOnlyOnePerId(num, conn);
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		closeAll(rs, pstmt, conn);
	}
	return dto;
}
public void increaseBad(int num, Connection conn) {
	
	PreparedStatement pstmt=null;
	String sql="update board3 set bad = bad + 1 where num=?";
	try {	
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		closeAll(null, pstmt, null);
	}
}
public void countBadOnlyOnePerId(int num, Connection conn) {
	PreparedStatement pstmt=null;
	BoardDTO dto = null;
	String sql="select member3.id, board3.bad from member3, board3 where board3.num=?";
	ResultSet rs=null;
	try {
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		rs=pstmt.executeQuery();
		int board3Bad=0;
		while(rs.next()) {
			String member3Id=rs.getString("id");
			board3Bad=rs.getInt("bad");
			if (board3Bad==0) {
				increaseBad(num, conn);
				
			}}
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		closeAll(rs, pstmt, null);
	}
	
}
	public void delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from board3 where num=?";
		
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(null, pstmt, conn);
		}
		
	}

	public BoardDTO updateui(int num) {
		BoardDTO dto = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from board3 where num=?";
		ResultSet rs = null;
		
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writeday = rs.getString("writeday");
				int readcnt = rs.getInt("readcnt");
				String author = rs.getString("author");
				
				//reply메서드에서 사용하기 위해서 추가
				int repRoot = rs.getInt("repRoot");
				int repStep = rs.getInt("repStep");
				int repIndent = rs.getInt("repIndent");
				
				dto = new BoardDTO(num, author, title, content, writeday, readcnt, repRoot, repStep, repIndent, 0, 0);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}
		
		return dto;
	}

	public void update(BoardDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update board3 set title=?, content=? where num=?"; //작성일을 바꾸고싶다면 set에 writeday=sysdate 추가
		
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getNum());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(null, pstmt, conn);
		}
		
	}

	public void reply(int orinum, String title, String content, String author) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into board3 (num, title, author, content, repRoot, repStep, repIndent) values(?, ?, ?, ?, ?, ?, ?)";
		
		boolean isOk = false; //트랜잭션에서 쓸 변수 선언
		
		try {
			conn = dataFactory.getConnection();
			
			//repStep 작업
			conn.setAutoCommit(false); //오토커밋은 트랜잭션이 진행이 안됨, 따라서 커밋을 수동으로 하도록 설정
			BoardDTO dto = updateui(orinum);
			increaseRepStep(conn, dto);
			
			//답글 작업
			int num = createNum(conn);	//num값 자동으로 박기 위해서
			pstmt = conn.prepareStatement(sql);	//insert 작업을 위한 객체 생성
			pstmt.setInt(1, num);
			pstmt.setString(2, title);
			pstmt.setString(3, author);
			pstmt.setString(4, content);
			pstmt.setInt(5, dto.getRepRoot());	//부모의 repRoot를 그대로 받기
			pstmt.setInt(6, dto.getRepStep()+1);	//답글이 생성된다면 부모의 repRoot값에 +1
			pstmt.setInt(7, dto.getRepIndent()+1);	//답글이 달리면 부모의 repIndent값에 +1
			
			pstmt.executeUpdate();
			
			isOk = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(isOk) {
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			closeAll(null, pstmt, conn);
		}
		
	}
	
	private void increaseRepStep(Connection conn, BoardDTO dto) {
		PreparedStatement pstmt = null;
		String sql= "update board3 set repStep = repStep +1 where repRoot = ? and repStep > ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getRepRoot());
			pstmt.setInt(2, dto.getRepStep());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(null, pstmt, null);
		}
		
	}

	public BPageTO list(int curPage) {
		BPageTO to = new BPageTO(curPage);
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from"
				+ "(select rownum rnum, num, title, author, to_char(writeday, 'yyyy/mm/dd') writeday, readcnt, repIndent, good, bad from"
				+ "(select * from board3 order by repRoot desc, repStep asc)) "
				+ "where rnum between ? and ?";
		ResultSet rs = null;
		
		try {
			conn = dataFactory.getConnection();
			
			int amount = getAmount(conn);
			to.setAmount(amount);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, to.getStartNum()); //첫번째 물음표 - startNum
			pstmt.setInt(2, to.getEndNum()); //두번째 물음표 - endNum
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String writeday = rs.getString("writeday");
				int readcnt = rs.getInt("readcnt");
				int repIndent = rs.getInt("repIndent");
				int good=rs.getInt("good");
				int bad=rs.getInt("bad");
				BoardDTO dto = new BoardDTO(num, author, title, null, writeday, readcnt, 0, 0, repIndent, good, bad);
				list.add(dto);
			}
			
			to.setList(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}
		
				
		return to;
	}
	public List<BoardDTO> listreadcnt() {
		
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from"
				+ "(select rownum rnum, num, title, author, to_char(writeday, 'yyyy/mm/dd') writeday, readcnt, repIndent, good, bad from"
				+ "(select * from board3 order by readcnt desc, repRoot desc, repStep asc))where rnum between -1 and 10";
		ResultSet rs = null;
		try {
			conn = dataFactory.getConnection();
			
			pstmt = conn.prepareStatement(sql);			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String writeday = rs.getString("writeday");
				int readcnt = rs.getInt("readcnt");
				int repIndent = rs.getInt("repIndent");
				int good=rs.getInt("good");
				int bad=rs.getInt("bad");
				BoardDTO dto = new BoardDTO(num, author, title, null, writeday, readcnt, 0, 0, repIndent, good, bad);
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}
		
				
		return list;
	}
	
	private int getAmount(Connection conn) {
		int amount = 0;
		
		PreparedStatement pstmt = null;
		String sql ="select count(num) from board3";
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				amount = rs.getInt(1); //amount = rs.getInt(count(num))
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, null);
		}
		
		return amount;
		
	}

	
	
	
	
}
