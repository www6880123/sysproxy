package com.example.sys.dao;

import com.example.sys.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    List<Order> getOrderList();
}
