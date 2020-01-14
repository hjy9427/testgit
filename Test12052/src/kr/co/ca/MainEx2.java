package kr.co.ca;

import com.naver.Dog;
import com.naver.Test2;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		t.ls1(5, 3);
		
		boolean r = t.ls2((byte)3, (byte)9);
		System.out.println(r);
		
		byte a = 127;
		byte b = -128;
		r = t.ls2(a, b);
		System.out.println(r);
		
		t.ls3(123L, 122L);
		
		System.out.println(";;;;;;;;;;;;;;");
		
		boolean z = t.ls6(new Dog(), new Dog());
		System.out.println(z);
		
		Dog x1 = new Dog();
		Dog x2 = new Dog();
		Dog y1 = x1;
		
		z = t.ls6(x1, x2);
		System.out.println(z);
		z = t.ls6(x1, y1);
		System.out.println(z);
		
		
	}

}
