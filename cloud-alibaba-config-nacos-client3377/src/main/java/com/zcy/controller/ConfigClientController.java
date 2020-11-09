package com.zcy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020-10-27 10:09
 * @Created by ATRI
 */

@RestController
//支持nacos动态刷新功能，实现配置自动刷新功能
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @RequestMapping("/getConfigInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
