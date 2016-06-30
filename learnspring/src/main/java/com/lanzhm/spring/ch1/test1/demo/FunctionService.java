package com.lanzhm.spring.ch1.test1.demo;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
	public String sayHello(String word){
		return "Hello "+word;
	}
}
