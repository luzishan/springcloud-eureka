package com.snym;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 主启动类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/4/25 15:50
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureka7003 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka7003.class, args);
    }
}
