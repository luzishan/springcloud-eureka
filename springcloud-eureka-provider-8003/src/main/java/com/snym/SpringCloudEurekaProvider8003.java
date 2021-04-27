package com.snym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 主启动类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/4/23 15:47
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaProvider8003 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaProvider8003.class, args);
    }
}
