package com.kchen.dubbo.demo.provider.config.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kchen on 2017/3/1.
 */

@Configuration
@ComponentScan(basePackages = {"com.kchen.dubbo.demo.service"})
public class ServiceConfig {

}
