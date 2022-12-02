package com.muates.springbootgiris.service.impl;

import com.muates.springbootgiris.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String sayHello(String value) {
        return "Hello, " + value;
    }
}
