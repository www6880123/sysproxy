package com.example.sys.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Address {

    private Integer id;
    private Integer aid;
    private String recname;
    private String tel;
    private String province;
    private String city;
    private String area;
    private String info;
    private Integer def;
    private Date createDate;

}
