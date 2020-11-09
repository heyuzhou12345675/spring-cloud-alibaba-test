package com.zcy.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Date 2020-10-26 13:50
 * @Created by ATRI
 */

@Configuration
public class ApplicationContextConfig {

    @Bean
    /**
     * LoadBalanced注解，就能让这个RestTemplate在请求时拥有客户端负载均衡的能力
     * */
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
