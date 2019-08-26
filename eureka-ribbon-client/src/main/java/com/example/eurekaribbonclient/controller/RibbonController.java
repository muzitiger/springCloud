package com.example.eurekaribbonclient.controller;

import com.example.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springCloud
 * @description: ${description}
 * @author: Ming.Li
 * @create: 2019-08-23 13:52
 **/
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService ;
    @GetMapping("sayhi")
    public String hi(@RequestParam( required = false , defaultValue =
            "forezp") String name) {
        return ribbonService.hi(name);
    }}
