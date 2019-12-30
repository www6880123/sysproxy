package com.example.sys.controller;

import com.example.sys.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sys")
public class SysController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping("/login/{username}/{password}")
    public String login(@PathVariable("username") String username, @PathVariable("password") String password, Model model){
        //获取subject
        Subject subject = SecurityUtils.getSubject();
        //封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
            return "redirect:/index";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg","用户名不存在");
            return "/login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg","密码错误");
            return "/login";
        }
    }

    @GetMapping("/index")
    public void index(){
        System.out.println("111");
    }

}
