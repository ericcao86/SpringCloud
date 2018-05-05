package com.clientcloud.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cyh
 * @Date 16:29 2018/5/3
 * @description
 * @since 2.0
 */
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/index")
    public String getHello(){
        System.out.println("执行到client端了");
        return "hello";
    }
}
