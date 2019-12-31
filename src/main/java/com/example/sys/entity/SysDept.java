package com.example.sys.entity;

import lombok.Data;

@Data
public class SysDept {

    private Integer deptid;
    private Integer parent_id;
    private String  name;
    private Integer order_num;
    private Boolean del_flag;

}
