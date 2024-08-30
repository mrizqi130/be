package com.example.demo_22;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoFilter {
    @RequestMapping("test")
    public String name(){
        return "DemoFilter";
    }
}