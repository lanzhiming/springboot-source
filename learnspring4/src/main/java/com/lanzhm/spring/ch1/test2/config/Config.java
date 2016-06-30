package com.lanzhm.spring.ch1.test2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lanzhm.spring.ch1.test2.demo.FunctionService;
import com.lanzhm.spring.ch1.test2.demo.UserFunctionService;

@Configuration
public class Config {
	@Bean
	public FunctionService functionService(){
		FunctionService functionService = new FunctionService();
		return functionService;
	}
	
	@Bean
	public UserFunctionService userFunctionService(){
		UserFunctionService userFunctionService=new UserFunctionService();
		userFunctionService.setFunctionService(functionService());
		return userFunctionService;
	}
	
	@Bean
	public UserFunctionService userFunctionService(FunctionService functionService){
		UserFunctionService userFunctionService=new UserFunctionService();
		userFunctionService.setFunctionService(functionService);
		return userFunctionService;
	}
	
	
}
