package com.example.sys.controller;

import com.example.sys.entity.Withdrawal;
import com.example.sys.service.WithdrawalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/withdraw")
public class WithdrawalController {

    @Autowired
    private WithdrawalService withdrawalService;

    @GetMapping("/withdrawList")
    public ModelAndView withdrawList(Integer id){
        ModelAndView modelAndView = new ModelAndView();
        List<Withdrawal> withdrawList = withdrawalService.findWithdrawalById(id);
        modelAndView.addObject("withdrawList",withdrawList);
        return modelAndView;
    }
}
