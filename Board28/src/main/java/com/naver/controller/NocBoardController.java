package com.naver.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.dto.NocBoardVO;
import com.naver.service.NocBoardService;

@Controller
@RequestMapping("noc_board")
public class NocBoardController {
	
	@Inject
	private NocBoardService nbservice;
	
	@RequestMapping(value = "insert", method=RequestMethod.GET)
	public void insertui() {
		}
	
	@RequestMapping(value = "insert", method=RequestMethod.POST)
	public String insert(NocBoardVO nvo) {
		nbservice.insert(nvo);
		return "";			
		}
	
	
}
