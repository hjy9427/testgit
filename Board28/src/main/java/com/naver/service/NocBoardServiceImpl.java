package com.naver.service;

import javax.inject.Inject;

import com.naver.dto.NocBoardVO;
import com.naver.repository.NocBoardDAO;

public class NocBoardServiceImpl implements NocBoardService{

	@Inject
	private NocBoardDAO nbdao;
	
	@Override
	public void insert(NocBoardVO nvo) {
		nbdao.insert(nvo);
	}

}
