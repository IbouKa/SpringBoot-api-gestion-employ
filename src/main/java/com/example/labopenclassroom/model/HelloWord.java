package com.example.labopenclassroom.model;

import io.micrometer.observation.annotation.Observed;

public class HelloWord {
    String value="Hello World!";
    @Observed
    public String toString(){
        return this.value;
    };
    
}
