package com.naver.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;

@Repository
public class QnatypelistpageDAOImpl implements QnatypelistpageDAO{
	
	@Inject
	private SqlSession session;
	
	private final String NS="com.naver.qnatypelistpage";
	@Override
	public int getAmount(String qnatype) {
		return session.selectOne(NS+".getAmount", qnatype);
	}




	@Override
	public List<BoardVO> ngetListpage(PageTO pto, String qnatype) {
		RowBounds rb=new RowBounds(pto.getStartNum()-1, pto.getPerPage());
		return session.selectList(NS+".ngetlistpage", qnatype, rb);

	}
	@Override
	public List<BoardVO> qlist(String qnatype){
		
		return session.selectList(NS+".nlist", qnatype);
	}





	@Override
	public List<BoardVO> getListpage(PageTO to) {
		RowBounds rb=new RowBounds(to.getStartNum()-1, to.getPerPage());
		return session.selectList(NS+".nlistpage", null, rb);
	}




	@Override
	public int getAmountAll() {
		return session.selectOne(NS+".getAmountAll");
	}




	@Override
	public List<BoardVO> ngetListpageAll(PageTO pto) {
		RowBounds rb=new RowBounds(pto.getStartNum()-1, pto.getPerPage());
		return session.selectList(NS+".ngetlistpageall", null, rb);
	}






	
}
