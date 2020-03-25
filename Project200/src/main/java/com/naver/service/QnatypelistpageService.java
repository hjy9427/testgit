package com.naver.service;

import java.util.List;

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;

public interface QnatypelistpageService {

	PageTO listpage(PageTO to);

	List<BoardVO> qlist(String qnatype);

	PageTO nlistpage(PageTO pto, String qnatype);

}
