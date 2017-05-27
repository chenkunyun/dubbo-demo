package com.kchen.dubbo.demo.test.dao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kchen on 2017/3/1.
 * dao config
 */
@Configuration
@MapperScan(basePackages = {"com.kchen.storage.dao.mapper.domain"})
public class DaoConfig {
}
