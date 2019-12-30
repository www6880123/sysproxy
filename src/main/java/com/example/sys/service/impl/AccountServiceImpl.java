package com.example.sys.service.impl;

import com.example.sys.dao.AccountDao;
import com.example.sys.entity.Account;
import com.example.sys.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> getAccountList() {
        return accountDao.getAccountList();
    }
}
