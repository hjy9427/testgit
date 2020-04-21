package com.naver.repository;

import java.util.List;

import com.naver.dto.PageTO;
import com.naver.dto.ProductDTO;

public interface ProductDAO {

	
	void insert(ProductDTO pdto);

	List<ProductDTO> list();

	int getAmount();

	List<ProductDTO> getListpage(PageTO to);

	void addAttach(String filename, int pno);

	void deletefile(int pno, String filename);

	void updateReadcnt(int pno);

	ProductDTO read(int pno);

	List<String> getAttach(int pno);

}
