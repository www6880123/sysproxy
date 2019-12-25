package com.example.sys.shiro;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("DefaultWebSecurityManager")DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        //shiro内置过滤器，可以实现权限相关的拦截
        /*
        * anon:无需认证
        * authc:必须认证
        * user:如果使用rememberMe的功能可以直接访问
        * perms:该资源必须得到资源权限才能访问
        * role:该资源必须得到角色权限权限才可以访问
        * */
        Map<String,String> filterMap = new LinkedHashMap<String,String>();
        //拦截页面
        filterMap.put("","");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);

        shiroFilterFactoryBean.setLoginUrl("login");
        return shiroFilterFactoryBean;
    }

    @Bean(name = "DefaultWebSecurityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("UserRealm")UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    @Bean(name = "UserRealm")
    public UserRealm getRealm(){
        return  new UserRealm();
    }
}
