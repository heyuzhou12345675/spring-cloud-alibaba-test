package com.zcy.controller;

import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Date 2020-10-26 13:53
 * @Created by ATRI
 */

@RestController
@Slf4j
public class OderNacosController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @RequestMapping("/consumer/getRandomNum/{id}")
    public String payMentInfo(@PathVariable("id") long id){

        return restTemplate.getForObject(serverUrl+"/getOnePeople/"+id,String.class);
    }
}
