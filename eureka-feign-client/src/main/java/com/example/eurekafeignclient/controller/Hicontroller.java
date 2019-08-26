package com.example.eurekafeignclient.controller;

import com.example.eurekafeignclient.service.HiService;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.management.snmp.AdaptorBootstrap;


/**
 * @program: springCloud
 * @description:
 * @author: Ming.Li
 * @create: 2019-08-24 15:21
 **/
@RestController
public class Hicontroller {
    @Autowired
    HiService service;

    @GetMapping("sayhi")
    public String sayHi(@RequestParam(defaultValue = "forezp",required = false)String name){
        return service.sayHi(name);
    }
}
