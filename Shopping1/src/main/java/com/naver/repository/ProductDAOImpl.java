package com.naver.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.naver.dto.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@Inject
	private SqlSession session;

	private String NS="com.naver.product";
			
	@Override
	public void insert(ProductDTO pdto) {
		session.insert(NS+".insert", pdto);
		
	}
	
	
}
