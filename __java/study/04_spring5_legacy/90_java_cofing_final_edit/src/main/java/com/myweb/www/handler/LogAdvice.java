package com.myweb.www.handler;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.myweb.www.domain.BCommentVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Aspect
public class LogAdvice {
	
	@Before("execution(* com.myweb.www.service.BCommentService*.*(..))")
	public void commentLogBefore() {
		log.info(">>>>>>>>>>>>>>>>>>>>> Comment Log Start >>>>>>>>>>>>>>>>>>>");
	}
	
	@Before("execution(* com.myweb.www.service.BCommentService*.register(com.myweb.www.domain.BCommentVO)) && args(cvo)")
	public void commentLogBeforeRegister(BCommentVO cvo) {
		log.info(">>>>>>>>>>>>>> {}", cvo);
	}
	
	@After("execution(* com.myweb.www.service.BCommentService*.*(..))")
	public void commentLogAfter() {
		log.info("<<<<<<<<<<<<<<<<<<<< Comment Log Finish <<<<<<<<<<<<<<<<<<<<<");
	}
}
