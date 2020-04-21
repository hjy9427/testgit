package com.naver.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.naver.dto.MemberDTO;

public class MemberDAOImpl implements MemberDAO{

	
	@Autowired
	private SqlSession session;
	
	private final String NS="com.naver.member";
	
	@Override
	public void insert(MemberDTO dto) {
		session.insert(NS+".insert", dto);
	}
	
	

}
