package com.example.sys.dao;

import com.example.sys.entity.SysDept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysDeptDao {
    List<SysDept> getSysDeptList();

}
