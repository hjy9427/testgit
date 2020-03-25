package com.naver.controller;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.naver.dto.NoticeBoardVO;
import com.naver.dto.PageTO;
import com.naver.dto.ReplyVO;
import com.naver.service.NoticeBoardService;
import com.naver.utils.MediaUtils;

@Controller
@RequestMapping("board")
public class NoticeBoardController {

	@Inject
	private NoticeBoardService bservice;
	
	@Resource(name = "uploadPath")
	private String uploadPath;
	
	
	@RequestMapping(value = "insert", method=RequestMethod.GET)
	public void insertui() {
	}
	
	@RequestMapping(value = "insert", method=RequestMethod.POST)
	public String insert(NoticeBoardVO vo) {
		bservice.insert(vo);
		return "redirect:/board/listpage";			
	}
	
	@RequestMapping(value="read/{bno}", method=RequestMethod.GET)
	public String read(@PathVariable("bno") int bno, int curPage, Model model) {
		NoticeBoardVO vo=bservice.read(bno);
		model.addAttribute("vo", vo);
		model.addAttribute("curPage", curPage);
		return "board/read";
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<NoticeBoardVO> list=bservice.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping(value = "listpage", method = RequestMethod.GET)
	public void listpage(PageTO to, Model model) {
		to= bservice.listpage(to);
		model.addAttribute("to", to);
	}
	
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String updateui(int bno, int curPage, Model model) {
		NoticeBoardVO vo=bservice.updateui(bno);
		model.addAttribute("vo", vo);
		model.addAttribute("curPage", curPage);
		return "board/update";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(NoticeBoardVO vo, @RequestParam("curPage") int curPage) {
		bservice.update(vo);
		return "redirect:/board/listpage?curPage="+curPage;
	}
	
	@RequestMapping(value = "deletefile/{bno}", method = RequestMethod.POST)
	@ResponseBody
	public String deletefile(@PathVariable("bno") int bno, String filename) {
		bservice.deletefile(bno, filename);
		
		filename=filename.replace('/', File.separatorChar);
		
		File f= new File(uploadPath, filename);
		if(f.exists()) {
			f.delete();	
		}
				
		String type=filename.substring(filename.lastIndexOf(".")+1);
		
		if(MediaUtils.getMediaType(type)!=null) {
			String prefix=filename.substring(0, 12);
			String suffix=filename.substring(14);
			File f0=new File(uploadPath, prefix+suffix);
			if(f0.exists()) {
				f0.delete();
			}
		}
		return "삭제되었습니다";
	}
	
	@RequestMapping(value = "delete/{bno}/{curPage}", method = RequestMethod.POST)
	public String delete(@PathVariable("bno") int bno, @PathVariable("curPage") int curPage) {
		bservice.delete(bno);
		return "redirect:/board/listpage?curPage"+curPage;
	}
	
}
