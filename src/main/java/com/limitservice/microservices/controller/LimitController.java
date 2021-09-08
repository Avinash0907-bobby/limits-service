package com.limitservice.microservices.controller;

import com.limitservice.microservices.configuration.LimitConfiguration;
import com.limitservice.microservices.dto.LimitVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private LimitConfiguration limitConfiguration;

    @GetMapping("/limits")
    public LimitVO getMaxMinLimits(){
        return new LimitVO(limitConfiguration.getMin(), limitConfiguration.getMax());
    }
}
