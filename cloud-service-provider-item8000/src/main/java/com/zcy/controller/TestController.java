package com.zcy.controller;

import com.zcy.entity.AppDeHistory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * （自定义类描述）
 *
 * @author ATRI
 * @Date 2020-12-03 14:17
 **/

@RestController
public class TestController {


    @Value("${server.port}")
    private String serverPort;



    @RequestMapping("/getOneHistory")
    public AppDeHistory getOneHistory(){
        return null;
    }
}
