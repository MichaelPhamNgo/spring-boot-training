package com.springboot.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Around("com.springboot.app.aop.PointCuts.inDataAccessLayer()")
    public Object executionTimeAdvice(ProceedingJoinPoint pjp) throws Throwable {
        String signature = pjp.getSignature().toString();
        Object[] parameters = pjp.getArgs();
        Object clazz = pjp.getSignature().getDeclaringType();

        long startTime = System.currentTimeMillis();
        Object result = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - startTime;

        log.info("class: "+clazz);
        log.info(signature+ " execution time: "+elapsedTime+" ms");
        log.info("return value: "+result.toString());
        return result;
    }



    @Before("com.springboot.app.aop.PointCuts.inWebLayer() && com.springboot.app.aop.PointCuts.noParameter()")
    public void beforeAdvice(JoinPoint joinPoint) {
        log.info("Web Layer Before Advice");
        log.info("" + joinPoint.getSignature());
    }

    @AfterReturning(value = "bean(testController)", returning = "res")
    public void afterReturningAdvice(Object res){
        log.info("Web Layer After Returning Advice ");
        log.info("The return value is "+res.toString());
    }

    @AfterThrowing(value = "bean(testController)",throwing = "ex")
    public void afterThrowingAdvice(Exception ex){
        log.info("Web Layer After Throwing:");
        log.error(ex.toString());
    }

    @After("com.springboot.app.aop.PointCuts.inWebLayer1()")
    public void afterAdvice(JoinPoint joinPoint){
        log.info("Web Layer After Advice");
        log.info(""+joinPoint.getSignature());
    }

    @Before("com.springboot.app.aop.PointCuts.inServiceLayer2() && com.springboot.app.aop.PointCuts.noParameter()")
    public void beforeServiceAdvice(JoinPoint joinPoint){
        log.info("Service Layer Before Advice ");
    }

    @After("com.springboot.app.aop.PointCuts.inServiceLayer2() && com.springboot.app.aop.PointCuts.noParameter()")
    public void afterServiceAdvice(JoinPoint joinPoint){
        log.info("Service Layer After Advice ");
    }
}



//    @Before
//    try{
//        return res;
//        @AfterReturning
//    }
//    catch(){
//        @AfterThrowing
//    }finally(){
//        @After
//    }