package com.kchen.dubbo.demo.provider.config.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.kchen.dubbo.demo.dao.mapper"})
public class DaoConfig {
}
