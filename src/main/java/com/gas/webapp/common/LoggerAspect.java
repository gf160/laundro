package com.gas.webapp.common;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jjung
 *
 */
@Aspect
public class LoggerAspect {

	private Logger logger = LogManager.getLogger(getClass());

	@Before("execution(* com.gaa.webapp..*ViewController.*(..))")
	public void beforeExecution(JoinPoint joinPoint) throws Throwable {
		String type = joinPoint.getSignature().getDeclaringTypeName();
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		String reqUrl = request.getRequestURI();
		logger.info("type = " + type + ", uri = " + reqUrl);
	}
	
}
