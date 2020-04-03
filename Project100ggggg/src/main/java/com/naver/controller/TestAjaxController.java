package com.naver.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.naver.dto.BoardVO;

@Controller
@RequestMapping("test")
public class TestAjaxController {
	
	@RequestMapping(value = "test4", method = RequestMethod.POST)
	@ResponseBody
	public List<Map<String, Object>> test4(@RequestParam Map<String, Object> map) throws JsonParseException, JsonMappingException, IOException {
		String jsonStr = map.get("mList").toString();
		ObjectMapper mapper=new ObjectMapper();
		List<Map<String, Object>> list = mapper.readValue(jsonStr, new TypeReference<ArrayList<Map<String, Object>>>(){});
		//여기서 에러 나오니까 throws 날림
		for (Map<String, Object> m:list) {
			System.out.println(";;;;;;;;;;");
			System.out.println(m.get("id"));
			System.out.println(m.get("name"));
			System.out.println(m.get("age"));
			System.out.println(";;;;;;;;;;;");			
		}
		return list;
		//System.out.println(jsonStr);
		//System.out.println(map);
		//콘솔창에{mList=[{"id":"m001","age":11,"name":"kim"},{"id":"m002","age":22,"name":"lee"},{"id":"m003","age":33,"name":"pakr"}]}
		//이렇게 뜨는데
		//mList가 키고 이퀄 옆에가 값
	}
	
	
	@RequestMapping(value = "test4", method = RequestMethod.GET)
	public void test4() {
		
	}
	
	@RequestMapping(value = "test3", method = RequestMethod.POST)
	@ResponseBody
	public BoardVO test3(BoardVO vo) {
			System.out.println(vo);
		return vo;
	}
	
	@RequestMapping(value = "test3", method = RequestMethod.GET)
	public void test3() {
		
	}
	
	@RequestMapping(value = "test22", method = RequestMethod.POST)
	@ResponseBody
	public String[] test22(String[] arr) {
			System.out.println(";;;;;;;;;;;;");
		for(String x:arr) {
			System.out.println(x);
		}
		return arr;
	}
	@RequestMapping(value = "test22", method=RequestMethod.GET)
	public void test22() {
		
	}
	
	
	@RequestMapping(value = "test2", method = RequestMethod.POST)
	@ResponseBody
	public String[] test2(String[] arr) {
			System.out.println(";;;;;;;;;;;;");
		for(String x:arr) {
			System.out.println(x);
		}
		return arr;
	}
	@RequestMapping(value = "test2", method = RequestMethod.GET)
	public void test2() {
		
	}
	
	@RequestMapping(value = "test1", method = RequestMethod.POST, produces="application/text;charset-UTF-8")
	@ResponseBody
	public String test1(String str) {
		return str;
	}
	//ajax는한글 깨지니까 안깨지게 하기 위해 프로듀시즈 추가
	//ajax는 result로 넘어오는 데이터가 있어야하기 때문에 반환형 String
	@RequestMapping(value = "test1", method = RequestMethod.GET)
	public void test1() {
		
	}
	
	
}
