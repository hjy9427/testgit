package com.naver.controller;

import java.io.File;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;
import com.naver.dto.ProductDTO;
import com.naver.service.ProductService;
import com.naver.utils.MediaUtils;

@Controller
@RequestMapping("product")
public class ProductController {

	@Inject
	private ProductService pservice;
	
	private String uploadPath;
	
	
	@RequestMapping(value = "insert", method = RequestMethod.GET) 
	public void insertui() {
	
	}
	
	
	@RequestMapping(value = "insert", method = RequestMethod.POST) 
	public String insert(ProductDTO pdto) { 
		pservice.insert(pdto); 
		return "redirect:/board/listpage";
		}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void list(Model model) {
		List<ProductDTO> plist=pservice.list();
		model.addAttribute("plist", plist);
		}
	@RequestMapping(value = "listpage", method = RequestMethod.GET)
	public void listpage(PageTO to, Model model) {
		to= pservice.listpage(to);
		model.addAttribute("to", to);
	}
	@RequestMapping(value = "deletefile/{pno}", method = RequestMethod.POST)
	@ResponseBody
	public String deletefile(@PathVariable("pno") int pno, String filename) {
		pservice.deletefile(pno, filename);
		
		
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
	


	@RequestMapping(value="read/{pno}", method=RequestMethod.GET)
	public String read(@PathVariable("pno") int pno, int curPage, Model model) {
		ProductDTO pdto=pservice.read(pno);
		model.addAttribute("pdto", pdto);
		model.addAttribute("curPage", curPage);
		return "product/read";
	}
	
	
}
