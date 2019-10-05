package com.test.service;

import com.test.model.Account;

import java.util.List;

public interface AccountService {

    void saveAccount(Account account);

    List<Account> findAll();
}
