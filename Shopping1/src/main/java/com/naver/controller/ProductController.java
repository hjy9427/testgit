package com.naver.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.dto.ProductDTO;
import com.naver.service.ProductService;

@Controller
@RequestMapping("pro")
public class ProductController {
	
	@Inject
	private ProductService pservice;
	
	@RequestMapping(value = "insert", method=RequestMethod.GET)
	public void insertui() {
	}

	@RequestMapping(value = "insert", method=RequestMethod.POST)
	public String insert(ProductDTO pdto) {
		pservice.insert(pdto);
		return "";
	}
	
}
