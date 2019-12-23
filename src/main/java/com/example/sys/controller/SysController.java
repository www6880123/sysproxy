package com.example.sys.controller;

import com.example.sys.entity.SysUser;
import com.example.sys.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys")
public class SysController {

    @Autowired
    private SysService sysService;

    @PostMapping("/login")
    public String login(String username,String password){
        SysUser sysUserLogin = sysService.loginUser(username,password);
        if(sysUserLogin!=null){
            return "index";
        }
        return "";
    }

}
