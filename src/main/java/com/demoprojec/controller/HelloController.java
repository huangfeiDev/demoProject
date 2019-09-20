package com.demoprojec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author huangfei
 * @createTime 2019/9/20 10:35
 * @description
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }
}
