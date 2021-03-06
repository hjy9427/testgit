package com.naver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.dto.LoginTO;
import com.naver.dto.MemberDTO;
import com.naver.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService uservice;
	
	@RequestMapping(value = "loginPost", method = RequestMethod.POST)
	public void login(MemberDTO to, Model model) {
		LoginTO bto=uservice.login(to);
		model.addAttribute("login", bto);
	}
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void login() {
	}
}
