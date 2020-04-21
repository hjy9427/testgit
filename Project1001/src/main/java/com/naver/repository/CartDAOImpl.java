package com.naver.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAOImpl implements CartDAO{
	
	@Inject
	private SqlSession session;
	
	private String NS="com.naver.cart";
	
	
}
