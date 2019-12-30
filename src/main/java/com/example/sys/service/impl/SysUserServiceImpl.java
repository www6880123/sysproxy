package com.example.sys.service.impl;

import com.example.sys.dao.SysUserDao;
import com.example.sys.entity.SysUser;
import com.example.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override

    public SysUser loginUser(String username,String password) {
        return sysUserDao.loginUser(username, password);
    }

    @Override
    public SysUser findUserByName(String username) {
        return sysUserDao.findUserByName(username);
    }

    @Override
    public String findPermsById(Integer id) {
        return sysUserDao.findPermsById(id);
    }
}
