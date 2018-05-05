package com.cyh.ribbon.controller;

import com.cyh.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cyh
 * @Date 20:51 2018/5/3
 * @description
 * @since 2.0
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;


    @RequestMapping(value = "gethello")
    public String getHello(){
        return helloService.getHello();
    }
}
