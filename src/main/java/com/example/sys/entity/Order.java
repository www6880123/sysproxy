package com.example.sys.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order {

    private String oid;
    private Integer sid;
    private String gid;
    private String title;
    private String mainimg;
    private Integer aid;
    private String nickname;
    private Double money;
    private Integer number;
    private String prepayid;
    private String state;
    private String tid;
    private String recname;
    private String tel;
    private String sheng;
    private String shi;
    private String xian;
    private String info;
    private Date createDate;
    private Date payDate;
    private Date overDate;

}
