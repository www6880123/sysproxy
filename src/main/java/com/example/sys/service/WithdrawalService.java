package com.example.sys.service;

import com.example.sys.entity.Withdrawal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WithdrawalService {

    List<Withdrawal> findWithdrawalById(Integer id);
}
