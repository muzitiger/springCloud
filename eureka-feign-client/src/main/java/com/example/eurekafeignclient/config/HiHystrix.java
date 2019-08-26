package com.example.eurekafeignclient.config;

import org.springframework.stereotype.Component;

/**
 * @program: springCloud
 * @description: ${description}
 * @author: Ming.Li
 * @create: 2019-08-24 17:10
 **/
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHi(String name) {
        return "hi,"+name +"sorry,error!HiHystrix";
    }
}
