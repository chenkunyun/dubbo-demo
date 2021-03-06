package com.kchen.dubbo.demo.test.service.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.kchen.storage.dao.mapper.domain"})
public class DaoConfig {
}
