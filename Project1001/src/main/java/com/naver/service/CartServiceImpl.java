package com.naver.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.naver.repository.CartDAO;

@Service
public class CartServiceImpl implements CartService{
	
	@Inject
	private CartDAO cdao;
	
	
}
