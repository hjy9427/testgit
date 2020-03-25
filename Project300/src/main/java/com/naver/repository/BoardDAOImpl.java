package com.naver.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession session;
	private final String NS="com.naver.board";
	//ns는 namespace
	
	@Override
	public List<BoardVO> list() {
		return session.selectList(NS+".list");
	}


	@Override
	public void insert(BoardVO vo) {
		session.insert(NS+".insert", vo);
	}


	@Override
	public void updateReadcnt(int bno) {
		session.update(NS+".updateReadcnt", bno);
	}


	@Override
	public BoardVO read(int bno) {
		return session.selectOne(NS+".read", bno);
	}


	@Override
	public BoardVO updateui(int bno) {
		return session.selectOne(NS+".updateui", bno);
	}


	@Override
	public void update(BoardVO vo) {
		session.update(NS+".update", vo);
	}


	@Override
	public int getAmount() {
		return session.selectOne(NS+".getAmount");
	}


	@Override
	public List<BoardVO> getListpage(PageTO to) {
		RowBounds rb=new RowBounds(to.getStartNum()-1, to.getPerPage());
		//시작점과 몇 개 가져올거냐
		//시작을 0부터 해야하니까 -1해줌
		return session.selectList(NS+".getListpage", null, rb);
	//getListpage대신에 list 해도 됨
		//물음표 없으니까 두번쨰건 널
	}


	@Override
	public void delete(int bno) {
		session.delete(NS+".delete", bno);
		
	}


	@Override
	public void addAttach(String filename, int bno) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("filename", filename);
		map.put("bno", bno);
		session.insert(NS+".addAttach", map);
		//맵 dto object 써도 됨 두개 넣어야하는데 한 칸만 있을 떄
		
	}


	@Override
	public List<String> getAttach(int bno) {
		
		return session.selectList(NS+".getAttach", bno);
	}


	@Override
	public void deletefile(int bno, String filename) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("bno", bno);
		map.put("filename", filename);
		
		session.delete(NS+".deletefile", map);
		
	}


	@Override
	public void deleteAllFile(int bno) {
		session.delete(NS+".deleteAllFile", bno);
		
	}
	@Override
	public void updatereproot(int bno) {
		session.update(NS+".updatereproot", bno);
	}
		

	
	/*
	 * @Override public void updatestep(int reproot, int repstep) { Map<String,
	 * Object> map=new HashMap<String, Object>(); map.put("reproot",reproot);
	 * map.put("repstep", repstep); session.update(NS+"updaterepstep", map); }
	 */

	/*
	 * @Override public void updaterep(int bno, int reproot, int repstep, int
	 * repindent) { if(repstep!=0 && repindent!=0) { Map<String, Integer> map= new
	 * HashMap<String, Integer>(); map.put("reproot", reproot); map.put("repstep",
	 * repstep); map.put("repindent", repindent); map.put("bno", bno);
	 * session.update(NS+"updaterepno", map); }else { Map<String, Integer> map=new
	 * HashMap<String, Integer>(); map.put("reproot", 1); map.put("bno", 2);
	 * session.update(NS+"updaterepnodef", map); }
	 * 
	 * }
	 */


	/*
	 * @Override public void updaterepstep(int orireproot, int orirepstep) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	public void insertrep(BoardVO vo) {
		session.insert(NS+".insertrep", vo);
		
	}
	public void updaterep(int reproot, int repstep) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("reproot", reproot);
		map.put("repstep", repstep);
		session.update(NS+".updaterep", map);
	}

	/*
	 * @Override public void updaterep(BoardVO vo) { BoardVO bvo= new BoardVO(0, 0,
	 * null, null, null, null, null, null, 0, null, vo.getReproot(),
	 * vo.getRepstep(), 0); session.update(NS+"updaterepstep", bvo);
	 * 
	 * }
	 */


	/*
	 * @Override public void updaterep(int bno) {
	 * 
	 * session.update(NS+"updaterepstep",bno); }
	 */



}
