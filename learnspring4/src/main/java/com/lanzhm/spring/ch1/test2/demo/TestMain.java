package com.lanzhm.spring.ch1.test2.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lanzhm.spring.ch1.test2.config.Config;

public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		UserFunctionService userService = context.getBean(UserFunctionService.class);
		String hello = userService.sayHello("lanzhm");
		System.out.println(hello);
		context.close();
	}

}
