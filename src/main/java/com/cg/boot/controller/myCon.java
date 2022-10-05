package com.cg.boot.controller;

import com.cg.boot.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myCon {
    @Autowired
    private Car car;

    @RequestMapping("/car")
    public Car getCar() {
        return car;
    }

    @RequestMapping("/index2")
    public String bootTest(){
        return "springBoot hello 希望你不要像ssm一样不识好歹，跑着跑着bug就来了";
    }
}
