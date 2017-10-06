package com.bk.safetyBK.module.resourceManage.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * @Author: wenjiahui
 * @Description:
 * @Date: 0:45 2017/10/4
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.bk.safetyBK")
public class WebConfig extends WebMvcConfigurerAdapter {

}