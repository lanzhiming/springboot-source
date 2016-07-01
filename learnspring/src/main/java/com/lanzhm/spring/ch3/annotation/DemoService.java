package com.lanzhm.spring.ch3.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	public void outputResult(){
		System.out.println("组合注解");
	}
}
