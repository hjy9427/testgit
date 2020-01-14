package kr.co.ca;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(1000);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		d = c.getTime();
		
		SimpleDateFormat format = new SimpleDateFormat("yy");
		String m = format.format(d);
		System.out.println(m);
	}

}
