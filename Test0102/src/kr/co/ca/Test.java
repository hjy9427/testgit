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
	//확장자가 있으면  파일이고 확장자가 없으면 디렉토리
		if(!f.exists()) {//없냐고 물어보는거임 없으면 true
			f.mkdir();//메이크 디렉토리
		} else {
			System.out.println("이미 존재합니다.");
		}
	}
}
