package com.naver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {
	
	
	public void show9() {
		HashSet<MemberDTO> set = new HashSet<MemberDTO>();
		
		set.add(new MemberDTO("m001", "kim", 323));
		set.add(new MemberDTO("m002", "kim", 6));
		set.add(new MemberDTO("m003", "kim", 1));
		set.add(new MemberDTO("m001", "kim", 323));
		System.out.println(set);
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		
		set.forEach(x -> {
			list.add(x);
		});
		
		list.get(0);
		
		
	}
	public void show8() {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		Iterator<Integer> it = set.iterator();//매개체역할
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (it.hasNext()) {
			Integer val = it.next();   //iterator에 잇는 데이터를 하나씩 꺼내줌
			list.add(val);
		}
		list.get(0);
	}
	public void show7() {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
	
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		System.out.println(list);
		
		
	}
	public void show6() {
		HashSet<MemberDTO> set = new HashSet<MemberDTO>();
		
	}
	public void show5() {
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");    //중복되는 것 때문에 size는 4나옴
		
		System.out.println(set);
		set.remove("a");
		System.out.println(set);
	}
	
	public int show4() {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(100);
		set.add(400);
		set.add(500);
		
		int size = set.size();
		
		return size;
	}
	public void show3(String msg) {
		HashSet<String> set = new HashSet<String>();
		set.add("hello");
		set.add("apple");
		set.add("go");
		System.out.println(set);
		
		set.add(msg);
		System.out.println(set);
		
		
	}
	
	public void show2(int i) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		boolean result = set.add(i);
		
		System.out.println(result);
		System.out.println(set);
	}
	public void show1() {
		HashSet<String> set = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
	}
}
