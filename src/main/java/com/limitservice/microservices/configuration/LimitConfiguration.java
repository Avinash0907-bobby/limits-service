package com.limitservice.microservices.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limit-service")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class LimitConfiguration {
    private int min;
    private int max;
}
