package com.cyh.ribbon.service;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author cyh
 * @Date 20:41 2018/5/3
 * @description
 * @since 2.0
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;



    public String getHello(){
       return restTemplate.getForObject("http://client/index",String.class);
    }


}
