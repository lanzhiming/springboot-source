package com.lanzhm.spring.ch2.testel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
		
		ResourceService resourceService= context.getBean(ResourceService.class);
		
		resourceService.outputResource();
		
		context.close();
	}

}
