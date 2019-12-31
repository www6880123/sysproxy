package com.example.sys.dao;

import com.example.sys.entity.Income;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IncomeDao {
    List<Income> getIncomeList();
}
