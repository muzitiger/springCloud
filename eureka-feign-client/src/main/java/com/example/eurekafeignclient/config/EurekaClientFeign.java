package com.example.eurekafeignclient.config;

import com.example.eurekafeignclient.feign.FeignConfigs;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: springCloud
 * @description: ${description}
 * @author: Ming.Li
 * @create: 2019-08-24 15:11
 **/
@FeignClient(value = "eureka-client",configuration = FeignConfigs.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {
    @GetMapping("sayhi")
    String sayHi(@RequestParam(value = "name") String name);
}
