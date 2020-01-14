<<<<<<< HEAD
package kr.co.ca;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		System.out.println("È¸¿ø Á¤º¸ ¼öÁ¤");
		
		System.out.println("¼öÁ¤ÇÒ ID¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		String id = sc.nextLine();
		
		System.out.println("»õ·Î¿î ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä");
		String name = sc.nextLine();

		System.out.println("ÇĞ°ú Did¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		System.out.println("d001:¿µ¹®°ú , d002:±â°è°øÇĞ, d003:¹ıÇĞ");
		String did = sc.nextLine();
		
		
		boolean isTrue = true;
		boolean is = did.equals("d001");
		boolean is1 = did.equals("d002");
		boolean is2 = did.equals("d003");
	
		while(isTrue) {
			if (is == true || is1 == true || is2 == true) {
				System.out.println("³ªÀÌ¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
				int age = sc.nextInt();
			//ÇöÀç Enter°¡ µé¾î°¡ÀÖ´Â »óÅÂ
				sc.nextLine(); //Enter»èÁ¦
				while(true) {
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
				MemberDTO someone = dao.selectById(id);
				if (someone!=null) {
					dao.update(dto);
					System.out.println("¼öÁ¤µÇ¾ú½À´Ï´Ù");
				}else {
					System.out.println("Á¸ÀçÇÏÁö ¾Ê´Â IDÀÔ´Ï´Ù");
				}
				break;
		} else {
			System.out.println("ÇĞ°ú¸¦ ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
			System.out.println("d001:¿µ¹®°ú , d002:±â°è°øÇĞ, d003:¹ıÇĞ");
			String did1= sc.nextLine();
			
			boolean is3 = did1.equals("d001");
			boolean is4 = did1.equals("d002");
			boolean is5 = did1.equals("d003");
		
			if (is3 == true || is4 == true || is5 == true) {
				System.out.println("³ªÀÌ¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
				int age2 = sc.nextInt();
				sc.nextLine(); 
				while(true) {
					if (age2 < 0 || age2 > 200) {
						System.out.println("ºÒ°¡´ÉÇÑ ³ªÀÌÀÔ´Ï´Ù. ÀÔ·Â °¡´É ³ªÀÌ´Â 0 º¸´Ù Å©°Å³ª 200 ¹Ì¸¸ ÀÔ´Ï´Ù");
						System.out.println("´Ù½Ã ³ªÀÌ¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
						age2 = sc.nextInt();
						sc.nextLine(); //ÇöÀç Enter°¡ µé¾î°¡ÀÖ´Â »óÅÂ¶ó enter»èÁ¦ 

					}else {
						break;
					}
				}
				MemberDTO dto1 = new MemberDTO(id, name, did1, age2);
				MemberDTO someone = dao.selectById(id);
				if (someone!=null) {
					dao.update(dto1);
					System.out.println("¼öÁ¤µÇ¾ú½À´Ï´Ù");
				}else {
					System.out.println("Á¸ÀçÇÏÁö ¾Ê´Â IDÀÔ´Ï´Ù");
				}
				
				break;
			}
		}

		}
	

		
		
		
		
	}
	public void me1() {
		
	}
}
=======
package kr.co.ca;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		
		System.out.println("íšŒì› ì •ë³´ ìˆ˜ì •");
		
		System.out.println("ìˆ˜ì •í•  íšŒì›ì˜ IDë¥¼ ì…ë ¥í•˜ì„¸ìš”");
		String id = sc.nextLine();
		
		MemberDTO someone = dao.selectById(id);
		String name=null;
		if (someone!=null) {
			System.out.println("ìƒˆì´ë¦„ì„ ì…ë ¥í•˜ì„¸ìš”.\nìµœëŒ€ ì˜ë¬¸ 12ìê¹Œì§€ ê°€ëŠ¥");
			
			while(true) {
				name = sc.nextLine();
				int namelen = name.length(); 
				if (namelen > 12 || namelen == 0) {
					System.out.println("ê°€ëŠ¥í•œ ì´ë¦„ë¥¼ ë‹¤ì‹œ ì…ë ¥í•˜ì„¸ìš”.\nìµœëŒ€ ì˜ë¬¸ 12ìê¹Œì§€ ê°€ëŠ¥");
				}else {
					break;
					}
				}
			
		System.out.println("í•™ê³¼ Didë¥¼ ì…ë ¥í•˜ì„¸ìš”");
		
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
				sc.nextLine(); 
			}else {
				break;
			}
		}
		
			MemberDTO dto = new MemberDTO(id, name, did, age);
			MemberDTO someone1 = dao.selectById(id);
			if (someone1!=null) {
				dao.update(dto);
				System.out.println("ìˆ˜ì •ë˜ì—ˆìŠµë‹ˆë‹¤");
			}else {
				System.out.println("ì¡´ì¬í•˜ì§€ ì•ŠëŠ” IDì…ë‹ˆë‹¤");
			}
		}
	}	
}
	

>>>>>>> 24eddf8246548c07a38003ef3967a2b930878048
