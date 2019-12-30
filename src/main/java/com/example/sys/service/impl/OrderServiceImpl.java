package com.example.sys.service.impl;

import com.example.sys.dao.OrderDao;
import com.example.sys.entity.Order;
import com.example.sys.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> getOrderList() {
        return orderDao.getOrderList();
    }
}
