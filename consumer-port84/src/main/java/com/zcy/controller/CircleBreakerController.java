package com.zcy.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zcy.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Date 2020-11-09 14:10
 * @Created by ATRI
 */

@RestController
@Slf4j
public class CircleBreakerController {
    public static  final  String SERVICE_URL = "http://nacos-payment-provider";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/fallback/{id}")
    //@SentinelResource(value = "fallback")
    /**
     * fallback只负责业务异常   比如代码逻辑异常*/
    //@SentinelResource(value = "fallback",fallback ="handlerFallback")
    /**
     * bockHandler只负责sentinel控制台违规   比如访问超过限流次数*/
    //@SentinelResource(value = "fallback",blockHandler = "blockHandler")
    @SentinelResource(value = "fallback",fallback ="handlerFallback",blockHandler = "blockHandler")
    public String fallback(@PathVariable Long id) {
       String result = restTemplate.getForObject(SERVICE_URL + "/paymentSQL/" + id,String.class,id);

        if(id==4){
            throw new IllegalArgumentException("IllegalArgument ,非法参数异常...");
        }else if(result.contains("null")) {
            throw new NullPointerException("NullPointerException,该ID没有对应记录，空指针异常~");
        }

        return  result;
    }


    public String handlerFallback(@PathVariable Long id,Throwable e) {
        return "异常handlerFallback，exception内容： " + e.getMessage();
    }


    public String blockHandler(@PathVariable Long id, BlockException e) {
        return "blockHandler-sentinel 限流，BlockException： " + e.getMessage();
    }

    //======= OpenFeign
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/paymentSQL/{id}")
    public String paymentSQL(@PathVariable("id") Long id){
        return paymentService.paymentSQL(id);
    }
}
