package com.example.eurekafeignclient.service;

import com.example.eurekafeignclient.config.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springCloud
 * @description: ${description}
 * @author: Ming.Li
 * @create: 2019-08-24 15:19
 **/
@Service
public class HiService {
    @Autowired
    EurekaClientFeign feign;
    public String sayHi(String name){
        return feign.sayHi(name);
    }
}
