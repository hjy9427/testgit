package com.naver.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.dto.MemberDTO;
import com.naver.service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {

	@Inject
	private MemberService mservice;
	
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public void insertui() {	
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert(MemberDTO dto) {
		mservice.insert(dto);
		return "redirect:/board/listpage";	
	}
}
