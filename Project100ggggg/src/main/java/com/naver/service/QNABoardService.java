package com.naver.service;

import java.util.List;

import com.naver.dto.QNABoardVO;
import com.naver.dto.PageTO;

public interface QNABoardService {
	public abstract List<QNABoardVO> list();
	public abstract void insert(QNABoardVO vo);
	public abstract QNABoardVO read(int bno);
	public abstract QNABoardVO updateui(int bno);
	public abstract void update(QNABoardVO vo);
	public abstract PageTO listpage(PageTO to);
	public abstract void delete(int bno);
	public abstract void deletefile(int bno, String filename);
	public abstract void rep(QNABoardVO vo);
	public abstract QNABoardVO repui(int bno);

	
}
