package com.naver.repository;

import java.util.List;

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;

public interface QnatypelistpageDAO {

	int getAmount(String qnatype);

	List<BoardVO> getListpage(PageTO to);

	List<BoardVO> qlist(String qnatype);

	List<BoardVO> ngetListpage(PageTO pto, String qnatype);

	int getAmountAll();

	List<BoardVO> ngetListpageAll(PageTO pto);


}
