package com.muates.springbootgiris.controller;

import com.muates.springbootgiris.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    /**
     * localhost:8080/hello/get
     * @return
     */
    @GetMapping("/get")
    public String hello() {
        return "Hello World!";
    }

    /**
     * localhost:/8080/hello/post
     * @param value
     * @return
     */
    @PostMapping("/post")
    public String sayHello(@RequestBody String value) {
        return helloWorldService.sayHello(value);
    }

    /*
    GET ->
    POST -> bodyden gelen istekler için kullanılır
    PUT -> update için kullanılır + olarak id alır
    DELETE -> silme işlemi için + olarak id alır
     */

}
