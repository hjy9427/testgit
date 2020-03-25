package com.naver.service;

import java.util.List;

import com.naver.dto.NoticeBoardVO;
import com.naver.dto.PageTO;

public interface NoticeBoardService {
	public abstract void insert(NoticeBoardVO vo);
	public abstract NoticeBoardVO read(int bno);
	public abstract List<NoticeBoardVO> list();
	public abstract PageTO listpage(PageTO to);
	public abstract NoticeBoardVO updateui(int bno);
	public abstract void update(NoticeBoardVO vo);
	public abstract void deletefile(int bno, String filename);
	public abstract void delete(int bno);
}
