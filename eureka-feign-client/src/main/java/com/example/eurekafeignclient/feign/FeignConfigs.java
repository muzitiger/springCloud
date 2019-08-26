package com.example.eurekafeignclient.feign;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @program: springCloud
 * @description: ${description}
 * @author: Ming.Li
 * @create: 2019-08-24 15:16
 **/
@Configuration
public class FeignConfigs {
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100, SECONDS.toMillis(1), 5);
    }
}
