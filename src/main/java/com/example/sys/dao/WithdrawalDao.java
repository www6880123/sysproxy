package com.example.sys.dao;

import com.example.sys.entity.Withdrawal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WithdrawalDao {

    List<Withdrawal> findWithdrawalById(@Param("aid") Integer id);

}
