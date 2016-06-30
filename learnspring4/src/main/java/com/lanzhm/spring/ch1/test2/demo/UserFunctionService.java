package com.lanzhm.spring.ch1.test2.demo;

import org.springframework.stereotype.Service;

@Service
public class UserFunctionService {
	
	FunctionService functionService;
	
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
}
