package com.cyh.feign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author cyh
 * @Date 9:43 2018/5/4
 * @description
 * @since 2.0
 */
@FeignClient(value = "client")
public interface SchedualServiceHi {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String sayHiFromClientOne();
}
