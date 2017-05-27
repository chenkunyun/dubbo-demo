package com.kchen.dubbo.demo.test.dao.account;

import com.kchen.dubbo.demo.dao.domain.AccountDO;
import com.kchen.dubbo.demo.dao.mapper.AccountMapper;
import com.kchen.dubbo.demo.test.dao.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNull;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class AccountTest {

    @Autowired
    private AccountMapper mapper;

    @Test
    public void accountTest() {
        AccountDO accountDO = mapper.selectByPrimaryKey(Long.valueOf(-1));
        assertNull(accountDO);
    }
}
