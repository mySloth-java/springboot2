package com.cg.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myCon {
    @RequestMapping("/index")
    public String bootTest(){
        return "springBoot hello";
    }
}
