package com.example.sys.dao;

import com.example.sys.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysUserDao {
    SysUser loginUser(@Param("username") String username, @Param("password") String password);

    SysUser findUserByName(@Param("username") String username);

    String findPermsById(@Param("userId") Integer id);

    List<SysUser> getSysUserList();
}
