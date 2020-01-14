package com.naver;

import java.util.StringTokenizer;

public class Test2 {
	
	
	
	
	
	public void me11() {
		String str1 = "     id#pw#point#grade##age    ";
		String str2 = "     id#pw#point#grade##age    ";
	
		str1 = str1.trim();
		str2 = str2.trim();
		
		
		String[] arr1 = str1.split("#");   
		
		for (int i = 0; i < arr1.length; i++) {
			String val = arr1[i];
			System.out.println(val);
		}
	
		System.out.println(";;;;;;;;;;;;;;;;;;;;");
		StringTokenizer st = new StringTokenizer(str1, "#");
		System.out.println(st.countTokens());
		String[] arr = new String[st.countTokens()];
		
		int idx = 0;
		
		while (st.hasMoreTokens()) {
			String temp = st.nextToken();  //다음토큰으로 넘어가고 앞에 토큰 반환
			arr[idx++] = temp;
			System.out.println(temp);
		}
		
		
	}
	
	
	
	
	public void me10() {
		String case11 = "abcdefg";     //대소문자 변환
		String msg = case11.toUpperCase();
		case11 = msg.toLowerCase();
		
	}
	
	
	public void me9() {
		String str = "who are you? I'm a doctor.";
		boolean is = str.contains("doctor");    //doctor라는 글자가 포함되어있냐
		
		
		
		
		
		
	}
	public void me8() {
		String fileName = "aaaaa.png";
		boolean b = fileName.endsWith("png");
		System.out.println(b);
	
	
	
	}
	
	public void me71() {
		String str = "1234455679123456678"; 
		int startIdx = str.indexOf('4');
		int endIdx = str.lastIndexOf('6');
		
		
		String msg = str.substring(startIdx, endIdx);
	
		int idx1 = str.indexOf('4', 4);
		int idx2 = str.lastIndexOf('6');
		int idx3 = str.lastIndexOf('6', idx2);
		
		String msg2 = str.substring(idx1, idx3);
		
	}
	
	
	public void me7() {
		String str = "1234455679123456678"; //잘라내기
		
		int idx = str.indexOf("4");
		String msg = str.substring(idx);
		System.out.println(msg);
	}
	
	
	public void me6() {
		String str = "      hello       ";
		str = str.trim();  //문자열의 앞뒤공백제거
		System.out.println(str);
		
	}
	
	
	
	public void me5() {
		String str = "good morning";
		int size = str.length();
		System.out.println(size);
	}
	
	
	public void me4() {
		
		String msg = "a";
		char c = msg.charAt(0);    //첫글자 확인하고 싶을때
		System.out.println(c);
	}
	
	
	
	public void me3() {
		
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		sb.append("!!!");
		
		String str = sb.toString();
		System.out.println(str);
		
		
		
	}
	
	
	
	
	public void me2() {
		String str1 = new String("hello");  
		String str2 = "hello";   
		String str3 = "hello";
		String str4 = new String("hello");
		String str5 = str4;
		
		
		boolean trueOrFalse = str1.equals(str2);
		System.out.println(trueOrFalse); 
		
		
		
		
		
	}
	public void me1() {
		String str1 = new String("hello");  
		String str2 = "hello";   
		String str3 = "hello";
		String str4 = new String("hello");
		String str5 = str4;
		
		System.out.println(str1 == str2);   
		System.out.println(str2 == str3);   
		System.out.println(str1 == str4);    
		System.out.println(str4 == str5);    
		
	}
}
