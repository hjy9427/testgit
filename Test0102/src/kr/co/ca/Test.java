package kr.co.ca;

import java.io.File;

public class Test {
	
	public void me6() {
		File from = new File("C:" + File.separator + "dos.dat");
		File to = new File("C:" + File.separator + "AAA" + File.separator + "dos.dat");
		from.renameTo(to);
	}
	
	public void me5() {
		File from = new File("C:" + File.separator + "obj.dat");
		File to = new File("C:" + File.separator + "dos.dat");
	
		from.renameTo(to);
	
	}
	
	public void me4() {
		File f = new File("C:" + File.separator + "test.png");
		if(f.exists()) {
			f.delete();
		}
	}
	
	public void me3() {
		File f = new File("C:" + File.separator + "AAA");
		if(f.exists()) {
			f.delete();
		} else {
			System.out.println("");
		}
	}
	public void me2() {
		File f = new File("C:" + File.separator + "AAA");
	//Ȯ���ڰ� ������  �����̰� Ȯ���ڰ� ������ ���丮
		if(!f.exists()) {//���İ� ����°��� ������ true
			f.mkdir();//����ũ ���丮
		} else {
			System.out.println("�̹� �����մϴ�.");
		}
	}
}
