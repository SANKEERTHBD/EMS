package com.example.ems_backend;

import org.springframework.stereotype.Component;

@Component
public class Project {
    private final  Dev dev;

    public Project(Dev dev){
        this.dev=dev;
    }
    public void show(){
        dev.build();
}
    }
