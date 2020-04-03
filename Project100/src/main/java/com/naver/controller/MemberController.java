package com.naver.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.naver.dto.MemberDTO;
import com.naver.service.MemberService;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping("member")
public class MemberController {
	@Inject
	private MemberService mservice;
	
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	private void insertui() {
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	private String insert(MemberDTO dto) {
		mservice.insert(dto);
		return "redirect:/board/listpage";
	}

	
	
	@RequestMapping(value = "checkid", method = RequestMethod.GET)
	@ResponseBody
	private String checkid(String id) {
		MemberDTO mdto=mservice.checkid(id);
		String strch=null; 
		if(mdto!=null) { 
			strch= "0"; 
		} else { 
			strch= "1"; 
			}
		
		
		return strch;
	}
	

	@RequestMapping(value = "searchid", method = RequestMethod.GET) 
	private void searchidui() {

	}
	
	@RequestMapping(value = "searchida", method = RequestMethod.GET)
	@ResponseBody
	private String searchid(String name, int age) {
		MemberDTO mdto=mservice.searchid(name, age);
		String id=null;
		if(mdto==null) {
			id="a";
		}else {
			id=mdto.getId();
		}
		return id;
	}
	
	@RequestMapping(value = "searchpw", method=RequestMethod.GET)
	private void searchpwui() {
		
	}
	
	@RequestMapping(value = "searchpwa", method=RequestMethod.GET)
	private void searchpwui(String id, String name, int age, Model model) {
		MemberDTO mdto = mservice.searchpw(id, name, age);
		model.addAttribute("mdto", mdto);
	}
	@RequestMapping(value = "searchpwa", method=RequestMethod.POST)
	private String setpw(String id, String pw) {
		mservice.setpw(id, pw);
		return "redirect:/member/list";
	}
	
	
	@RequestMapping("list")
	public String list(Model model) {
		List<MemberDTO> list = mservice.list();
		model.addAttribute("list", list);
		return "member/list";
	}	
		

	@RequestMapping(value="read")
	public void read(String id, Model model) {
		MemberDTO dto= mservice.read(id);
		model.addAttribute("dto", dto);
		
	}
	@RequestMapping(value = "update/{id}")
	public String updateui(@PathVariable("id") String id, Model model) {
		MemberDTO dto=mservice.updateui(id);
		model.addAttribute("dto", dto);
		return "member/update";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(MemberDTO dto) {
		mservice.update(dto);
		return "redirect:/member/list";
	}
		
	@RequestMapping(value = "delete/{id}")
	public String delete(@PathVariable("id") String id, Model model) {
		mservice.delete(id);
		model.addAttribute("test", "test");
		return "redirect:/member/list";
	}
	
}
