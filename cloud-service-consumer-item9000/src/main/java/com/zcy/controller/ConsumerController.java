package com.zcy.controller;

import com.zcy.entity.AppDeHistory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * （自定义类描述）
 *
 * @author ATRI
 * @Date 2020-12-03 14:46
 **/

@RestController
@Slf4j
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;


//    @GetMapping(value = "/consumer/payment/nacos/{id}")
////    public String paymentInfo(@PathVariable("id") Integer id) {
////        return restTemplate.getForObject(serverURL + "/payment/nacos/" + id,String.class);
////    }

    @RequestMapping("")
    public AppDeHistory testUseProvider(){
        //我在这应该调用多个service啊,service呢？
        return null;
    }
}
