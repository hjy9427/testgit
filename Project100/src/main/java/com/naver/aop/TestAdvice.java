package com.naver.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAdvice {
//스프링에 빈으로 인식하게 하기 위해서 컴포넌트 써줌
//aspect 어드바이스에 사용되는 aop라는걸알려줌
	@Around("execution(* com.naver.service.TestService*.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		//pjp에는 무조건 스로즈 써야함 exception보다 상위 단계?인 throwable사용
		long start=System.currentTimeMillis();
		
		Object obj =pjp.proceed();
		//얘를 기준으로 포인트컷을 실행하기 전에 실행할 코드를 위
		//나중에 실행할 코드를 밑에 작성
		long end=System.currentTimeMillis();
		System.out.println("####################");
		System.out.println(end-start);
		System.out.println("####################");
		return obj;
	}
	
	//나중에 실행
	@After("execution(* com.naver.service.TestService*.*(..))")
	public void end(JoinPoint jp) {
		//두번쨰 조인포인트
		System.out.println(":::::end::::::::");
		System.out.println(":::::end::::::::");	
		System.out.println(jp.getKind());
		System.out.println(jp.getTarget());
		System.out.println(jp.getThis());
		//사용하는 객체 누군지
		Object[] args = jp.getArgs();
		System.out.println(Arrays.toString(args));
		
	}
	//앞에서 실행
	@Before("execution(* com.naver.service.TestService*.*(..))")
	public void start() {
		System.out.println(":::::start::::::::");
		System.out.println(":::::start::::::::");
	}
}
