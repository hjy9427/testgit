package com.naver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.naver.dto.QNABoardVO;
import com.naver.dto.PageTO;
import com.naver.repository.QNAtypelistpageDAO;

@Service
public class QNAtypelistpageServiceImpl implements QNAtypelistpageService{

	@Inject
	private QNAtypelistpageDAO qdao;


	@Override
	public PageTO listpage(PageTO to) {
		
		/*
		 * int amount= qdao.getAmountAll(); pto.setAmount(amount);
		 */
		List<QNABoardVO> qlist=qdao.getListpage(to);
		to.setQlist(qlist);
		return to;
	}
	@Override
	public List<QNABoardVO> qlist(String qnatype) {
		return qdao.qlist(qnatype);
	}
	@Override
	public PageTO nlistpage(PageTO pto, String qnatype) {
		if(qnatype!=null) {
			int amount= qdao.getAmount(qnatype);
			pto.setAmount(amount);
			List<QNABoardVO> qlist=qdao.ngetListpage(pto, qnatype);
			pto.setQlist(qlist);
			return pto;
		}else {
			int amount= qdao.getAmountAll();
			pto.setAmount(amount);
			List<QNABoardVO> qlist=qdao.ngetListpageAll(pto);
			pto.setQlist(qlist);
			return pto;
		}
		
	}
}
