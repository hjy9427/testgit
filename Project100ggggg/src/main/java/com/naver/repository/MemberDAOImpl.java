package com.naver.repository;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.naver.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession session;
	
	private final String NS="com.naver.member";
	
	@Override
	public void insert(MemberDTO dto) {
		session.insert(NS+".insert", dto);
		
	}

	@Override
	public MemberDTO checkid(String id) {
		
		return session.selectOne(NS+".checkid", id);
		
	}

	@Override
	public MemberDTO searchid(String name, int age) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		map.put("age", age);
		return session.selectOne(NS+".searchid", map);
	}
	
	@Override
	public List<MemberDTO> list() {
		// TODO Auto-generated method stub
		return session.selectList(NS+".list");
	}


	@Override
	public MemberDTO read(String id) {
		// TODO Auto-generated method stub
		return session.selectOne(NS+".read", id);
	}



	@Override
	public MemberDTO updateui(String id) {
		// TODO Auto-generated method stub
		return session.selectOne(NS+".updateui", id);
	}

	@Override
	public void update(MemberDTO dto) {
		// TODO Auto-generated method stub
		session.update(NS+".update", dto);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		session.delete(NS+".delete", id);
	}

	@Override
	public MemberDTO searchpw(String id, String name, int age) {
		HashMap<String, Object> map= new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		map.put("age", age);
		
		return session.selectOne(NS+".searchpw", map);
	}

	@Override
	public void setpw(String id, String pw) {
		HashMap<String, Object> map= new HashMap<String, Object>();
		map.put("id", id);
		map.put("pw", pw);
		session.update(NS+".setpw", map);
		
	}

	
	
	
	
	
	
}
