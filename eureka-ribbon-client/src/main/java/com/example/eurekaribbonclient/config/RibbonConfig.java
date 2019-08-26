package com.example.eurekaribbonclient.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springCloud
 * @description: ${description}
 * @author: Ming.Li
 * @create: 2019-08-23 13:37
 **/
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    RestTemplate resttemplate() {
     return new RestTemplate();
    }

}
