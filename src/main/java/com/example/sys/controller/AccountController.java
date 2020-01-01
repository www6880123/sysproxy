package com.example.sys.controller;

import com.example.sys.entity.Account;
import com.example.sys.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accountList")
    public ModelAndView withdrawList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Account> accountList = accountService.getAccountList();
        modelAndView.addObject("accountList",accountList);
        return modelAndView;
    }


}
