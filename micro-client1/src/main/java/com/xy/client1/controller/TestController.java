package com.xy.client1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: TestController
 * @Description: TODO
 * @author liusg
 * @date 2018/5/8 15:21
 * @version V1.0
 */
@RestController
public class TestController {



    @RequestMapping(value = "api/{test}/{1}")
    public String test1(@PathVariable(value = "test")String test,@PathVariable(value = "1")String param){
        System.out.println("---------port------------8762");
        return "---------port------------8762---";
    }
}
