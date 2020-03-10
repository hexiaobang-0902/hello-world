//package com.hxb.cloud.security;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @author garen
// * 关闭新版spring cloud的security默认启用了csrf检验
// */
//@EnableWebSecurity
//public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        super.configure(http);
//    }
//}