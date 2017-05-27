package com.kchen.dubbo.demo.provider.config.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.kchen.dubbo.demo.service"})
public class ServiceConfig {

}
