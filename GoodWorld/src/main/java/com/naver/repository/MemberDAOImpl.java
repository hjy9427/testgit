package com.naver.repository;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naver.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	private SqlSession session;
	//마이바티스등등연결
	
	private final String NS="com.naver.member";
	
	
	@Override
	public String getTime() {
		//얘도 객체가 되어야함 컨틀로러가 객체 되기 위해서느 컨트롤러
		//어노테이션 붙여줌
		//얜 레파지토리어노테이션
		//원래는 퍼시스턴스 패키지를 만ㄷ르어야함
		//컨트롤러는 servlet-context.xml에서컴포넌트스캔작업함
		//얘는 root-context.xml에서 컴포넌트스캔작업함
		String msg=session.selectOne("com.naver.member.getTime");
		//session.selectOne(statement, parameter);
		//차이는 물음표입력할데이터있으면 두개 없으면 하나
		//아이디 이름 등등 써야 하면 디티오 쓰거나 맵사용
		//매퍼에 있는 네임스페이스 점 아이디 쓰기
		return msg;
	}

	@Override
	public List<MemberDTO> list() {
		// TODO Auto-generated method stub
		return session.selectList(NS+".list");
	}

	

}
