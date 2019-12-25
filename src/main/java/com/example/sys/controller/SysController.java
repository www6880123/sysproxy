package com.example.sys.controller;

import com.example.sys.entity.SysUser;
import com.example.sys.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/sys")
public class SysController {

    @Autowired
    private SysService sysService;

    @PostMapping("/login/{username}/{password}")
    public String login(@PathVariable("username") String username,@PathVariable("password") String password, HttpServletResponse response){
        SysUser sysUserLogin = sysService.loginUser(username,password);
        System.out.println(sysUserLogin.getUserid());
        if(sysUserLogin!=null){
            return "有这个账号";
        }else {
            return "无这个账号";
        }
    }

    @GetMapping("index")
    public void index(){
        System.out.println("111");
    }

}
