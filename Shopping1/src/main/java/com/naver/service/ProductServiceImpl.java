package com.naver.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.naver.dto.ProductDTO;
import com.naver.repository.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{

	@Inject
	private ProductDAO pdao;

	@Override
	public void insert(ProductDTO pdto) {
		pdao.insert(pdto);
	}
}
