package com.example.sys.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Income {

    private Integer lid;
    private Integer aid;
    private Double money;
    private Integer pid;
    private String note;
    private String oid;
    private Date createDate;

}
