package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {
	
	public void me8() {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> productInfo = new ArrayList<String>();
		productInfo.add("������Ʈ");
		productInfo.add("���");
		productInfo.add("�μ�ȸ�α���");
		productInfo.add("���ø����̼�");
		
		ArrayList<String> companyInfo = new ArrayList<String>();
		companyInfo.add("����Ұ�");
		companyInfo.add("IR");
		companyInfo.add("���Ӱ��ɼ�");
		companyInfo.add("�Ｚ�����");
		companyInfo.add("�����ϴ�");
		
		map.put("productInfo", productInfo);
		map.put("companyInfo", companyInfo);
	
	}
	
	public void me7() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 97);   //�տ��� Ű �ڿ����� ���
		map.put("b", 98);
		map.put("c", 99);  
		map.put("d", 100);
		map.put("e", 101);
		map.put("f", 102);
		
		
		Set<String> set = map.keySet();  //Ű������ �������
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(map.get(key));
		}
		
	}
	
	
	public void me6() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("f", 6);
		
		int a = map.get("a");
		System.out.println(a);
		System.out.println(map);
		map.remove("a");
		System.out.println(map);
		map.clear();
		System.out.println(map);
	}
	public void me5() {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> tvList = new ArrayList<String>();
		tvList.add("qled");
		tvList.add("oled");
		tvList.add("led");
		
		ArrayList<String> countryList = new ArrayList<String>();
		countryList.add("korea");
		countryList.add("uk");
		countryList.add("china");
		
		map.put("tv", tvList);
		map.put("country", countryList);
		
	}
	public void me4() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("tv", "qled");
		map.put("tv", "oled");
		map.put("tv", "led");
		
		map.put("country", "korea");
		map.put("country", "uk");
		map.put("country", "china");
		
		String tv = map.get("tv");
		String country = map.get("country");
	}
	public void me3() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("grade1", 1);
		map.put("grade1", 2);
		map.put("grade1", 3);
		map.put("grade1", 4);
		
		map.put("grade2", 5);
		map.put("grade2", 6);
		map.put("grade2", 7);
		map.put("grade2", 8);
		map.put("grade2", 9);
		
		
		int size = map.size();
		System.out.println(size);
		System.out.println(map);
	}
	
	
	public void me2() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("car", "bmw");
		map.put("car", "sm5");
		map.put("car", "sonata");
		
		map.put("tv", "Qled");
		map.put("tv", "oled");
		
		map.put("phone", "gal");
		map.put("phone", "g");
		
		
	}
	public void me1() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	}
		
}
