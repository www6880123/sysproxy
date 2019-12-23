package com.example.sys.dao;

import com.example.sys.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

@Mapper
public interface SysUserDao {
    SysUser loginUser(@PathVariable("username") String username,@PathVariable("password") String password);
}
