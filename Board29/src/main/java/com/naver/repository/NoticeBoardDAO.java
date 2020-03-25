package com.naver.repository;

import java.util.List;

import com.naver.dto.NoticeBoardVO;
import com.naver.dto.PageTO;

public interface NoticeBoardDAO {
	public abstract void insert(NoticeBoardVO vo);
	public abstract NoticeBoardVO read(int bno);
	public abstract List<NoticeBoardVO> list();
	public abstract List<NoticeBoardVO> getListpage(PageTO to);
	public abstract NoticeBoardVO updateui(int bno);
	public abstract void update(NoticeBoardVO vo);
	public abstract void updateReadcnt(int bno);
	public abstract void addAttach(String filename, int bno);
	public abstract int getAmount();
	public abstract List<String> getAttach(int bno);
	public abstract void deletefile(int bno, String filename);
	public abstract void deleteAllFile(int bno);
	public abstract void delete(int bno);
}
