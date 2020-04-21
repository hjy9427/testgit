package com.naver.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.naver.dto.PageTO;
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

	@Override
	public List<ProductDTO> list() {
		return session.selectList(NS+".list");
	}

	@Override
	public int getAmount() {
		// TODO Auto-generated method stub
		return session.selectOne(NS+".getAmount");
	}

	@Override
	public List<ProductDTO> getListpage(PageTO to) {
		RowBounds rb=new RowBounds(to.getStartNum()-1, to.getPerPage());
		
		return session.selectList(NS+".getListpage", null, rb);

	}

	@Override
	public void addAttach(String filename, int pno) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("filename", filename);
		map.put("pno", pno);
		session.insert(NS+".addAttach", map);
		
	}

	@Override
	public void deletefile(int pno, String filename) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("pno", pno);
		map.put("filename", filename);
		
		session.delete(NS+".deletefile", map);
		
	}

	@Override
	public void updateReadcnt(int pno) {
		session.update(NS+".updateReadcnt", pno);
		
	}

	@Override
	public ProductDTO read(int pno) {
		// TODO Auto-generated method stub
		return session.selectOne(NS+".read", pno);
	}

	@Override
	public List<String> getAttach(int pno) {
		// TODO Auto-generated method stub
		return session.selectList(NS+".getAttach", pno);
	}

	
	
}
