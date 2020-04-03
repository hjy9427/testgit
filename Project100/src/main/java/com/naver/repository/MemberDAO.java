package com.naver.repository;

import java.util.List;

import com.naver.dto.MemberDTO;

public interface MemberDAO {

	void insert(MemberDTO dto);

	MemberDTO checkid(String id);

	MemberDTO searchid(String name, int age);

	

	
	public abstract List<MemberDTO> list();



	public abstract MemberDTO read(String id);

	public abstract MemberDTO updateui(String id);

	public abstract void update(MemberDTO dto);

	public abstract void delete(String id);

	MemberDTO searchpw(String id, String name, int age);

	void setpw(String id, String pw);
}
