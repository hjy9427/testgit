package com.naver.service;

import java.util.List;

import com.naver.dto.QNABoardVO;
import com.naver.dto.PageTO;

public interface QNAtypelistpageService {

	PageTO listpage(PageTO to);

	List<QNABoardVO> qlist(String qnatype);

	PageTO nlistpage(PageTO pto, String qnatype);

}
