package com.naver.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.dto.QNABoardVO;
import com.naver.dto.PageTO;
import com.naver.service.QNAtypelistpageService;
@Controller
@RequestMapping("qnatypelistpage")
public class QNAtypeListpageController {
	
	@Inject
	private QNAtypelistpageService qservice;
	
	@RequestMapping(value = "listpage", method = RequestMethod.GET)
	public void nlistpage(PageTO pto, String qnatype, Model model) {
		pto= qservice.nlistpage(pto, qnatype);
		model.addAttribute("pto", pto);
		model.addAttribute("qnatype", qnatype);
		
	}



	@RequestMapping(value = "listpagelistpage", method = RequestMethod.GET)
	public void qlist(Model model, String qnatype) {
		List<QNABoardVO> list=qservice.qlist(qnatype);
		model.addAttribute("list", list);
	}
	@RequestMapping(value = "listpages", method = RequestMethod.GET)
	public void listpage(PageTO to, Model model) {
		to= qservice.listpage(to);
		model.addAttribute("to", to);
	}

}
