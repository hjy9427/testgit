package com.naver;

import java.util.ArrayList;

public class MemberDAO {
	public static ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
	
	public void delete(String id) {
		MemberDTO dto = new MemberDTO(id, null, 0);
		list.remove(dto);
	}
	
	
	
	public void update(MemberDTO dto) {
		int idx = list.indexOf(dto);
		list.set(idx, dto);
	}
	
	public MemberDTO getMembrDTOById(String id) {
		
		MemberDTO dto = new MemberDTO(id, null, 0);
		
		int idx = list.indexOf(dto);
		
		MemberDTO some = list.get(idx);
		return some;
	}
	
	
	public ArrayList<MemberDTO> getList() {
		return list;
	}
	
	public void insert(MemberDTO dto) {
		list.add(dto);
		
	}
}
