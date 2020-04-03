package com.naver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.naver.dto.MemberDTO;
import com.naver.repository.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	private MemberDAO mdao;
	
	@Override
	public void insert(MemberDTO dto) {
		mdao.insert(dto);
		
	}

	@Override
	public MemberDTO checkid(String id) {
		MemberDTO mdto=mdao.checkid(id);
		return mdto;
		
	}

	@Override
	public MemberDTO searchid(String name, int age) {
		MemberDTO mdto =mdao.searchid(name, age);
		return mdto;
	}
	
	@Override
	public List<MemberDTO> list() {
		// TODO Auto-generated method stub
		return mdao.list();
	}

	@Override
	public MemberDTO read(String id) {
		// TODO Auto-generated method stub
		return mdao.read(id);
	}


	@Override
	public MemberDTO updateui(String id) {
		// TODO Auto-generated method stub
		return mdao.updateui(id);
	}

	@Override
	public void update(MemberDTO dto) {
		// TODO Auto-generated method stub
		mdao.update(dto);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		mdao.delete(id);
	}

	@Override
	public MemberDTO searchpw(String id, String name, int age) {
		MemberDTO mdto=mdao.searchpw(id, name, age);
		return mdto;
	}

	@Override
	public void setpw(String id, String pw) {
		mdao.setpw(id, pw);
		
	}

	

}
