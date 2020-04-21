package com.naver.service;

import java.util.List;

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;
import com.naver.dto.ProductDTO;

public interface ProductService {

	void insert(ProductDTO pdto);

	List<ProductDTO> list();

	PageTO listpage(PageTO to);

	void deletefile(int pno, String filename);

	ProductDTO read(int pno);


	
}
