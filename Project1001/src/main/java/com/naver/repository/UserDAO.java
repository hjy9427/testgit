package com.naver.repository;

import com.naver.dto.LoginTO;
import com.naver.dto.MemberDTO;

public interface UserDAO {
	public LoginTO login(MemberDTO to);
}
