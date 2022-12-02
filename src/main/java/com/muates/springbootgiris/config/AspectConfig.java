package com.muates.springbootgiris.config;

import com.muates.springbootgiris.exception.GlobalException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ResponseStatusException;

@Aspect
@Configuration
public class AspectConfig {

    private final Logger logger = LoggerFactory.getLogger(AspectConfig.class);

    @Before(value = "execution(* com.muates.springbootgiris.service.impl.*.*(..))")
    public void logStatementBefore(JoinPoint joinPoint) {
        logger.info("Execution {}", joinPoint);
    }

    @After(value = "execution(* com.muates.springbootgiris.service.impl.*.*(..))")
    public void logStatementAfter(JoinPoint joinPoint) {
        logger.info("Execution {}", joinPoint);
    }

    @Around(value = "execution(* com.muates.springbootgiris.service.impl.*.*(..))")
    public Object taskHandler(ProceedingJoinPoint joinPoint) throws Throwable {

        try {
            return joinPoint.proceed();
        } catch (GlobalException e) {
            logger.error("Exception Message {}", e.getMessage());
            logger.error("Exception Status {}", e.getStatus());
            throw new ResponseStatusException(e.getStatus(), e.getMessage());
        }
    }
}
