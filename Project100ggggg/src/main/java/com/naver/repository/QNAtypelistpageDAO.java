package com.naver.repository;

import java.util.List;

import com.naver.dto.QNABoardVO;
import com.naver.dto.PageTO;

public interface QNAtypelistpageDAO {

	int getAmount(String qnatype);

	List<QNABoardVO> getListpage(PageTO to);

	List<QNABoardVO> qlist(String qnatype);

	List<QNABoardVO> ngetListpage(PageTO pto, String qnatype);

	int getAmountAll();

	List<QNABoardVO> ngetListpageAll(PageTO pto);


}
