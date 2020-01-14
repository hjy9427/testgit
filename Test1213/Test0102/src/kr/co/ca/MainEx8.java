package kr.co.ca;

import java.io.File;

public class MainEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("AAA"); //C:넣는거랑 그냥 넣는 건 위치가 다름
		
		String ap = f.getAbsolutePath(); //에프의 좌표
		//이 좌표 말고 상대좌표로 해줘야함 이유는 컴터마다 조금씩 다르니까
		System.out.println(ap);
		
		if(f.exists()) {
			System.out.println("존재합니다.");
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}

}
