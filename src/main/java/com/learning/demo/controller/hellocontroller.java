package com.learning.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//这个类的所有方法返回的数据直接写给浏览器，如果是对象返回json数据
/*@ResponseBody
@Controller*/
@RestController
public class hellocontroller {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }

}
