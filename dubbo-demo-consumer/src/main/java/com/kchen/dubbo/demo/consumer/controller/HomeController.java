package com.kchen.dubbo.demo.consumer.controller;


import com.kchen.dubbo.demo.api.domain.Result;
import com.kchen.dubbo.demo.api.service.AccountService;
import com.kchen.dubbo.demo.api.service.entity.AccountDTO;
import com.kchen.dubbo.demo.api.service.entity.AccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/")
    public AccountDTO home() {
        Result<AccountDTO> result = null;
        try {
            result = accountService.login("admin", "");
        } catch (AccountException e) {
            throw new RuntimeException(e);
        }
        return result.getModel();
    }
}
