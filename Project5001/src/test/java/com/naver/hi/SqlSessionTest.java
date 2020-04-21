package com.naver.hi;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SqlSessionTest {
	
	@Autowired
	private SqlSession session;
	
	@Test
	public void testSession() {
		System.out.println(session);
	}
}
