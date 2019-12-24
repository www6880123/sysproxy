package com.example.sys.dao;

import com.example.sys.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserDao {
    SysUser loginUser(@Param("username") String username, @Param("password") String password);
}
