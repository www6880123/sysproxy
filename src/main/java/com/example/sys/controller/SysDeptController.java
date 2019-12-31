package com.example.sys.controller;

import com.example.sys.entity.SysDept;
import com.example.sys.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/sysdept")
public class SysDeptController {
    @Autowired
    private SysDeptService sysDeptService;

    @GetMapping("/getSysDeptList")
    public ModelAndView getSysDeptList(){
        ModelAndView modelAndView = new ModelAndView();
        List<SysDept> sysDeptList = sysDeptService.getSysDeptList();
        modelAndView.addObject("sysDeptList",sysDeptList);
        return modelAndView;
    }

}
