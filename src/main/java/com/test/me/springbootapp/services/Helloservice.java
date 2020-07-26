package com.test.me.springbootapp.services;

import com.test.me.springbootapp.model.Hello;
import org.springframework.stereotype.Service;

@Service
public class Helloservice {
    private Hello hello;

    public Helloservice(Hello hello) {
        this.hello = hello;
    }



    public Hello getHello() {
        String msg="Hello, I am here what can I help you";
        hello.setMessage(msg);
        return hello;
    }
}
