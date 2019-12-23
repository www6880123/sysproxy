package com.example.sys.entity;

import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Data
public class SysUser {

    private BigInteger userid;
    private String username;
    private String password;
    private String salt;
    private String email;
    private String mobile;
    private Double status;
    private BigInteger deptid;
    private Date createtime;

}
