package com.whpu.service.impl;

import com.whpu.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FallbackServiceImpl implements FeignService {
    @Override
    public String test(String message) {
        return "test fallback";
    }
}
