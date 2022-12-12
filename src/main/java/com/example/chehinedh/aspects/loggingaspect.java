package com.example.chehinedh.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class loggingaspect {

    @After("execution(* com.example.chehinedh.services.*.*(..))")
    public void logMethodExit(JoinPoint joinPoint) {

        String name = joinPoint.getSignature().getName();

        log.info("Out of method :" + name );
    }
}
