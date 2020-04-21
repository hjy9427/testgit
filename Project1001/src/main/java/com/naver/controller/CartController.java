package com.naver.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naver.service.CartService;

@Controller
@RequestMapping("cart")
public class CartController {
	
	@Inject
	private CartService cservice;
	
	
}
