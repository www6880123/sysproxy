package com.example.sys.controller;

import com.example.sys.entity.Order;
import com.example.sys.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/getOrderList")
    public ModelAndView withdrawList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Order> orderList = orderService.getOrderList();
        modelAndView.addObject("orderList",orderList);
        return modelAndView;
    }
}
