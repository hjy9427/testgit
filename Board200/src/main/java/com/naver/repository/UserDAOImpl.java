package com.naver.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naver.dto.LoginTO;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SqlSession session;
	
	private final String NS="com.naver.user";
	
	@Override
	public LoginTO login(LoginTO to) {
		
		return session.selectOne(NS+".login", to);
	}

}
