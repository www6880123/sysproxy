package com.example.sys.service;

import com.example.sys.entity.SysUser;

public interface SysUserService {
    SysUser loginUser(String username,String password);

    SysUser findUserByName(String username);

    String findPermsById(Integer id);
}
