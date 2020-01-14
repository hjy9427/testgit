package kr.co.ca;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(); //현재시간, 밑에 롱이라고 뜨면 특정날짜를 가르킴
	
		Calendar c = Calendar.getInstance();
		c.setTime(d);  //캘린더클래스의 값이 바뀜
		System.out.println(c.get(Calendar.YEAR));
		
		Date d2 = c.getTime();
		System.out.println(d2);  //세팅해둔 값으로 나옴
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String msg = sdf.format(d2);
		System.out.println(msg);
	}

}
