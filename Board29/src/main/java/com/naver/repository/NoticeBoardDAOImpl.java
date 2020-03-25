package com.naver.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.naver.dto.NoticeBoardVO;
import com.naver.dto.PageTO;

@Repository
public class NoticeBoardDAOImpl implements NoticeBoardDAO{

	@Inject
	private SqlSession session;
	private final String NS="com.naver.board";
	
	@Override
	public void insert(NoticeBoardVO vo) {
		session.insert(NS+".insert", vo);
	}

	@Override
	public NoticeBoardVO read(int bno) {
		return session.selectOne(NS+".read", bno);
	}
	
	@Override
	public List<NoticeBoardVO> list() {
		return session.selectList(NS+".list");
	}

	@Override
	public List<NoticeBoardVO> getListpage(PageTO to) {
		RowBounds rb=new RowBounds(to.getStartNum()-1, to.getPerPage());
		return session.selectList(NS+".getListpage", null, rb);
	}
	
	@Override
	public NoticeBoardVO updateui(int bno) {
		return session.selectOne(NS+".updateui", bno);
	}

	@Override
	public void update(NoticeBoardVO vo) {
		session.update(NS+".update", vo);
	}

	@Override
	public void updateReadcnt(int bno) {
		session.update(NS+".updateReadcnt", bno);
	}

	@Override
	public void addAttach(String filename, int bno) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("filename", filename);
		map.put("bno", bno);
		session.insert(NS+".addAttach", map);
	}
	
	@Override
	public int getAmount() {
		return session.selectOne(NS+".getAmount");
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
	public void delete(int bno) {
		session.delete(NS+".delete", bno);
	}
}
