package com.snym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 主启动类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/4/25 14:21
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudEurekaConsumerFeign80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaConsumerFeign80.class, args);
    }
}
