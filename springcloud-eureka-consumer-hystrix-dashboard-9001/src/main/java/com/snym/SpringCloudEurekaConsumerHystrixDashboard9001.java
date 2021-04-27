package com.snym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 主启动类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/4/27 17:14
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableHystrix
public class SpringCloudEurekaConsumerHystrixDashboard9001 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaConsumerHystrixDashboard9001.class, args);
    }
}
