package com.mouritech.ordermanagementsystemwithrestcontroller.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = 
{"com.mouritech.ordermanagementsystemwithrestcontroller.controller"})
public class WebMvcConfig  extends WebMvcConfigurerAdapter{
	
	

}
