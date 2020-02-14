package com.naver.hi;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.naver.repository.MemberDAO;
import com.naver.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberServiceTest {
	@Inject
	private MemberService mservice;
	
	@Test
	public void testGetTime() {
		mservice.getTime();
	}
	@Test
	public void testList() {
		System.out.println(";;;;;;;");
		System.out.println(mservice.list());
		System.out.println(";;;;;;;;;;;;;;");
	}
}
