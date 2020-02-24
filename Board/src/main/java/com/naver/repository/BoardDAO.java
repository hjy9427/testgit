package com.naver.repository;

import java.util.List;

import com.naver.dto.BoardVO;

public interface BoardDAO {
	public abstract List<BoardVO> list();
	public abstract void insert(BoardVO vo);
	public abstract void updateReadcnt(int bno);
	public abstract BoardVO read(int bno);
	public abstract BoardVO updateui(int bno);
	public abstract void update(BoardVO vo);
}
