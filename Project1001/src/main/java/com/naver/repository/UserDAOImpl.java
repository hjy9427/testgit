package com.naver.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naver.dto.LoginTO;
import com.naver.dto.MemberDTO;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SqlSession session;
	
	private final String NS="com.naver.user";
	


	@Override
	public LoginTO login(MemberDTO to) {
		// TODO Auto-generated method stub
		return session.selectOne(NS+".login", to);
	}

}
