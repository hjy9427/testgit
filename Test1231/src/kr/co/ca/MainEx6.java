package kr.co.ca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class MainEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String enter = System.getProperty("line.separator");
		Writer out = null;
		PrintWriter pw = null;
		
		Reader in = null;
		BufferedReader br = null;  //¾ê´Â ÇÑÁÙ¾¿ÀÐ¾î¿È
		
		try {
			out = new FileWriter("C:"+File.separator+"zzz.txt");
			pw = new PrintWriter(out);
			in = new FileReader("C:"+File.separator+"zzz.txt");
			br = new BufferedReader(in);
			
			pw.print("hello");
			pw.print(enter);
			pw.print("good morning");
			pw.print(enter);
			pw.print("¾È³çÇÏ¼¼¿ä");
			pw.flush();
			
			while (true) {
				String msg= br.readLine();
				if(msg == null) {
					break;
				}
				System.out.println(msg);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw != null) {
					pw.close();
				}
				if(out != null) {
					out.close();
				}
				if(br != null) {
					br.close();
				}
				if(in != null) {
					in.close();
				}
		
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
