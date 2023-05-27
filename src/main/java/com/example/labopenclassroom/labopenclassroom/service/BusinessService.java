package com.example.labopenclassroom.labopenclassroom.service;

import org.springframework.stereotype.Component;

import com.example.labopenclassroom.labopenclassroom.model.HelloWord;

@Component
public class BusinessService {
    public HelloWord getHelloWorld(){
        HelloWord hello = new HelloWord();
        return hello;
    };
}
