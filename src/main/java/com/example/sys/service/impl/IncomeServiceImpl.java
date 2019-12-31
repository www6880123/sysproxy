package com.example.sys.service.impl;

import com.example.sys.dao.IncomeDao;
import com.example.sys.entity.Income;
import com.example.sys.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeServiceImpl implements IncomeService {

    @Autowired
    private IncomeDao incomeDao;

    @Override
    public List<Income> getIncomeList() {
        return incomeDao.getIncomeList();
    }
}
