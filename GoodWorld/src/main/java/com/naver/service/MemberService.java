package com.naver.service;

import java.util.List;

import com.naver.dto.MemberDTO;

public interface MemberService {
	public abstract void getTime();
	public abstract List<MemberDTO> list();
}