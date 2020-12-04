package com.zcy.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020-11-10 10:38
 * @Created by ATRI
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public String byResource() {
        return  "200按照资源名称限流测试，2020L+serial001";
    }

    public String handleException(BlockException exception) {
        return  "444,exception.getClass().getCanonicalName() + \t 服务不可用";
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public String byUrl() {
        return  "200,按照byUrl限流测试2020L,serial002";
    }

    //CustomerBlockHandler
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = String.class,blockHandler = "handlerException2")
    public String customerBlockHandler() {
        return  "200,按照客户自定义限流测试(2020L,serial003";
    }
}
