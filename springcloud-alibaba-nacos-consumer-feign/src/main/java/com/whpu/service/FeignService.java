package com.whpu.service;

import com.whpu.service.impl.FallbackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "nacos-provider",fallback = FallbackServiceImpl.class)
public interface FeignService {
    @GetMapping(value="/test/{message}")
    public String test(@PathVariable("message") String message);
}
