package com.naver.service;

import com.naver.dto.LoginTO;
import com.naver.dto.MemberDTO;

public interface UserService {
	LoginTO login(MemberDTO to);
}
