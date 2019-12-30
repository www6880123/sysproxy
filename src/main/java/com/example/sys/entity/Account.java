package com.example.sys.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Account {

    //`aid` `nickname` `openid` `payopenid` `bfpayopenid``username``password``head``level``balance``datamoy``quota``pid``lock``coungWith``countMoney``daymoney``createDate``lable`

    private Integer aid;
    private String nickname;
    private String openid   ;
    private String payopenid;
    private String bfpayopenid;
    private String username;
    private String password;
    private String head;
    private String level;
    private BigDecimal balance;
    private BigDecimal datamoy;
    private BigDecimal quota;
    private Integer pid;
    private String lock;
    private Double coungWith;
    private Double countMoney;
    private Double daymoney;
    private Date createDate;
    private String lable;

}
