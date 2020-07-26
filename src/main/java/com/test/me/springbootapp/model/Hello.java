package com.test.me.springbootapp.model;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    private String message;

    public Hello() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "message='" + message + '\'' +
                '}';
    }
}
