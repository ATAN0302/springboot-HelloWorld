package com.atguigu.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 阿谭
 * <p>
 * 2022-09-20 15:18
 */
@RestController

public class WorldController {
    @RequestMapping("/w")
    public String world66(){
        return "world";
    }
}
