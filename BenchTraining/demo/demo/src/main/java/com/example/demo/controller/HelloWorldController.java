package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1")
public class HelloWorldController {

    @Autowired
    public HelloService helloService;

    @GetMapping("/hello-world")
    public String helloWorld(){
      //return "Hello World Niko Pogi";
        return helloService.hello();
    };
}

