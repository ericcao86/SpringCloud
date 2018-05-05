package com.cyh.feign.controller;

import com.cyh.feign.interfaces.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cyh
 * @Date 9:45 2018/5/4
 * @description
 * @since 2.0
 */
@RestController
public class HelloController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "getIndex")
    public String getIndex(){
        return schedualServiceHi.sayHiFromClientOne();
    }
}
