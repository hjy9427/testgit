package kr.co.ca;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDTO  dto = new MemberDTO("z001", "kim", 33);
		
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
	}

}
