package com.naver.hi;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSourceTest {
//**는 폴더가 어떤 폴더든지 상관없단 의미 폴더 있어도되고 없어도 되고
//*.xml  xml이 확장자인 모든 파일
	//spring폴더명 복붙하고 src앞에꺼지우기
	@Inject 
	private DataSource dataFactory;
	//@Autowired와 똑같은 기능 inject
	//객체 가져옴
	//전에 데이터팩토리 어쩌고 쓴 거랑 같은기능
	//이미 만들어진 자바코드 여기다다 넣음
	//널같지만 인젝트가 선언되는 순간 널이 아님
	
	//메서드 단위 테스트 해야하는데 이 때 골뱅이테스트 써주기
	@Test//골뱅이 꼭 붙여주기
	public void testConnection() {
		//무조건 퍼블릭 보이드임 무조건 무파람임
		//테스트가 여러개일 때 특정 테스트를 하고 싶으면 
		//메서드명을 블럭잡아서 실행하면 됨
		Connection conn=null;
		try {
			conn=dataFactory.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
}
