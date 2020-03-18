package com.naver.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;

public class MediaUtils {
	private static Map<String, MediaType> mediaMap;
	
	//static초기화
	static {
		mediaMap=new HashMap<String, MediaType>();
		mediaMap.put("JPEG", MediaType.IMAGE_JPEG);
		mediaMap.put("JPG", MediaType.IMAGE_JPEG);
		mediaMap.put("PNG", MediaType.IMAGE_PNG);
		mediaMap.put("GIF", MediaType.IMAGE_GIF);
	}
	public static MediaType getMediaType(String type) {
		return mediaMap.get(type.toUpperCase());
		//다 대문자로 만들기
	}
}
