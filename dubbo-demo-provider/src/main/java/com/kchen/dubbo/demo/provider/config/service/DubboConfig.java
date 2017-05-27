package com.kchen.dubbo.demo.provider.config.service;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:dubbo-provider.xml")
public class DubboConfig {

}
