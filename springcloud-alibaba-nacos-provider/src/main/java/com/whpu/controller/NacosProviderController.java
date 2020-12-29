package com.whpu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String serverPort;

    //注入配置文件
    @Resource
    private ConfigurableApplicationContext applicationContext;
     @GetMapping(value="/test/{message}")
    public String test(@PathVariable String message){
         return  "Hello Nacos Discovery"+message +"\t"+"I am from serverPort"+"\t"+serverPort;
     }

     //从上下文中读取配文件
    @GetMapping(value="/hi")
    public String sayHi() {
        return "Hello " + applicationContext.getEnvironment().getProperty("user.name");
    }
}
