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

import com.naver.dto.BoardVO;
import com.naver.dto.PageTO;
import com.naver.dto.ProductVO;
import com.naver.dto.ReplyVO;
import com.naver.service.BoardService;
import com.naver.utils.MediaUtils;

@Controller
@RequestMapping("product")
public class ProductController {

	@Inject
	private ProductService pservice;
	@Resource(name = "uploadPath")
	private String uploadPath;
	
	@RequestMapping(value = "pdeletefile/{bno}", method = RequestMethod.POST)
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
	
	@RequestMapping(value="pread/{p_id}", method=RequestMethod.GET)
	public String read(@PathVariable("p_id") int p_id, int pcurPage, Model model) {
		ProductVO pvo=bservice.read(p_id);
		model.addAttribute("pvo", pvo);
		model.addAttribute("pcurPage", pcurPage);
		return "product/pread";
	}
	@RequestMapping("plist")
	public void list(Model model) {
		List<ProductVO> plist=pservice.list();
		model.addAttribute("plist", plist);
		}
	@RequestMapping(value = "pinsert", method=RequestMethod.POST)
	public String insert(BoardVO vo) {
		bservice.insert(vo);
		return "redirect:/board/listpage";			
		}
	@RequestMapping(value = "pinsert", method=RequestMethod.GET)
	public void insertui() {
		}
	@RequestMapping(value = "pupdate", method = RequestMethod.GET)
	public String updateui(int bno, int curPage, Model model) {
		BoardVO vo=bservice.updateui(bno);
		model.addAttribute("vo", vo);
		model.addAttribute("curPage", curPage);
		return "board/update";
	}
	@RequestMapping(value = "pupdate", method = RequestMethod.POST)
	public String update(BoardVO vo, @RequestParam("curPage") int curPage) {
		bservice.update(vo);
		return "redirect:/board/listpage?curPage="+curPage;
	}
	@RequestMapping(value = "plistpage", method = RequestMethod.GET)
	public void listpage(PageTO to, Model model) {
		to= bservice.listpage(to);
		model.addAttribute("to", to);
	}
	@RequestMapping(value = "pdelete/{bno}/{curPage}", method = RequestMethod.POST)
	public String delete(@PathVariable("bno") int bno, @PathVariable("curPage") int curPage) {
		bservice.delete(bno);
		return "redirect:/board/listpage?curPage"+curPage;
	}
	
}
