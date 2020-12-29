package com.whpu.controller;

import com.whpu.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NacosConsumerFeignController {
    @Resource
    private FeignService feignService;

    @GetMapping(value="/test/hi")
    public String test(){
        return feignService.test("Hi Feign");
    }
}
