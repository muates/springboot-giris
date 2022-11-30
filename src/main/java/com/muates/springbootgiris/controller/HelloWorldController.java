package com.muates.springbootgiris.controller;

import com.muates.springbootgiris.model.dto.request.MatematikToplaRequest;
import com.muates.springbootgiris.service.MatematikServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    private MatematikServis matematikServis;

    /**
     * localhost:8080/hello/v1
     * @return
     */
    @GetMapping("/v1")
    public String helloWorld() {
        return "Hello World";
    }

    /**
     * localhost:8080/hello/v2
     * @param request
     * @return
     */
    @PostMapping("/v2")
    public Integer topla(@RequestBody MatematikToplaRequest request) {
        return matematikServis.topla(request);
    }
}
