package com.kchen.dubbo.demo.test.service.account;

import com.kchen.dubbo.demo.api.service.AccountService;
import com.kchen.dubbo.demo.api.service.entity.AccountException;
import com.kchen.dubbo.demo.dao.domain.AccountDO;
import com.kchen.dubbo.demo.dao.mapper.AccountMapper;
import com.kchen.dubbo.demo.test.service.Application;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.security.MessageDigest;

/**
 * Created by kchen on 2017/3/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class AccountTest {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void loginTest() throws AccountException {
        Assert.assertNull(accountService.login("", ""));
    }

    @Test
    public void addAccount() {
        AccountDO account = new AccountDO();
        account.setUserName("admin");

        String salt = RandomStringUtils.random(32,true, true);
        account.setSalt(salt);

        MessageDigest sha256Digest = DigestUtils.getSha256Digest();
        sha256Digest.update(salt.getBytes());
        byte[] password = sha256Digest.digest("123456".getBytes());
        account.setPassword(password);

        account.setEmail("1111111@gmail.com");
        account.setEnabled(1);
        account.setNickName("nickname");
        account.setRole("admin");
        account.setPhone("12345678900");
        accountMapper.insert(account);
    }

    @Test
    public void randomTest() {
        System.out.println(RandomStringUtils.random(32,true, true));
    }
}
