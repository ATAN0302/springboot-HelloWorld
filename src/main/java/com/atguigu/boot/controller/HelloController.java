package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 阿谭
 * <p>
 * 2022-09-20 14:37
 */
@Slf4j
@RestController
public class HelloController {
    @Autowired
    Car car;

    @RequestMapping("/hello2")
    public String handle01(){
        log.info("请求进来了---");
        return "Hello , Spring Boot 2 1!"+"你好";
    }

    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}
