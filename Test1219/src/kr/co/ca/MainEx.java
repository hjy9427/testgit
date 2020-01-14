package kr.co.ca;

import com.naver.ChildEx1;
import com.naver.ParentEx;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentEx obj = new ChildEx1();
		
		
		//obj.only();
		
		
		ChildEx1 cObj = null;
		
		if(obj instanceof ChildEx1) {
			cObj = (ChildEx1) obj;    //Çüº¯È¯
			cObj.only();
		}
		
		if(cObj != null) {
			cObj.only();
		}
		
		
	}

}
