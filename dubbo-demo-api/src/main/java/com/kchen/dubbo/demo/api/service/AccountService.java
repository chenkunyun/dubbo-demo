package com.kchen.dubbo.demo.api.service;


import com.kchen.dubbo.demo.api.domain.Result;
import com.kchen.dubbo.demo.api.service.entity.AccountDTO;
import com.kchen.dubbo.demo.api.service.entity.AccountException;


public interface AccountService {
    Result<AccountDTO> login(String userName, String password) throws AccountException;
}
