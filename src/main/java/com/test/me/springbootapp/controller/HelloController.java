package com.test.me.springbootapp.controller;

import com.test.me.springbootapp.model.Hello;
import com.test.me.springbootapp.services.Helloservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/v1")
public class HelloController {
    private Helloservice helloservice;

    public HelloController(Helloservice helloservice) {
        this.helloservice = helloservice;
    }

    @GetMapping("/greet")
    public Hello greet(){
      Hello hello= helloservice.getHello();
      return hello;
    }
}
