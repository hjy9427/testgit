package kr.co.ca;

import java.util.ArrayList;
import java.util.Collections;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(9);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(3);
		
		System.out.println(list);  //�Էµ� ������� ���
		
		Collections.sort(list);
		System.out.println(list);  //������� ���
	}

}
