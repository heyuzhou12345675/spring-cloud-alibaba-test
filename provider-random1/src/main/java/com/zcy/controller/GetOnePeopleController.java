package com.zcy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020-10-23 16:28
 * @Created by ATRI
 */


@RestController
public class GetOnePeopleController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getOnePeople/{id}")
    public String getOnePeople(@PathVariable("id") long id){
        return "Hello Nacos Discovery: " + serverPort + "\t" +id ;
    }
}
