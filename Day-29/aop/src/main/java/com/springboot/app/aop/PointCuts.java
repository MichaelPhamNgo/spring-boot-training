package com.springboot.app.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointCuts {

    @Pointcut("within(com.springboot.app.controller.*)")
    public void inWebLayer() {}

    @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
    public void inWebLayer1(){}

    @Pointcut("within(com.springboot.app.service..*)")
    public void inServiceLayer() {}

    @Pointcut("execution(* com.springboot.app.service..*.*(..))")
    public void inServiceLayer1() {}

    @Pointcut("bean(*Service)")
    public void inServiceLayer2(){}

    @Pointcut("within(com.springboot.app.dao..*)")
    public void inDataAccessLayer() {}

    @Pointcut("execution(* com.springboot.app.dao.*.getUserName*(..))")
    public void dataAccessOperation() {}

    @Pointcut("args()")
    public void noParameter(){}
}
