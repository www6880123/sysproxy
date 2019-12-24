package com.example.sys.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Withdrawal {

    private Integer wid;
    private Integer aid;
    private String nickname;
    private Integer money;
    private String state;
    private Date createDate;
    private String zfb;
    private String xing;
    private String note;
    private Double gomoney;
    private Date overDate;

}
