package com.example.sys.service.impl;

import com.example.sys.dao.SysDeptDao;
import com.example.sys.entity.SysDept;
import com.example.sys.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Autowired
    private SysDeptDao sysDeptDao;

    @Override
    public List<SysDept> getSysDeptList() {
        return sysDeptDao.getSysDeptList();
    }
}
