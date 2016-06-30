package com.lanzhm.spring.ch1.test1.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFunctionService {
	
	@Autowired
	private FunctionService functionService;
	
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
}
