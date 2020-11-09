package com.zcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaConfigNacosClient3377Application {

	public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(CloudAlibabaConfigNacosClient3377Application.class, args);
//        String userName = applicationContext.getEnvironment().getProperty("user.name");
//        String userAge = applicationContext.getEnvironment().getProperty("user.age");
//        System.err.println("user name :" +userName+"; age: "+userAge);
		SpringApplication.run(CloudAlibabaConfigNacosClient3377Application.class, args);
	}

}
