package com.zcy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Date 2020-10-28 16:12
 * @Created by ATRI
 */

@RestController
@Slf4j
public class FolwLimitController {

    @GetMapping("/testA")
    public String testA(){
//        try {
//            TimeUnit.MILLISECONDS.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "千年狮";
    }

    @RequestMapping("/testB")
    public String testB(){
        log.info(Thread.currentThread().getName()+"\t"+".....testB");
        return "巫女";
    }
}
