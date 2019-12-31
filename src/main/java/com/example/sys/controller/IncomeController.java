package com.example.sys.controller;

import com.example.sys.entity.Income;
import com.example.sys.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/income")
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    @GetMapping("/getIncomeList")
    public ModelAndView getSysDeptList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Income> incomeList = incomeService.getIncomeList();
        modelAndView.addObject("incomeList",incomeList);
        return modelAndView;
    }

}
