package com.naver.hi;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MybatisTest {
	@Autowired
	private SqlSessionFactory sqlFactory;
	@Test
	public void testSqlFactory() {
		//테스트 접미어 넣어주면 좋음
		System.out.println(sqlFactory);
		//null이 아니면 됨
	}
	
	@Test
	public void testSession() {
		SqlSession session = null;
		//우리가 아는 그 세션과는 다름
		try {
			session=sqlFactory.openSession();
			System.out.println(session);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (session!=null) {
					session.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
