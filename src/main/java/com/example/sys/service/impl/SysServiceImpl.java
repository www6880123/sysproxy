package com.example.sys.service.impl;

import com.example.sys.dao.SysUserDao;
import com.example.sys.entity.SysUser;
import com.example.sys.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysServiceImpl implements SysService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override

    public SysUser loginUser(String username,String password) {
        return sysUserDao.loginUser(username, password);
    }
}
