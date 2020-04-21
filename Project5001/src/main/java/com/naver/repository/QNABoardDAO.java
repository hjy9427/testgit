package com.naver.repository;

import java.util.List;

import com.naver.dto.QNABoardVO;
import com.naver.dto.PageTO;

public interface QNABoardDAO {
	public abstract List<QNABoardVO> list();
	public abstract void insert(QNABoardVO vo);
	public abstract void updateReadcnt(int bno);
	public abstract QNABoardVO read(int bno);
	public abstract QNABoardVO updateui(int bno);
	public abstract void update(QNABoardVO vo);
	public abstract int getAmount();
	public abstract List<QNABoardVO> getListpage(PageTO to);
	public abstract void delete(int bno);
	public abstract void addAttach(String filename, int bno);
	public abstract List<String> getAttach(int bno);
	public abstract void deletefile(int bno, String filename);
	public abstract void deleteAllFile(int bno);
	void updatereproot(int bno);
	public abstract void insertrep(QNABoardVO vo);

	public abstract void updaterep(int reproot, int repstep);
	/* public abstract void updaterep(int bno); */


}
