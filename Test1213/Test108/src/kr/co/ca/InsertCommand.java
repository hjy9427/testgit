<<<<<<< HEAD
package kr.co.ca;

import java.util.Scanner;

public class InsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		String id = null;
		
		try {
			System.out.println("ID¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
			while(true) {
				id = sc.nextLine();
				int idlen = id.length(); 
				if (idlen>7 || idlen == 0) {
					System.out.println("³Ê¹« ±ä IDÀÔ´Ï´Ù. ÃÖ´ë ¿µ¹® 6ÀÚ±îÁö °¡´É");
					System.out.println("ID¸¦ ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
				}else {
					break;
				}
			}
		} catch (Exception e) {
//			e.printStackTrace();
		} finally {

		MemberDAO dao = new MemberDAO();

		while(true) {
			MemberDTO someone = dao.selectById(id);
			if (someone!= null) {
				System.out.println("Áßº¹µÈ IDÀÔ´Ï´Ù. ´Ù¸¥ ID¸¦ ÀÔ·Â ÇÏ¼¼¿ä");
				id = sc.nextLine();
			}else {	break;	}
		}
		

			System.out.println("ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä.");
			String name = sc.nextLine();
			
			
			
			
			System.out.println("´ÙÀ½ ÇĞ°ú ÄÚµå Did Áß ÇÏ³ª¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
			String did = null;
			while(true) {
				
				System.out.println("d001:¿µ¹®°ú , d002:±â°è°øÇĞ, d003:¹ıÇĞ");
				did= sc.nextLine();
				boolean is = did.equals("d001");
				boolean is1 = did.equals("d002");
				boolean is2 = did.equals("d003");	
				
				
				if (is == true || is1 == true || is2 == true) {
					break;
					
			} else {
				System.out.println("ÇĞ°ú¸¦ ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
				
				
				}}
				int age = 0;
				while(true) {
					System.out.println("³ªÀÌ¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
					age = sc.nextInt();
				//ÇöÀç Enter°¡ µé¾î°¡ÀÖ´Â »óÅÂ
					sc.nextLine(); //Enter»èÁ¦
					if (age < 0 || age > 200) {
						System.out.println("ºÒ°¡´ÉÇÑ ³ªÀÌÀÔ´Ï´Ù. ÀÔ·Â °¡´É ³ªÀÌ´Â 0 º¸´Ù Å©°Å³ª 200 ¹Ì¸¸ ÀÔ´Ï´Ù");
						System.out.println("´Ù½Ã ³ªÀÌ¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
						age = sc.nextInt();
						sc.nextLine(); //ÇöÀç Enter°¡ µé¾î°¡ÀÖ´Â »óÅÂ¶ó enter»èÁ¦ 

					}else {
						break;
					}
				}
				MemberDTO dto = new MemberDTO(id, name, did, age);
				dao.insert(dto);
				System.out.println("°¡ÀÔ µÇ¾ú½À´Ï´Ù");
				
			
	
			}
		}
	}


		
=======
package kr.co.ca;

import java.util.Scanner;

public class InsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		String id = null;
		
		try {
			System.out.println("IDë¥¼ ì…ë ¥í•˜ì„¸ìš”.");
			while(true) {
				id = sc.nextLine();
				int idlen = id.length(); 
				if (idlen>7 || idlen == 0) {
					System.out.println("ë„ˆë¬´ ê¸´ IDì…ë‹ˆë‹¤. ìµœëŒ€ ì˜ë¬¸ 6ìê¹Œì§€ ê°€ëŠ¥");
					System.out.println("IDë¥¼ ë‹¤ì‹œ ì…ë ¥í•˜ì„¸ìš”");
				}else {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		MemberDAO dao = new MemberDAO();
		while(true) {
			MemberDTO someone = dao.selectById(id);
			if (someone!= null) {
				System.out.println("ì¤‘ë³µëœ IDì…ë‹ˆë‹¤. ë‹¤ë¥¸ IDë¥¼ ì…ë ¥ í•˜ì„¸ìš”");
				id = sc.nextLine();
			}else {	break;	}
		}
	
		System.out.println("ì´ë¦„ì„ ì…ë ¥í•˜ì„¸ìš”.");
		String name = sc.nextLine();
			
		System.out.println("ë‹¤ìŒ í•™ê³¼ ì½”ë“œ Did ì¤‘ í•˜ë‚˜ë¥¼ ì…ë ¥í•˜ì„¸ìš”.");
		String did = null;
		while(true) {
				
			System.out.println("d001:ì˜ë¬¸ê³¼ , d002:ê¸°ê³„ê³µí•™, d003:ë²•í•™");
			did= sc.nextLine();
			boolean is = did.equals("d001");
			boolean is1 = did.equals("d002");
			boolean is2 = did.equals("d003");	
			if (is == true || is1 == true || is2 == true) {
				break;	
			} else {
				System.out.println("í•™ê³¼ë¥¼ ë‹¤ì‹œ ì…ë ¥í•˜ì„¸ìš”");	
			}
		}
		
		int age = 0;
			while(true) {
				System.out.println("ë‚˜ì´ë¥¼ ì…ë ¥í•˜ì„¸ìš”.");
				age = sc.nextInt();
				sc.nextLine(); 
				if (age < 0 || age > 200) {
					System.out.println("ë¶ˆê°€ëŠ¥í•œ ë‚˜ì´ì…ë‹ˆë‹¤. ì…ë ¥ ê°€ëŠ¥ ë‚˜ì´ëŠ” 0 ë³´ë‹¤ í¬ê±°ë‚˜ 200 ë¯¸ë§Œ ì…ë‹ˆë‹¤");
					System.out.println("ë‹¤ì‹œ ë‚˜ì´ë¥¼ ì…ë ¥í•˜ì„¸ìš”.");
					age = sc.nextInt();
					sc.nextLine(); //í˜„ì¬ Enterê°€ ë“¤ì–´ê°€ìˆëŠ” ìƒíƒœë¼ enterì‚­ì œ 

				}else {
					break;
				}
			}
			
			MemberDTO dto = new MemberDTO(id, name, did, age);
			dao.insert(dto);
			System.out.println("ê°€ì… ë˜ì—ˆìŠµë‹ˆë‹¤");
		}
	}
}

		
>>>>>>> 24eddf8246548c07a38003ef3967a2b930878048
