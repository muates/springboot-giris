package com.muates.springbootgiris.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {
    /*
    @Before(value = "execution(* com.muates.springbootgiris.service.impl.HelloWorldServiceImpl.*(..))")
    public void calismadanOnce() {
        System.out.println("A");
    }

    @After(value = "execution(* com.muates.springbootgiris.service.impl.HelloWorldServiceImpl.*(..))")
    public void calistiktanSonra() {
        System.out.println("B");
    }

     */

}
