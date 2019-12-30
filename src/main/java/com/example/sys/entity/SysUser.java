package com.example.sys.entity;

import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Data
public class SysUser {

    private Integer userid;
    private String username;
    private String password;
    private String salt;
    private String email;
    private String mobile;
    private Integer status;
    private BigInteger deptid;
    private Date createtime;

}
