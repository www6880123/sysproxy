package com.example.sys.service.impl;

import com.example.sys.dao.WithdrawalDao;
import com.example.sys.entity.Withdrawal;
import com.example.sys.service.WithdrawalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WithdrawalServiceImpl implements WithdrawalService {
    @Autowired
    private WithdrawalDao withdrawalDao;

    @Override
    public List<Withdrawal> findWithdrawalById(Integer id) {
        return withdrawalDao.findWithdrawalById(id);
    }
}
