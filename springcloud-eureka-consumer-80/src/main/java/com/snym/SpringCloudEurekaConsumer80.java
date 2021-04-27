package com.snym;

import com.snym.config.MyRibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 主启动类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/4/25 14:21
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="SPRINGCLOUD-EUREKA-DEPT",configuration= MyRibbonRule.class)
public class SpringCloudEurekaConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaConsumer80.class, args);
    }
}
