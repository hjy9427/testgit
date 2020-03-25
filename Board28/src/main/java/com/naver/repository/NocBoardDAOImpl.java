package com.naver.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.naver.dto.NocBoardVO;

public class NocBoardDAOImpl implements NocBoardDAO{
	
	@Inject
	private SqlSession session;
	
	private final String NS="com.naver.noc_board";
	
	@Override
	public void insert(NocBoardVO nvo) {
		session.insert(NS+".insert", nvo);
		
	}

}
