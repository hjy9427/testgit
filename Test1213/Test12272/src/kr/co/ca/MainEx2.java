package kr.co.ca;

import java.util.ArrayList;
import java.util.Collections;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("e");
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("b");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
