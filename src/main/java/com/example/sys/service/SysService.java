package com.example.sys.service;

import com.example.sys.entity.SysUser;

public interface SysService {
    SysUser loginUser(String username,String password);
}
