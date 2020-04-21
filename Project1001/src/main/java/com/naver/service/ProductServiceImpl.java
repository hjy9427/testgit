package com.naver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;
import com.naver.dto.ProductDTO;
import com.naver.repository.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{

	@Inject
	private ProductDAO pdao;
	
	@Override 
	public void insert(ProductDTO pdto) { 
		pdao.insert(pdto);
		String[] arr=pdto.getFilename();
		if(arr!=null) {
			for(String filename : arr) {
				pdao.addAttach(filename, pdto.getPno());
			}
		}
	}

	@Override
	public List<ProductDTO> list() {
		return pdao.list();
	}

	@Override
	public PageTO listpage(PageTO to) {
		to.setPerPage(15);
		int amount= pdao.getAmount();
		to.setAmount(amount);
		List<ProductDTO> plist=pdao.getListpage(to);
		to.setPlist(plist);
		return to;
	}

	@Override
	public void deletefile(int pno, String filename) {
		pdao.deletefile(pno, filename);
		
	}

	@Override
	public ProductDTO read(int pno) {
		pdao.updateReadcnt(pno);
		ProductDTO pdto=pdao.read(pno);
		List<String> list = pdao.getAttach(pno);
		String[] filename=list.toArray(new String[list.size()]);
		pdto.setFilename(filename);
		return pdto;
	}

}
