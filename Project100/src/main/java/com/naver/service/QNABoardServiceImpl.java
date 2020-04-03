package com.naver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naver.dto.QNABoardVO;
import com.naver.dto.PageTO;
import com.naver.repository.QNABoardDAO;
import com.naver.repository.ReplyDAO;

@Service
@Transactional
public class QNABoardServiceImpl implements QNABoardService{
	
	@Inject 
	private QNABoardDAO bdao;
	
	@Autowired
	private ReplyDAO rdao;
	
	
	@Override
	public List<QNABoardVO> list() {
		return bdao.list();
	}


	@Override
	public void insert(QNABoardVO vo) {
		bdao.insert(vo);
		String[] arr=vo.getFilename();
		if(arr!=null) {
			for(String filename : arr) {
				bdao.addAttach(filename, vo.getBno());
			}
		}
		bdao.updatereproot(vo.getBno());
	
	}


	@Override
	public QNABoardVO read(int bno) {
		bdao.updateReadcnt(bno);
		QNABoardVO vo=bdao.read(bno);
		
		List<String> list = bdao.getAttach(bno);
		String[] filename=list.toArray(new String[list.size()]);
		vo.setFilename(filename);
		return vo;
	}


	@Override
	public QNABoardVO updateui(int bno) {
		QNABoardVO vo= bdao.updateui(bno);
		List<String> qlist = bdao.getAttach(bno);
		String[] filename=qlist.toArray(new String[qlist.size()]);
		vo.setFilename(filename);
		 
		return vo; 
	}


	@Override
	public void update(QNABoardVO vo) {
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
		List<QNABoardVO> qlist=bdao.getListpage(to);
		to.setQlist(qlist);
		return to;
	}


	@Override
	public void delete(int bno) {
		rdao.deleteByBno(bno);
		bdao.deleteAllFile(bno);
		bdao.delete(bno);
		
	}


	@Override
	public void deletefile(int bno, String filename) {
		bdao.deletefile(bno, filename);
		
	}


	@Override
	public void rep(QNABoardVO vo) {
		bdao.updaterep(vo.getReproot(), vo.getRepstep());
		bdao.insertrep(vo);

	}


	@Override
	public QNABoardVO repui(int bno) {
		QNABoardVO vo= bdao.read(bno);
		return vo;
	}




}
