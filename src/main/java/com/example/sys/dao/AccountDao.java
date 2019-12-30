package com.example.sys.dao;

import com.example.sys.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountDao {
    List<Account> getAccountList();
}
