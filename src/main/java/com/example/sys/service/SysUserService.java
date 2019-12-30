package com.example.sys.service;

import com.example.sys.entity.SysUser;

import java.util.List;

public interface SysUserService {
    SysUser loginUser(String username,String password);

    SysUser findUserByName(String username);

    String findPermsById(Integer id);

    List<SysUser> getSysUserList();
}
