package kr.co.ca;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(); //����ð�, �ؿ� ���̶�� �߸� Ư����¥�� ����Ŵ
	
		Calendar c = Calendar.getInstance();
		c.setTime(d);  //Ķ����Ŭ������ ���� �ٲ�
		System.out.println(c.get(Calendar.YEAR));
		
		Date d2 = c.getTime();
		System.out.println(d2);  //�����ص� ������ ����
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String msg = sdf.format(d2);
		System.out.println(msg);
	}

}
