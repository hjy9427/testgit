package com.naver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;
import com.naver.repository.BoardDAO;
import com.naver.repository.ReplyDAO;

@Service
@Transactional
public class BoardServiceImpl implements BoardService{
	
	@Inject 
	private BoardDAO bdao;
	
	@Autowired
	private ReplyDAO rdao;
	
	
	@Override
	public List<BoardVO> list() {
		return bdao.list();
	}


	@Override
	public void insert(BoardVO vo) {
		System.out.println(vo.getBno());
		//System.out.println(vo.getTitle());
		bdao.insert(vo);
		System.out.println(vo.getBno());
		String[] arr=vo.getFilename();
		if(arr!=null) {
			for(String filename : arr) {
				bdao.addAttach(filename, vo.getBno());
			}
		}
		
		//순서지켜주기 bno가 널나옴 순서 안거치면
		//첫번쨰껄 거쳐야 bno가 생성됨
		//제목은 됨
	}


	@Override
	public BoardVO read(int bno) {
		bdao.updateReadcnt(bno);
		BoardVO vo=bdao.read(bno);
		
		List<String> list = bdao.getAttach(bno);
		String[] filename=list.toArray(new String[list.size()]);
		vo.setFilename(filename);
		return vo;
	}


	@Override
	public BoardVO updateui(int bno) {
		BoardVO vo= bdao.updateui(bno);
		List<String> list = bdao.getAttach(bno);
		String[] filename=list.toArray(new String[list.size()]);
		vo.setFilename(filename);
		 
		return vo; 
	}


	@Override
	public void update(BoardVO vo) {
		bdao.update(vo);
		
		bdao.deleteAllFile(vo.getBno());
		String[] arr=vo.getFilename();
		if(arr!=null) {
			for(String filename : arr) {
				bdao.addAttach(filename, vo.getBno());
			}
		}
	}


	@Override
	public PageTO listpage(PageTO to) {
		int amount= bdao.getAmount();
		to.setAmount(amount);
		List<BoardVO> list=bdao.getListpage(to);
		to.setList(list);
		return to;
	}


	@Override
	public void delete(int bno) {
		rdao.deleteByBno(bno);
		bdao.delete(bno);
	}


	@Override
	public void deletefile(int bno, String filename) {
		bdao.deletefile(bno, filename);
		
	}

}
