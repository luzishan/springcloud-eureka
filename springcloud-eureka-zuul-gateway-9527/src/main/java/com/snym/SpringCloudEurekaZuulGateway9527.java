package com.snym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author lzs
 * @version 1.0
 * @date 2021/4/28 9:26
 */
@SpringBootApplication
@EnableZuulProxy
public class SpringCloudEurekaZuulGateway9527 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaZuulGateway9527.class, args);
    }
}
