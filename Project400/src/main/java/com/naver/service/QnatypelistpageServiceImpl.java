package com.naver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;
import com.naver.repository.QnatypelistpageDAO;

@Service
public class QnatypelistpageServiceImpl implements QnatypelistpageService{

	@Inject
	private QnatypelistpageDAO qdao;


	@Override
	public PageTO listpage(PageTO to) {
		
		/*
		 * int amount= qdao.getAmountAll(); pto.setAmount(amount);
		 */
		List<BoardVO> list=qdao.getListpage(to);
		to.setList(list);
		return to;
	}
	@Override
	public List<BoardVO> qlist(String qnatype) {
		return qdao.qlist(qnatype);
	}
	@Override
	public PageTO nlistpage(PageTO pto, String qnatype) {
		if(qnatype!=null) {
			int amount= qdao.getAmount(qnatype);
			pto.setAmount(amount);
			List<BoardVO> list=qdao.ngetListpage(pto, qnatype);
			pto.setList(list);
			return pto;
		}else {
			int amount= qdao.getAmountAll();
			pto.setAmount(amount);
			List<BoardVO> list=qdao.ngetListpageAll(pto);
			pto.setList(list);
			return pto;
		}
		
	}
}
