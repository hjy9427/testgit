package kr.co.ca;

import java.util.ArrayList;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(new String("hello"));
		int size = list.size();
		String msg = list.get(0);
		
		
		list.remove(0);           //삭제하고 반환
		list.clear();
		list.contains(msg);
		
		for(int i = size - 1; i >= 0; i--) {
			if (i == 0 || i == 1 || i == 2) {
				list.remove(i);
				
			}
		}
		
	}

}
