package com.test.service.impl;

import com.test.mapper.AccountMapper;
import com.test.model.Account;
import com.test.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 20190712713
 * @date 2019/10/5 16:22
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public void saveAccount(Account account) {
        accountMapper.saveAccount(account);
    }

    @Override
    public List<Account> findAll() {

        return accountMapper.findAll();
    }
}
