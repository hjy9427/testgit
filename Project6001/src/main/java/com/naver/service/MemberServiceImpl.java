package com.naver.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.naver.dto.MemberDTO;
import com.naver.repository.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{

	
	@Inject
	private MemberDAO mdao;
	
	@Override
	public void insert(MemberDTO dto) {
		mdao.insert(dto);
	}

}
