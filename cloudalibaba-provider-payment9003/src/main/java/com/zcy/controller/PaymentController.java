package com.zcy.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Description TODO
 * @Date 2020-11-09 10:55
 * @Created by ATRI
 */

@RestController
public class PaymentController {

    @Value("${server.port}")
    private  String serverPort;

    public static HashMap<Long, String > map = new HashMap<>();
    static {
        map.put(1L,"词不达意");
        map.put(2L,"语遥无期");
        map.put(3L,"语遥");
    }


    @GetMapping(value = "/paymentSQL/{id}")
    public String paymentSQL(@PathVariable("id") Long id) {
        String msg=map.get(id);
        return msg+",未来遥不可及"+id+"之9003端口";
    }
}
