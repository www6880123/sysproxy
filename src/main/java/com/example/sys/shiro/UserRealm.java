package com.example.sys.shiro;

import com.example.sys.entity.SysUser;
import com.example.sys.service.SysService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private SysService sysService;

    //执行授权逻辑
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");
        return null;
    }


    //执行认证逻辑
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        SysUser token = (SysUser)authenticationToken;
        SysUser sysUser = sysService.loginUser(token.getUsername(),token.getPassword());
        //找不到用户名
        if(!token.getUsername().equals(sysUser.getUsername())){
            return null;
        }
        System.out.println("执行认证逻辑");
        return new SimpleAuthenticationInfo("",token.getPassword(),"");
    }
}
