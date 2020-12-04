package com.zcy.service;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Date 2020-11-09 14:20
 * @Created by ATRI
 */
@Component
public class PaymentFallbackService implements PaymentService{


    @Override
    public String paymentSQL(Long id) {
        return "服务降级返回，---PaymentFallbackService"+id+"---ErrorSerial";
    }
}