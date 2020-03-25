package com.naver.repository;

import java.util.List;

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;

public interface BoardDAO {
	public abstract List<BoardVO> list();
	public abstract void insert(BoardVO vo);
	public abstract void updateReadcnt(int bno);
	public abstract BoardVO read(int bno);
	public abstract BoardVO updateui(int bno);
	public abstract void update(BoardVO vo);
	public abstract int getAmount();
	public abstract List<BoardVO> getListpage(PageTO to);
	public abstract void delete(int bno);
	public abstract void addAttach(String filename, int bno);
	public abstract List<String> getAttach(int bno);
	public abstract void deletefile(int bno, String filename);
	public abstract void deleteAllFile(int bno);
	void updatereproot(int bno);
	public abstract void insertrep(BoardVO vo);

	public abstract void updaterep(int reproot, int repstep);
	/* public abstract void updaterep(int bno); */


}
