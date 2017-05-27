package com.kchen.dubbo.demo.service.account.impl;


import com.kchen.dubbo.demo.api.domain.Result;
import com.kchen.dubbo.demo.api.service.AccountService;
import com.kchen.dubbo.demo.api.service.entity.AccountDTO;
import com.kchen.dubbo.demo.api.service.entity.AccountException;
import com.kchen.dubbo.demo.dao.domain.AccountDO;
import com.kchen.dubbo.demo.dao.domain.AccountDOExample;
import com.kchen.dubbo.demo.dao.mapper.AccountMapper;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Result<AccountDTO> login(String userName, String password) throws AccountException {

        final Result<AccountDTO> result = new Result<>();

        AccountDOExample example = new AccountDOExample();
        AccountDOExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);
        List<AccountDO> accountList = null;
        try {
            accountList = accountMapper.selectByExampleWithBLOBs(example);
            result.setSuccess(true);
        } catch (Exception e) {
            result.setSuccess(false);
            throw new AccountException("db error", e);
        }

        result.setSuccess(true);
        if (CollectionUtils.isNotEmpty(accountList)) {
            result.setModel(convertDomain(accountList.get(0)));
        }

        return result;
    }

    static private AccountDTO convertDomain(AccountDO accountDO) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setUserId(accountDO.getId());
        accountDTO.setUserName(accountDO.getUserName());
        accountDTO.setPhone(accountDO.getPhone());
        accountDTO.setEmail(accountDO.getEmail());

        return accountDTO;
    }
}
