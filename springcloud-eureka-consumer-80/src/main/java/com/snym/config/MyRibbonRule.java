package com.snym.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon配置类
 *
 * @author lzs
 * @version 1.0
 * @date 2021/4/27 15:16
 */
@Configuration
public class MyRibbonRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
